package com.kanayaya.BitrixFluentWebhooks;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.kanayaya.BitrixFluentWebhooks.api.Method;
import com.kanayaya.BitrixFluentWebhooks.api.request.BitrixFormRequest;
import com.kanayaya.BitrixFluentWebhooks.exceptions.BitrixException;
import com.kanayaya.BitrixFluentWebhooks.exceptions.BitrixNotAuthorizedException;
import com.kanayaya.BitrixFluentWebhooks.exceptions.BitrixSessionExpiredException;

import java.io.IOException;
import java.net.CookieManager;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Supplier;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public interface BitrixSessionClient extends BitrixClient {
    SessionManager getSessionManager();

    @Override
    default String host() {
        return getSessionManager().host;
    }

    @Override
    default HttpClient client() {
        return getSessionManager().client;
    }

    @Override
    default HttpRequest request(Method method, Map<String, Object> params) {
        return getSessionManager().prepareRequest(method, params);
    }

    @Override
    default JsonNode invoke(Method method, Map<String, Object> params) {
        try {
            return BitrixClient.super.invoke(method, params);
        } catch (BitrixNotAuthorizedException e) {
            getSessionManager().refresh();
        }
        return BitrixClient.super.invoke(method, params);
    }

    class SessionManager {
        private final HttpClient client;
        private String bitrixSessionId;
        private String bitrixSessionExtension;
        private final String login;
        private final Supplier<String> passwordProvider;
        private final String host;

        public SessionManager(String host, String login, String password, Supplier<String> passwordProvider, boolean refreshSessionWhileNotActive) {
            this.client = HttpClient.newBuilder()
                    .followRedirects(HttpClient.Redirect.ALWAYS)
                    .cookieHandler(new CookieManager()).build();
            this.host = (host.startsWith("http")? "" : "https://") +
                    host +
                    (host.endsWith("/")? "" : "/");
            authorize(this.host, login, password);
            this.login = login;
            this.passwordProvider = passwordProvider;
        }

        private void authorize(String host, String login, String password) {
            URI uri;
            try {
                uri = new URI(host + "?login=yes");
            } catch (URISyntaxException e) {
                throw new BitrixException("Wrong host syntax: " + host);
            }
            HttpRequest authorization = HttpRequest.newBuilder()
                    .uri(uri)
                    .POST(HttpRequest.BodyPublishers.ofString("AUTH_FORM=Y&TYPE=AUTH&backurl=%2F&" + String.format("USER_LOGIN=%s&USER_PASSWORD=%s", login, password)))
                    .header("content-type", "application/x-www-form-urlencoded").build();
            HttpResponse<String> response;
            try {
                response = client.send(authorization, HttpResponse.BodyHandlers.ofString());
            } catch (IOException e) {
                throw new BitrixNotAuthorizedException("Could not authorize as " + login + ", server may be unreachable", e);
            } catch (InterruptedException e) {
                throw new BitrixNotAuthorizedException("Could not authorize as " + login + ", request interrupted", e);
            }

            Pattern bxSessionPattern = Pattern.compile("bxSession\\.Expand\\('(\\w+)\\.(\\w+)'\\)", Pattern.MULTILINE);
            Matcher m = bxSessionPattern.matcher(response.body());
            if (m.find()) {
                this.bitrixSessionId = m.group(1);
                this.bitrixSessionExtension = m.group(2);
            } else {
                throw new BitrixNotAuthorizedException("Could not get bitrix session for \"" + login + "\", maybe, wrong password." +
                        " Last response uri is: " + response.uri());
            }
        }

        public void refresh() {
            Optional.ofNullable(passwordProvider).map(Supplier::get).ifPresentOrElse(password -> authorize(host, login, password),
                    () -> {
                throw new BitrixSessionExpiredException(
                        "Session for \"" + login + "\" expired and no password have been provided to refresh it");
            });
        }
        public HttpRequest prepareRequest(Method method, Map<String, Object> params) {
            params = params == null? new HashMap<>() : new HashMap<>(params);
            URI uri;
            try {
                uri = new URI(host + "rest/" + method.jsonName() + '/');
            } catch (URISyntaxException e) {
                throw new RuntimeException(e);
            }
            params.put("sessid", bitrixSessionId);
            return new BitrixFormRequest(uri, params);
        }
    }
}

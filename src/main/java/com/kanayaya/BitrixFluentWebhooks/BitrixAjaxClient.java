package com.kanayaya.BitrixFluentWebhooks;

import com.kanayaya.BitrixFluentWebhooks.api.Method;
import com.kanayaya.BitrixFluentWebhooks.api.request.UrlBodyMaker;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Map;

public interface BitrixAjaxClient {
    String host();
    HttpClient client();
    HttpRequest request(Method method, Map<String, Object> params);

    default HttpResponse<String> invokeAjax(
            String componentNamespace,
            String componentName,
            Mode mode,
            String action,
            Map<String, Object> params) {

        String host = (host().startsWith("http")? "" : "https://") +
                host() +
                (host().endsWith("/")? "" : "/");

        try {
            return client().send(HttpRequest.newBuilder().uri(
                    new URI(host +
                            "/bitrix/services/main/ajax.php?mode="
                            + mode.getName() + "&c=" + componentNamespace
                            + "%3A" + componentName + "&action=" + action + "&" +
                            UrlBodyMaker.buildQueryString(params)
                    )).GET()
                    .build(), HttpResponse.BodyHandlers.ofString());
        } catch (IOException | InterruptedException | URISyntaxException e) {
            throw new RuntimeException(e);
        }
    }



    enum Mode {
        CLASS("class"),
        AJAX("ajax"),
        ;
        private final String name;

        Mode(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }
}

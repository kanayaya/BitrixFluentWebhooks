package com.kanayaya.BitrixFluentWebhooks.api.request;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.kanayaya.BitrixFluentWebhooks.api.Method;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpHeaders;
import java.net.http.HttpRequest;
import java.time.Duration;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

public class WebhookJsonRequest extends HttpRequest {
    private static final ObjectMapper MAPPER = new ObjectMapper();
    private final Object body;
    private final URI uri;

    public WebhookJsonRequest(@NotNull String host, @NotNull String token, @NotNull Long userId, @NotNull Method restMethod, @Nullable Object body) {
        this.body = body;
        String modifiedHost = host.startsWith("http") ? host : "https://" + host;
        try {
            uri = new URI(modifiedHost +
                    (modifiedHost.endsWith("/")? "rest/" : "/rest/") +
                    userId + "/" +
                    token + "/" +
                    restMethod.jsonName() + "/");
        } catch (URISyntaxException e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public Optional<BodyPublisher> bodyPublisher() {
        try {
            return Optional.of(BodyPublishers.ofString(MAPPER.writeValueAsString(body)));
        } catch (JsonProcessingException e) {
            throw new IllegalStateException("body violates json processing rules: " + body, e);
        }
    }

    @Override
    public String method() {
        return "POST";
    }

    @Override
    public Optional<Duration> timeout() {
        return Optional.empty();
    }

    @Override
    public boolean expectContinue() {
        return false;
    }

    @Override
    public URI uri() {
        return uri;
    }

    @Override
    public Optional<HttpClient.Version> version() {
        return Optional.of(HttpClient.Version.HTTP_2);
    }

    @Override
    public HttpHeaders headers() {
        return HttpHeaders.of(Map.of("Content-Type", List.of("application/json")), (s1, s2) -> true);
    }

    @Override
    public String toString() {
        StringBuilder httpString = new StringBuilder();

        httpString.append(method()).append(" ")
                .append(uri()).append(" ").append(version().map(Objects::toString).orElse("")).append("\r\n");

        HttpHeaders headers = headers();
        headers.map().forEach((key, values) -> {
            for (String value : values) {
                httpString.append(key).append(": ").append(value).append("\r\n");
            }
        });

        httpString.append("\r\n");

        httpString.append(body == null? "" : MAPPER.valueToTree(body).toPrettyString());

        return httpString.toString();
    }
}

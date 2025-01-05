package com.kanayaya.BitrixFluentWebhooks.api.request;

import com.kanayaya.BitrixFluentWebhooks.api.Method;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.net.URI;
import java.net.URISyntaxException;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpHeaders;
import java.net.http.HttpRequest;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class WebhookRequest extends HttpRequest {
    private final HttpRequest inner;

    public WebhookRequest(@NotNull String host, @NotNull String token, @NotNull Long userId, @NotNull Method restMethod) {
        this(host, token, userId, restMethod, null);
    }
    public WebhookRequest(@NotNull String host, @NotNull String token, @NotNull Long userId, @NotNull Method restMethod, @Nullable List<Map.Entry<String, String>> params) {
        this(makeUri(host, token, userId, restMethod, params));
    }
    private WebhookRequest(String fullUrl) {
        URI uri;
        try {
            uri = new URI(fullUrl);
        } catch (URISyntaxException e) {
            throw new RuntimeException(e);
        }
        this.inner = HttpRequest.newBuilder()
                .uri(uri)
                .GET()
                .build();
    }
    private static @NotNull String makeUri(@NotNull String host, @NotNull String token, @NotNull Long userId, @NotNull Method restMethod, @Nullable List<Map.Entry<String, String>> params) {
        String paramsString = Optional.ofNullable(params)
                .stream()
                .flatMap(Collection::stream)
                .map(e -> URLEncoder.encode(e.getKey(), StandardCharsets.UTF_8) + "=" + URLEncoder.encode(e.getValue(), StandardCharsets.UTF_8))
                .collect(Collectors.joining("&", "?", ""));
        String modifiedHost = host.startsWith("http") ? host : "https://" + host;
        return modifiedHost +
                (modifiedHost.endsWith("/")? "rest/" : "/rest/") +
                userId + "/" +
                token + "/" +
                restMethod.jsonName() + "/" +
                (paramsString.length() < 2? "" : paramsString);
    }

    @Override
    public Optional<BodyPublisher> bodyPublisher() {
        return inner.bodyPublisher();
    }

    @Override
    public String method() {
        return null;
    }

    @Override
    public Optional<Duration> timeout() {
        return inner.timeout();
    }

    @Override
    public boolean expectContinue() {
        return inner.expectContinue();
    }

    @Override
    public URI uri() {
        return inner.uri();
    }

    @Override
    public Optional<HttpClient.Version> version() {
        return inner.version();
    }

    @Override
    public HttpHeaders headers() {
        return inner.headers();
    }

    public HttpRequest inner() {
        return inner;
    }
}

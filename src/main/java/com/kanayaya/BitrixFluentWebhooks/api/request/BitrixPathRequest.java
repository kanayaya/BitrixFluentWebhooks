package com.kanayaya.BitrixFluentWebhooks.api.request;

import com.kanayaya.BitrixFluentWebhooks.api.Method;
import com.kanayaya.BitrixFluentWebhooks.api.request.filter.UrlBodyMaker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpHeaders;
import java.net.http.HttpRequest;
import java.time.Duration;
import java.util.Map;
import java.util.Optional;

public class BitrixPathRequest extends HttpRequest {
    private final HttpRequest inner;

    public BitrixPathRequest(@NotNull String host, @NotNull String token, @NotNull Long userId, @NotNull Method restMethod) {
        this(host, token, userId, restMethod, null);
    }
    public BitrixPathRequest(@NotNull String host, @NotNull String token, @NotNull Long userId, @NotNull Method restMethod, @Nullable Map<String, Object> params) {
        this(makeUri(host, token, userId, restMethod, params));
    }
    private BitrixPathRequest(String fullUrl) {
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
    private static @NotNull String makeUri(@NotNull String host, @NotNull String token, @NotNull Long userId, @NotNull Method restMethod, @Nullable Map<String, Object> params) {
        String paramsString = Optional.ofNullable(params)
                .map(map -> "?" + UrlBodyMaker.buildQueryString(map))
                .orElse("");

        String modifiedHost = host.startsWith("http") ? host : "https://" + host;
        return modifiedHost +
                (modifiedHost.endsWith("/")? "rest/" : "/rest/") +
                userId + "/" +
                token + "/" +
                restMethod.jsonName() + "/" +
                paramsString;
    }

    @Override
    public Optional<BodyPublisher> bodyPublisher() {
        return inner.bodyPublisher();
    }

    @Override
    public String method() {
        return inner.method();
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

    @Override
    public String toString() {
        return inner.toString();
    }
}

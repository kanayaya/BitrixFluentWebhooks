package com.kanayaya.BitrixFluentWebhooks.api;

import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpHeaders;
import java.net.http.HttpRequest;
import java.time.Duration;
import java.util.Optional;

public class WebhookRequest extends HttpRequest {
    private final HttpRequest inner;

    public WebhookRequest(String host, Method restMethod) throws URISyntaxException {
        this.inner = HttpRequest.newBuilder()
                .uri(new URI(host))
                .GET().header("d", "")
                .timeout(Duration.ofSeconds(10)).build();
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
}

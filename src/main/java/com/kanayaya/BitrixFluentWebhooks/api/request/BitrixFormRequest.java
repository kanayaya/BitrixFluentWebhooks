package com.kanayaya.BitrixFluentWebhooks.api.request;

import com.kanayaya.BitrixFluentWebhooks.api.request.filter.UrlBodyMaker;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpHeaders;
import java.net.http.HttpRequest;
import java.time.Duration;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class BitrixFormRequest extends HttpRequest {
    private final URI uri;
    private final String urlencodedBody;

    public BitrixFormRequest(URI uri, Map<String, Object> params) {
        this.uri = uri;
        this.urlencodedBody = UrlBodyMaker.buildQueryString(params);
    }

    @Override
    public Optional<BodyPublisher> bodyPublisher() {
        return Optional.of(BodyPublishers.ofString(urlencodedBody));
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
        return HttpHeaders.of(Map.of("Content-Type", List.of("application/x-www-form-urlencoded")), (s1, s2) -> true);
    }
}

package com.kanayaya.BitrixFluentWebhooks;

import com.kanayaya.BitrixFluentWebhooks.api.Method;
import com.kanayaya.BitrixFluentWebhooks.api.request.BitrixPathRequest;

import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.util.Map;

public interface BitrixWebhookClient extends BitrixRestClient {
    TokenSecret token();
    Long userId();

    @Override
    default HttpClient client() {
        return HttpClient.newHttpClient();
    }

    @Override
    default HttpRequest request(Method method, Map<String, Object> params) {
        return new BitrixPathRequest(host(), token().token(), userId(), method, params);
    }

}

package com.kanayaya.BitrixFluentWebhooks;

import com.fasterxml.jackson.databind.JsonNode;
import com.kanayaya.BitrixFluentWebhooks.api.Method;
import com.kanayaya.BitrixFluentWebhooks.api.request.filter.MutableFilter;
import com.kanayaya.BitrixFluentWebhooks.api.request.BitrixPathRequest;
import com.kanayaya.BitrixFluentWebhooks.model.tables.User;

import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.util.Map;

public interface BitrixWebhookClient extends BitrixClient {
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

    default JsonNode getUsersString(String name) {
        return invoke(Method.USER_GET, new MutableFilter<User>().field(User.NAME).contains(name).getParams());
    }

}

package com.kanayaya.BitrixFluentWebhooks;

import com.kanayaya.BitrixFluentWebhooks.api.Method;
import com.kanayaya.BitrixFluentWebhooks.api.request.MutableFilter;
import com.kanayaya.BitrixFluentWebhooks.api.request.WebhookJsonRequest;
import com.kanayaya.BitrixFluentWebhooks.api.request.WebhookPathRequest;
import com.kanayaya.BitrixFluentWebhooks.model.tables.User;

import java.io.IOException;
import java.net.http.HttpClient;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.util.Map;

public interface BitrixWebhookClient {
    String host();
    TokenSecret token();
    Long userId();

    default String getUsersString(String name) {
        return invoke(Method.USER_GET, new MutableFilter<User>().field(User.NAME).contains(name).getParams());
    }

    default String invoke(Method method) {
        return invoke(method, null);
    }
    default String invoke(Method method, Map<String, Object> params) {
        WebhookJsonRequest request = new WebhookJsonRequest(host(), token().token(), userId(), method, params);
        System.out.println(request);

        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString(StandardCharsets.UTF_8));
            return response.body();
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}

package com.kanayaya.BitrixFluentWebhooks;

import com.kanayaya.BitrixFluentWebhooks.api.Method;
import com.kanayaya.BitrixFluentWebhooks.api.request.PathFilterBuilder;
import com.kanayaya.BitrixFluentWebhooks.api.request.WebhookRequest;
import com.kanayaya.BitrixFluentWebhooks.model.tables.User;

import java.io.IOException;
import java.net.http.HttpClient;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Map;

public interface BitrixWebhookClient {
    String host();
    TokenSecret token();
    Long userId();

    default String getUsersString(String name) {
        WebhookRequest request = new WebhookRequest(host(), token().token(), userId(), Method.USER_CURRENT, new PathFilterBuilder<User>().field(User.NAME).contains(name).getParameters());

        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpResponse<String> response = client.send(request.inner(), HttpResponse.BodyHandlers.ofString(StandardCharsets.UTF_8));
            return response.body();
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    default String invoke(Method method) {
        return invoke(method, null);
    }
    default String invoke(Method method, List<Map.Entry<String, String>> params) {
        WebhookRequest request = new WebhookRequest(host(), token().token(), userId(), method, params);

        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpResponse<String> response = client.send(request.inner(), HttpResponse.BodyHandlers.ofString(StandardCharsets.UTF_8));
            return response.body();
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}

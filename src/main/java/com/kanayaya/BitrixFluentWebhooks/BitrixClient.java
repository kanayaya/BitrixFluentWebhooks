package com.kanayaya.BitrixFluentWebhooks;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.kanayaya.BitrixFluentWebhooks.api.Method;
import com.kanayaya.BitrixFluentWebhooks.api.methods.UserMethods;
import com.kanayaya.BitrixFluentWebhooks.exceptions.ExceptionHandler;

import java.io.IOException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.util.Map;

public interface BitrixClient {
    String host();
    HttpClient client();
    HttpRequest request(Method method, Map<String, Object> params);
    default JsonNode invoke(Method method) {
        return invoke(method, null);
    }
    default JsonNode invoke(Method method, Map<String, Object> params) {
        HttpRequest request = request(method, params);
        try {
            HttpClient client = client();
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString(StandardCharsets.UTF_8));
            JsonNode responseBody = new ObjectMapper().readTree(response.body());
            ExceptionHandler.handleResponse(responseBody);
            return responseBody;
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    default UserMethods user() {
        return new UserMethods(this);
    }
}

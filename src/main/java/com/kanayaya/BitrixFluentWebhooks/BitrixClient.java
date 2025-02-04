package com.kanayaya.BitrixFluentWebhooks;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.kanayaya.BitrixFluentWebhooks.api.Method;
import com.kanayaya.BitrixFluentWebhooks.api.methods.UserMethods;
import com.kanayaya.BitrixFluentWebhooks.exceptions.BitrixException;
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
        HttpResponse<String> response;
        try {
            response = client().send(request, HttpResponse.BodyHandlers.ofString());
        } catch (IOException e) {
            throw new BitrixException("Exception while sending request to " + host() + ". Maybe server is out of reach", e);
        } catch (InterruptedException e) {
            throw new BitrixException("Request interrupted", e);
        }
        try {
            JsonNode responseNode = new ObjectMapper().readTree(response.body());
            ExceptionHandler.handleResponse(responseNode);
            return responseNode;
        } catch (JsonProcessingException e) {
            throw new BitrixException("Server response doesn't match json rules", e);
        }
    }

    default UserMethods user() {
        return new UserMethods(this);
    }
}

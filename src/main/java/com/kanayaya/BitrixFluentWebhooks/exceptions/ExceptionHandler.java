package com.kanayaya.BitrixFluentWebhooks.exceptions;

import com.fasterxml.jackson.databind.JsonNode;

import java.util.Map;
import java.util.function.Function;

public class ExceptionHandler {
    private static final Map<String, Function<String, RuntimeException>> exceptions = Map.of(
            "ACCESS_DENIED", BitrixAccessDeniedException::new
    );

    public static void handleResponse(JsonNode response) {
        if (! response.has("error")) {
            return;
        }
        String errorKey = response.get("error").asText();
        String errorDescription = response.has("error_description")? response.get("error_description").asText() : "";
        throw exceptions.getOrDefault(errorKey, BitrixException::new).apply(errorKey + ": " + errorDescription);
    }
}

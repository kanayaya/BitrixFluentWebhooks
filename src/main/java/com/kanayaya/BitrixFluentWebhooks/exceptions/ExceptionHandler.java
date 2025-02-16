package com.kanayaya.BitrixFluentWebhooks.exceptions;

import com.fasterxml.jackson.databind.JsonNode;

import java.util.Map;
import java.util.function.BiFunction;

public class ExceptionHandler {
    private static final Map<String, BiFunction<String, String, RuntimeException>> exceptions = Map.of(
            "ACCESS_DENIED", BitrixAccessDeniedException::new,
            "access_denied: User not authorized", BitrixNotAuthorizedException::new,
            "ERROR_ARGUMENT", BitrixIllegalParamsException::new,
            "WRONG_AUTH_TYPE", BitrixOauth2RequiredException::new,
            "INVALID_CREDENTIALS", BitrixAccessDeniedException::new
    );

    public static void handleResponse(JsonNode response) {
        if (! response.has("error")) {
            return;
        }
        String errorKey = response.get("error").asText();
        String errorDescription = response.has("error_description")? response.get("error_description").asText() : "";
        throw exceptions.getOrDefault(errorKey + ": " + errorDescription,
                    exceptions.getOrDefault(errorKey,
                            BitrixException::new))
                .apply(errorKey, errorDescription);
    }
}

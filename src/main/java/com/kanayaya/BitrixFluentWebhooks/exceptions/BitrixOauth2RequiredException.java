package com.kanayaya.BitrixFluentWebhooks.exceptions;

public class BitrixOauth2RequiredException extends BitrixException {
    public BitrixOauth2RequiredException() {
    }

    public BitrixOauth2RequiredException(String message) {
        super(message);
    }

    public BitrixOauth2RequiredException(String message, Throwable cause) {
        super(message, cause);
    }

    public BitrixOauth2RequiredException(Throwable cause) {
        super(cause);
    }

    public BitrixOauth2RequiredException(String errorKey, String errorDescription) {
        super(errorKey, errorDescription);
    }
}

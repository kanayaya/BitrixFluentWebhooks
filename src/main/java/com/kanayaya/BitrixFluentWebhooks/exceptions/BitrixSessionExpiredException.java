package com.kanayaya.BitrixFluentWebhooks.exceptions;

public class BitrixSessionExpiredException extends BitrixNotAuthorizedException {
    public BitrixSessionExpiredException() {
    }

    public BitrixSessionExpiredException(String message) {
        super(message);
    }

    public BitrixSessionExpiredException(String message, Throwable cause) {
        super(message, cause);
    }

    public BitrixSessionExpiredException(Throwable cause) {
        super(cause);
    }

    public BitrixSessionExpiredException(String errorKey, String errorDescription) {
        super(errorKey, errorDescription);
    }
}

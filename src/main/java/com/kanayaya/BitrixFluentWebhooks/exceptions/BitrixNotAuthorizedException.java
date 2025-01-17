package com.kanayaya.BitrixFluentWebhooks.exceptions;

public class BitrixNotAuthorizedException extends BitrixException {
    public BitrixNotAuthorizedException() {
    }

    public BitrixNotAuthorizedException(String message) {
        super(message);
    }

    public BitrixNotAuthorizedException(String message, Throwable cause) {
        super(message, cause);
    }

    public BitrixNotAuthorizedException(Throwable cause) {
        super(cause);
    }
}

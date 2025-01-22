package com.kanayaya.BitrixFluentWebhooks.exceptions;

public class BitrixAccessDeniedException extends BitrixException {
    public BitrixAccessDeniedException() {
    }

    public BitrixAccessDeniedException(String message) {
        super(message);
    }

    public BitrixAccessDeniedException(String message, Throwable cause) {
        super(message, cause);
    }

    public BitrixAccessDeniedException(Throwable cause) {
        super(cause);
    }
}

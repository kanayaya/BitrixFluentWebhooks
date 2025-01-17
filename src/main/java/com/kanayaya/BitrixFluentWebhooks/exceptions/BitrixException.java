package com.kanayaya.BitrixFluentWebhooks.exceptions;

public class BitrixException extends RuntimeException {
    public BitrixException() {
    }

    public BitrixException(String message) {
        super(message);
    }

    public BitrixException(String message, Throwable cause) {
        super(message, cause);
    }

    public BitrixException(Throwable cause) {
        super(cause);
    }
}

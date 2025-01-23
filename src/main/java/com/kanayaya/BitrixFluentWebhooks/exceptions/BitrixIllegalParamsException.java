package com.kanayaya.BitrixFluentWebhooks.exceptions;

public class BitrixIllegalParamsException extends BitrixException {
    public BitrixIllegalParamsException() {
    }

    public BitrixIllegalParamsException(String message) {
        super(message);
    }

    public BitrixIllegalParamsException(String message, Throwable cause) {
        super(message, cause);
    }

    public BitrixIllegalParamsException(Throwable cause) {
        super(cause);
    }

    public BitrixIllegalParamsException(String errorKey, String errorDescription) {
        super(errorKey, errorDescription);
    }
}

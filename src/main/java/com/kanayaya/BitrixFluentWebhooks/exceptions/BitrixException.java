package com.kanayaya.BitrixFluentWebhooks.exceptions;

public class BitrixException extends RuntimeException {
    private final String key;
    private final String description;
    public BitrixException() {
        key = "";
        description = "";
    }

    public BitrixException(String message) {
        super(message);
        key = "";
        description = "";
    }

    public BitrixException(String message, Throwable cause) {
        super(message, cause);
        key = "";
        description = message;
    }

    public BitrixException(Throwable cause) {
        super(cause);
        key = "";
        description = cause.toString();
    }
    public BitrixException(String errorKey, String errorDescription) {
        super(getErrorString(errorKey, errorDescription));
        this.key = errorKey == null? "" : errorKey;
        this.description = errorDescription == null? "" : errorDescription;
    }
    private static String getErrorString(String errorKey, String errorDescription) {
        if (errorKey == null) errorKey = "";
        if (errorDescription == null) errorDescription = "";
        return errorKey + (! errorKey.isEmpty() && ! errorDescription.isEmpty()? ": " : "") + errorDescription;
    }
    private boolean noKey() {
        return key.isEmpty();
    }

    public String getKey() {
        return key;
    }

    public String getDescription() {
        return description;
    }
}

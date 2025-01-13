package com.kanayaya.BitrixFluentWebhooks.model.enums;

import com.fasterxml.jackson.annotation.JsonValue;

public enum YN {
    Y("Y"),
    N("N"),
    EMPTY("")
    ;
    private final String value;

    YN(String value) {
        this.value = value;
    }
    @JsonValue
    public String getStringValue() {
        return value;
    }
    public boolean isY() {
        return this == Y;
    }
    public boolean isN() {
        return this == N;
    }
    public boolean isEmpty() {
        return this == EMPTY;
    }

    @Override
    public String toString() {
        return value;
    }
}

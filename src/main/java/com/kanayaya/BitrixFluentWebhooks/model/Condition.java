package com.kanayaya.BitrixFluentWebhooks.model;

import java.util.Map;

public class Condition<TABLE extends Table> {
    private final String prefix;
    private final String name;
    private final Object value;

    public Condition(String prefix, String name, Object value) {
        this.prefix = prefix;
        this.name = name;
        this.value = value;
    }
    public Condition(String name, Object value) {
        this("", name, value);
    }
    public Map.Entry<String, Object> toParam() {
        return Map.entry(prefix + name, value);
    }
}

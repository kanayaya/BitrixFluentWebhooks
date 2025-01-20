package com.kanayaya.BitrixFluentWebhooks.model.enums;

public enum SettingsMode {
    CLASSIC(1, "Классическая CRM"),
    SIMPLE(2, "Простая CRM"),
    ;
    private final int id;
    private final String name;

    SettingsMode(int id, String name) {
        this.id = id;
        this.name = name;
    }
}


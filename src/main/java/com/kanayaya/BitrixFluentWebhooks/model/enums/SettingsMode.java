package com.kanayaya.BitrixFluentWebhooks.model.enums;

public enum SettingsMode {
    SETTINGSMODE_1(1, "Классическая CRM"),
    SETTINGSMODE_2(2, "Простая CRM"),
    ;
    private final int id;
    private final String name;

    SettingsMode(int id, String name) {
        this.id = id;
        this.name = name;
    }
}


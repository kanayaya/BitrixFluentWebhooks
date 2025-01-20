package com.kanayaya.BitrixFluentWebhooks.model.enums;

public enum Activitypriority {
    EMPTY(0, ""),
    LOW(1, "низкая"),
    MEDIUM(2, "средняя"),
    HIGH(3, "высокая"),
    ;
    private final int id;
    private final String name;

    Activitypriority(int id, String name) {
        this.id = id;
        this.name = name;
    }
}



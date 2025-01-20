package com.kanayaya.BitrixFluentWebhooks.model.enums;

public enum Activitypriority {
    EMPTY(0, ""),
    ACTIVITYPRIORITY_1(1, "низкая"),
    ACTIVITYPRIORITY_2(2, "средняя"),
    ACTIVITYPRIORITY_3(3, "высокая"),
    ;
    private final int id;
    private final String name;

    Activitypriority(int id, String name) {
        this.id = id;
        this.name = name;
    }
}



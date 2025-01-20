package com.kanayaya.BitrixFluentWebhooks.model.enums;

public enum Activitydirection {
    EMPTY(0, ""),
    ACTIVITYDIRECTION_1(1, "Входящее"),
    ACTIVITYDIRECTION_2(2, "Исходящее"),
    ;
    private final int id;
    private final String name;

    Activitydirection(int id, String name) {
        this.id = id;
        this.name = name;
    }
}



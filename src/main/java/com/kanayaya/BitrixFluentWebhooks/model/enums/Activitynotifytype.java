package com.kanayaya.BitrixFluentWebhooks.model.enums;

public enum Activitynotifytype {
    EMPTY(0, ""),
    MINUTES(1, "мин."),
    HOURS(2, "ч."),
    DAYS(3, "дн."),
    ;
    private final int id;
    private final String name;

    Activitynotifytype(int id, String name) {
        this.id = id;
        this.name = name;
    }
}



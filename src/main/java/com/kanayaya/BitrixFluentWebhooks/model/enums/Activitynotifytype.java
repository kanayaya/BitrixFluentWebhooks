package com.kanayaya.BitrixFluentWebhooks.model.enums;

public enum Activitynotifytype {
    EMPTY(0, ""),
    ACTIVITYNOTIFYTYPE_1(1, "мин."),
    ACTIVITYNOTIFYTYPE_2(2, "ч."),
    ACTIVITYNOTIFYTYPE_3(3, "дн."),
    ;
    private final int id;
    private final String name;

    Activitynotifytype(int id, String name) {
        this.id = id;
        this.name = name;
    }
}



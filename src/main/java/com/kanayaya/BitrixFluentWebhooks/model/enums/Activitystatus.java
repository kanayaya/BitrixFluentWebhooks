package com.kanayaya.BitrixFluentWebhooks.model.enums;

public enum Activitystatus {
    ACTIVITYSTATUS_0(0, ""),
    ACTIVITYSTATUS_1(1, "Ожидается"),
    ACTIVITYSTATUS_2(2, "Завершено"),
    ACTIVITYSTATUS_3(3, "Завершено автоматически"),
    ;
    private final int id;
    private final String name;

    Activitystatus(int id, String name) {
        this.id = id;
        this.name = name;
    }
}


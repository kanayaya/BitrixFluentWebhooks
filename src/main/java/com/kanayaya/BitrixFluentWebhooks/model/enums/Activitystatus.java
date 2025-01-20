package com.kanayaya.BitrixFluentWebhooks.model.enums;

public enum Activitystatus {
    ACTIVITYSTATUS_0(0, ""),
    WAITING(1, "Ожидается"),
    COMPLETED(2, "Завершено"),
    COMPLETED_AUTOMATICALLY(3, "Завершено автоматически"),
    ;
    private final int id;
    private final String name;

    Activitystatus(int id, String name) {
        this.id = id;
        this.name = name;
    }
}


package com.kanayaya.BitrixFluentWebhooks.model.enums;

public enum Activitytype {
    ACTIVITYTYPE_0(0, ""),
    ACTIVITYTYPE_1(1, "Встреча"),
    ACTIVITYTYPE_2(2, "Звонок"),
    ACTIVITYTYPE_3(3, "Задача"),
    ACTIVITYTYPE_4(4, "Письмо"),
    ACTIVITYTYPE_5(5, "Действие"),
    ACTIVITYTYPE_6(6, "Пользовательское действие"),
    ;
    private final int id;
    private final String name;

    Activitytype(int id, String name) {
        this.id = id;
        this.name = name;
    }
}


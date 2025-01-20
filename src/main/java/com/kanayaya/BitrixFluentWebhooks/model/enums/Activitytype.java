package com.kanayaya.BitrixFluentWebhooks.model.enums;

public enum Activitytype {
    ACTIVITYTYPE_0(0, ""),
    MEETING(1, "Встреча"),
    CALL(2, "Звонок"),
    TASK(3, "Задача"),
    LETTER(4, "Письмо"),
    ACTION(5, "Действие"),
    USER_ACTION(6, "Пользовательское действие"),
    ;
    private final int id;
    private final String name;

    Activitytype(int id, String name) {
        this.id = id;
        this.name = name;
    }
}


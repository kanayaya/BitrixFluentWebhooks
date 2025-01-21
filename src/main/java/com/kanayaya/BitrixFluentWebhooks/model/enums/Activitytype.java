package com.kanayaya.BitrixFluentWebhooks.model.enums;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

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

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    private static final Map<Integer, Activitytype> byId = Arrays.stream(values()).collect(Collectors.toMap(a -> a.id, a->a));
    public static Activitytype getById(Integer id) {
        return byId.get(id);
    }
}


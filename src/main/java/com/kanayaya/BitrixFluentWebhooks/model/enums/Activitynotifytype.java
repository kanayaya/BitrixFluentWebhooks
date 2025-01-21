package com.kanayaya.BitrixFluentWebhooks.model.enums;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

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

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    private static Map<Integer, Activitynotifytype> byId = Arrays.stream(values()).collect(Collectors.toMap(a -> a.id, a->a));
    public static Activitynotifytype getById(Integer id) {
        return byId.get(id);
    }
}



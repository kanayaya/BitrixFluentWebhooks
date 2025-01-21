package com.kanayaya.BitrixFluentWebhooks.model.enums;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public enum Activitypriority {
    EMPTY(0, ""),
    LOW(1, "низкая"),
    MEDIUM(2, "средняя"),
    HIGH(3, "высокая"),
    ;
    private final int id;
    private final String name;

    Activitypriority(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    private static Map<Integer, Activitypriority> byId = Arrays.stream(values()).collect(Collectors.toMap(a -> a.id, a->a));
    public static Activitypriority getById(Integer id) {
        return byId.get(id);
    }
}



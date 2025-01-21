package com.kanayaya.BitrixFluentWebhooks.model.enums;

import com.kanayaya.BitrixFluentWebhooks.api.Method;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public enum Activitydirection {
    EMPTY(0, ""),
    IN(1, "Входящее"),
    OUT(2, "Исходящее"),
    ;
    private final int id;
    private final String name;

    Activitydirection(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    private static Map<Integer, Activitydirection> byId = Arrays.stream(values()).collect(Collectors.toMap(a -> a.id, a->a));
    public static Activitydirection getById(Integer id) {
        return byId.get(id);
    }
}



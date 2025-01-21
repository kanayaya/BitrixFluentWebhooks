package com.kanayaya.BitrixFluentWebhooks.model.enums;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

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

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    private static final Map<Integer, Activitystatus> byId = Arrays.stream(values()).collect(Collectors.toMap(a -> a.id, a->a));
    public static Activitystatus getById(Integer id) {
        return byId.get(id);
    }
}


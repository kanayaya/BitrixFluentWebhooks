package com.kanayaya.BitrixFluentWebhooks.model.enums;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public enum Contenttype {
    EMPTY(0, ""),
    PLAIN_TEXT(1, "Plain text"),
    BB_CODE(2, "bbCode"),
    HTML(3, "HTML"),
    ;
    private final int id;
    private final String name;

    Contenttype(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    private static final Map<Integer, Contenttype> byId = Arrays.stream(values()).collect(Collectors.toMap(a -> a.id, a->a));
    public static Contenttype getById(Integer id) {
        return byId.get(id);
    }
}



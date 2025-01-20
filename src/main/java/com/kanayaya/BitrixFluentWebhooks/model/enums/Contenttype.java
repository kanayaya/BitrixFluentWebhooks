package com.kanayaya.BitrixFluentWebhooks.model.enums;

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
}



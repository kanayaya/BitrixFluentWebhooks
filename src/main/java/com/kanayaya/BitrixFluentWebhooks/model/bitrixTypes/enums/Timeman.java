package com.kanayaya.BitrixFluentWebhooks.model.bitrixTypes.enums;

import com.fasterxml.jackson.annotation.JsonValue;

public enum Timeman {
    KEEP_WORKING_TIME(4, "Y", "вести учет"),
    DO_NOT_KEEP_WORKING_TIME(5, "N", "не вести учет"),
    ;
    private final int id;
    private final String xmlId;
    private final String title;

    Timeman(int id, String xmlId, String title) {
        this.id = id;
        this.xmlId = xmlId;
        this.title = title;
    }
    @JsonValue
    public int getId() {
        return id;
    }

    public String getXmlId() {
        return xmlId;
    }

    public String getTitle() {
        return title;
    }
}

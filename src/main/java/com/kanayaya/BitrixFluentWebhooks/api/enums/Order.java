package com.kanayaya.BitrixFluentWebhooks.api.enums;

public enum Order {
    ASC("ASC"),
    DESC("DESC")
    ;
    private final String order;

    Order(String order) {
        this.order = order;
    }

    public String getOrder() {
        return order;
    }
}

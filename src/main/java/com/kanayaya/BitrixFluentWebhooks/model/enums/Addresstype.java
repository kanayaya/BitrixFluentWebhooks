package com.kanayaya.BitrixFluentWebhooks.model.enums;

public enum Addresstype {
    DELIVERY(11, "Адрес доставки"),
    ACTUAL(1, "Фактический адрес"),
    LEGAL(6, "Юридический адрес"),
    REGISTRATION(4, "Адрес регистрации"),
    POST(8, "Адрес для корреспонденции"),
    BENEFICIARY(9, "Адрес бенефициара"),
    ;
    private final int id;
    private final String name;

    Addresstype(int id, String name) {
        this.id = id;
        this.name = name;
    }
}



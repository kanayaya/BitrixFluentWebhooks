package com.kanayaya.BitrixFluentWebhooks.model.enums;

public enum Addresstype {
    ADDRESSTYPE_11(11, "Адрес доставки"),
    ADDRESSTYPE_1(1, "Фактический адрес"),
    ADDRESSTYPE_6(6, "Юридический адрес"),
    ADDRESSTYPE_4(4, "Адрес регистрации"),
    ADDRESSTYPE_8(8, "Адрес для корреспонденции"),
    ADDRESSTYPE_9(9, "Адрес бенефициара"),
    ;
    private final int id;
    private final String name;

    Addresstype(int id, String name) {
        this.id = id;
        this.name = name;
    }
}



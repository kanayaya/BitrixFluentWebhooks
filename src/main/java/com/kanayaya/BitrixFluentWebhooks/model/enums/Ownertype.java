package com.kanayaya.BitrixFluentWebhooks.model.enums;

import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public enum Ownertype {
    LEAD(1, "Лид", "LEAD", "L"),
    DEAL(2, "Сделка", "DEAL", "D"),
    CONTACT(3, "Контакт", "CONTACT", "C"),
    COMPANY(4, "Компания", "COMPANY", "CO"),
    INVOICE(5, "Счёт (старая версия)", "INVOICE", "I"),
    SMART_INVOICE(31, "Счёт", "SMART_INVOICE", "SI"),
    QUOTE(7, "Предложение", "QUOTE", "Q"),
    REQUISITE(8, "Реквизиты", "REQUISITE", "RQ"),
    SMART_DOCUMENT(36, "Документ", "SMART_DOCUMENT", "DO"),
    SMART_B2E_DOC(39, "Документ компании", "SMART_B2E_DOC", "SBD"),
    ;
    private final int id;
    private final String name;
    private final String symbolCode;
    private final String symbolCodeShort;

    Ownertype(int id, String name, String symbolCode, String symbolCodeShort) {
        this.id = id;
        this.name = name;
        this.symbolCode = symbolCode;
        this.symbolCodeShort = symbolCodeShort;
    }
    @JsonValue
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSymbolCode() {
        return symbolCode;
    }

    public String getSymbolCodeShort() {
        return symbolCodeShort;
    }

    private static final Map<Integer, Ownertype> byId = Arrays.stream(values()).collect(Collectors.toMap(a -> a.id, a->a));
    public static Ownertype getById(Integer id) {
        return byId.get(id);
    }
}


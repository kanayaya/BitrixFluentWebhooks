package com.kanayaya.BitrixFluentWebhooks.model.pojo.idable;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.kanayaya.BitrixFluentWebhooks.BitrixClient;
import com.kanayaya.BitrixFluentWebhooks.model.pojo.full.FullCurrencyEntity;

public class CurrencyEntity {
    @JsonProperty("CURRENCY")
    private String currency;
    public CurrencyEntity() {

    }
    public CurrencyEntity(String currency) {
        this.currency = currency;
    }
    public String getCurrency() {
        return currency;
    }

    public boolean delete(BitrixClient client) {
        return false;
    }

    public FullCurrencyEntity getFull(BitrixClient client) {
        return null;
    }
}
package com.kanayaya.BitrixFluentWebhooks.model.pojo.idable;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.kanayaya.BitrixFluentWebhooks.BitrixRestClient;
import com.kanayaya.BitrixFluentWebhooks.model.pojo.full.FullCurrencyEntity;

public class CurrencyEntity implements Entity<CurrencyEntity, FullCurrencyEntity, String> {
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

    @Override
    public String getId() {
        return currency;
    }

    public boolean delete(BitrixRestClient client) {
        return false;
    }

    @Override
    public <ALT extends CurrencyEntity> ALT getFull(BitrixRestClient client, Class<? extends ALT> clazz) {
        return null;
    }

    @Override
    public FullCurrencyEntity getFull(BitrixRestClient client) {
        return null;
    }
}
package com.kanayaya.BitrixFluentWebhooks.model.pojo.idable;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.kanayaya.BitrixFluentWebhooks.BitrixRestClient;
import com.kanayaya.BitrixFluentWebhooks.model.pojo.full.FullQuoteEntity;

public class QuoteEntity implements Entity<QuoteEntity, FullQuoteEntity, Integer> {
    @JsonProperty("ID")
    private int id;
    public QuoteEntity() {

    }
    public QuoteEntity(int id) {
        this.id = id;
    }
    @Override
    public Integer getId() {
        return id;
    }

    @Override
    public boolean delete(BitrixRestClient client) {
        return false;
    }

    @Override
    public <ALT extends QuoteEntity> ALT getFull(BitrixRestClient client, Class<? extends ALT> clazz) {
        return null;
    }

    @Override
    public FullQuoteEntity getFull(BitrixRestClient client) {
        return null;
    }
}
package com.kanayaya.BitrixFluentWebhooks.model.pojo.idable;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.kanayaya.BitrixFluentWebhooks.BitrixClient;
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
    public boolean delete(BitrixClient client) {
        return false;
    }

    @Override
    public <ALT extends QuoteEntity> ALT getFull(BitrixClient client, Class<? extends ALT> clazz) {
        return null;
    }

    @Override
    public FullQuoteEntity getFull(BitrixClient client) {
        return null;
    }
}
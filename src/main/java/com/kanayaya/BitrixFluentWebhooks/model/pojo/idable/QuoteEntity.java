package com.kanayaya.BitrixFluentWebhooks.model.pojo.idable;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.kanayaya.BitrixFluentWebhooks.BitrixClient;
import com.kanayaya.BitrixFluentWebhooks.model.pojo.full.FullQuoteEntity;
import com.kanayaya.BitrixFluentWebhooks.model.tables.Quote;

public class QuoteEntity implements Entity<FullQuoteEntity> {
    @JsonProperty("ID")
    private int id;
    public QuoteEntity() {

    }
    public QuoteEntity(int id) {
        this.id = id;
    }
    @Override
    public int getId() {
        return id;
    }

    @Override
    public boolean delete(BitrixClient client) {
        return false;
    }

    @Override
    public FullQuoteEntity getFull(BitrixClient client) {
        return null;
    }
}
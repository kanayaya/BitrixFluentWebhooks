package com.kanayaya.BitrixFluentWebhooks.model.pojo.idable;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.kanayaya.BitrixFluentWebhooks.BitrixClient;
import com.kanayaya.BitrixFluentWebhooks.model.pojo.full.FullDealEntity;
import com.kanayaya.BitrixFluentWebhooks.model.tables.Deal;

public class DealEntity implements Entity<FullDealEntity> {
    @JsonProperty("ID")
    private int id;
    public DealEntity() {

    }
    public DealEntity(int id) {
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
    public FullDealEntity getFull(BitrixClient client) {
        return null;
    }
}
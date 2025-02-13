package com.kanayaya.BitrixFluentWebhooks.model.pojo.idable;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.kanayaya.BitrixFluentWebhooks.BitrixClient;
import com.kanayaya.BitrixFluentWebhooks.model.pojo.full.FullDealEntity;

public class DealEntity implements Entity<DealEntity, FullDealEntity, Integer> {
    @JsonProperty("ID")
    private int id;
    public DealEntity() {

    }
    public DealEntity(int id) {
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
    public <ALT extends DealEntity> ALT getFull(BitrixClient client, Class<? extends ALT> clazz) {
        return null;
    }

    @Override
    public FullDealEntity getFull(BitrixClient client) {
        return null;
    }

}
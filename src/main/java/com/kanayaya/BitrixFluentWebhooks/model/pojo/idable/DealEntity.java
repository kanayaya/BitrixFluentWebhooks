package com.kanayaya.BitrixFluentWebhooks.model.pojo.idable;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.kanayaya.BitrixFluentWebhooks.BitrixRestClient;
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
    public boolean delete(BitrixRestClient client) {
        return false;
    }

    @Override
    public <ALT extends DealEntity> ALT getFull(BitrixRestClient client, Class<? extends ALT> clazz) {
        return null;
    }

    @Override
    public FullDealEntity getFull(BitrixRestClient client) {
        return null;
    }

}
package com.kanayaya.BitrixFluentWebhooks.model.pojo.idable;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.kanayaya.BitrixFluentWebhooks.BitrixRestClient;
import com.kanayaya.BitrixFluentWebhooks.model.pojo.full.FullActivityEntity;

public class ActivityEntity implements Entity<ActivityEntity, FullActivityEntity, Integer> {
    @JsonProperty("ID")
    private int id;
    public ActivityEntity() {

    }
    public ActivityEntity(int id) {
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
    public <FULL extends ActivityEntity> FULL getFull(BitrixRestClient client, Class<? extends FULL> clazz) {
        return null;
    }

    @Override
    public FullActivityEntity getFull(BitrixRestClient client) {
        return getFull(client, FullActivityEntity.class);
    }
}
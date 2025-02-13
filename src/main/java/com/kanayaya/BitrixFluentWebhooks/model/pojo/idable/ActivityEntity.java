package com.kanayaya.BitrixFluentWebhooks.model.pojo.idable;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.kanayaya.BitrixFluentWebhooks.BitrixClient;
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
    public boolean delete(BitrixClient client) {
        return false;
    }

    @Override
    public <FULL extends ActivityEntity> FULL getFull(BitrixClient client, Class<? extends FULL> clazz) {
        return null;
    }

    @Override
    public FullActivityEntity getFull(BitrixClient client) {
        return getFull(client, FullActivityEntity.class);
    }
}
package com.kanayaya.BitrixFluentWebhooks.model.pojo.idable;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.kanayaya.BitrixFluentWebhooks.BitrixClient;
import com.kanayaya.BitrixFluentWebhooks.model.pojo.full.FullActivityEntity;
import com.kanayaya.BitrixFluentWebhooks.model.tables.Activity;

public class ActivityEntity implements Entity<FullActivityEntity> {
    @JsonProperty("ID")
    private int id;
    public ActivityEntity() {

    }
    public ActivityEntity(int id) {
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
    public FullActivityEntity getFull(BitrixClient client) {
        return null;
    }
}
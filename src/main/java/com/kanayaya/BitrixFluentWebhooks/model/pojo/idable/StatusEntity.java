package com.kanayaya.BitrixFluentWebhooks.model.pojo.idable;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.kanayaya.BitrixFluentWebhooks.BitrixClient;
import com.kanayaya.BitrixFluentWebhooks.model.pojo.full.FullStatusEntity;
import com.kanayaya.BitrixFluentWebhooks.model.tables.Status;

public class StatusEntity implements Entity<FullStatusEntity> {
    @JsonProperty("ID")
    private int id;
    public StatusEntity() {

    }
    public StatusEntity(int id) {
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
    public FullStatusEntity getFull(BitrixClient client) {
        return null;
    }
}
package com.kanayaya.BitrixFluentWebhooks.model.pojo.idable;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.kanayaya.BitrixFluentWebhooks.BitrixClient;
import com.kanayaya.BitrixFluentWebhooks.model.pojo.full.FullActivityCommunicationEntity;
import com.kanayaya.BitrixFluentWebhooks.model.tables.ActivityCommunication;

public class ActivityCommunicationEntity implements Entity<FullActivityCommunicationEntity> {
    @JsonProperty("ID")
    private int id;
    public ActivityCommunicationEntity() {

    }
    public ActivityCommunicationEntity(int id) {
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
    public FullActivityCommunicationEntity getFull(BitrixClient client) {
        return null;
    }
}
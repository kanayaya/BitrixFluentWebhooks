package com.kanayaya.BitrixFluentWebhooks.model.pojo.idable;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.kanayaya.BitrixFluentWebhooks.BitrixClient;
import com.kanayaya.BitrixFluentWebhooks.model.pojo.full.FullActivityCommunicationEntity;

public class ActivityCommunicationEntity implements Entity<ActivityCommunicationEntity, FullActivityCommunicationEntity, Integer> {
    @JsonProperty("ID")
    private int id;
    public ActivityCommunicationEntity() {

    }
    public ActivityCommunicationEntity(int id) {
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
    public <FULL extends ActivityCommunicationEntity> FULL getFull(BitrixClient client, Class<? extends FULL> clazz) {
        return null;
    }

    @Override
    public FullActivityCommunicationEntity getFull(BitrixClient client) {
        return getFull(client, FullActivityCommunicationEntity.class);
    }


}
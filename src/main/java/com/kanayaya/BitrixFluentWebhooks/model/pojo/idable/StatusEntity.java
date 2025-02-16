package com.kanayaya.BitrixFluentWebhooks.model.pojo.idable;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.kanayaya.BitrixFluentWebhooks.BitrixRestClient;
import com.kanayaya.BitrixFluentWebhooks.model.pojo.full.FullStatusEntity;

public class StatusEntity implements Entity<StatusEntity, FullStatusEntity, String> {
    @JsonProperty("STATUS_ID")
    private String statusId;
    public StatusEntity() {

    }
    public StatusEntity(String statusId) {
        this.statusId = statusId;
    }

    public String getId() {
        return statusId;
    }

    public boolean delete(BitrixRestClient client) {
        return false;
    }

    @Override
    public <ALT extends StatusEntity> ALT getFull(BitrixRestClient client, Class<? extends ALT> clazz) {
        return null;
    }

    @Override
    public FullStatusEntity getFull(BitrixRestClient client) {
        return null;
    }

}
package com.kanayaya.BitrixFluentWebhooks.model.pojo.idable;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.kanayaya.BitrixFluentWebhooks.BitrixClient;
import com.kanayaya.BitrixFluentWebhooks.model.pojo.full.FullStatusEntity;
import com.kanayaya.BitrixFluentWebhooks.model.tables.Status;

public class StatusEntity {
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

    public boolean delete(BitrixClient client) {
        return false;
    }

    public FullStatusEntity getFull(BitrixClient client) {
        return null;
    }
}
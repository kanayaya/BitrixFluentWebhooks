package com.kanayaya.BitrixFluentWebhooks.model.pojo.idable;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.kanayaya.BitrixFluentWebhooks.BitrixRestClient;
import com.kanayaya.BitrixFluentWebhooks.model.pojo.full.FullActivityEntity;

public class ActivityEntity implements Entity<Integer> {
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
}
package com.kanayaya.BitrixFluentWebhooks.model.pojo.idable;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.kanayaya.BitrixFluentWebhooks.BitrixRestClient;
import com.kanayaya.BitrixFluentWebhooks.model.pojo.full.FullEnumEntity;

public class EnumEntity implements Entity<Integer> {
    @JsonProperty("ID")
    private int id;
    public EnumEntity() {

    }
    public EnumEntity(int id) {
        this.id = id;
    }
    @Override
    public Integer getId() {
        return id;
    }
}
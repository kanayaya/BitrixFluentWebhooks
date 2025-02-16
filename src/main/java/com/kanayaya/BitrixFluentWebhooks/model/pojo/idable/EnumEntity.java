package com.kanayaya.BitrixFluentWebhooks.model.pojo.idable;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.kanayaya.BitrixFluentWebhooks.BitrixRestClient;
import com.kanayaya.BitrixFluentWebhooks.model.pojo.full.FullEnumEntity;

public class EnumEntity implements Entity<EnumEntity, FullEnumEntity, Integer> {
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

    @Override
    public boolean delete(BitrixRestClient client) {
        return false;
    }

    @Override
    public <ALT extends EnumEntity> ALT getFull(BitrixRestClient client, Class<? extends ALT> clazz) {
        return null;
    }

    @Override
    public FullEnumEntity getFull(BitrixRestClient client) {
        return null;
    }
}
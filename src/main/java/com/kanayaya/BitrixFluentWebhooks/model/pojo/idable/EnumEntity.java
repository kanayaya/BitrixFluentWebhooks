package com.kanayaya.BitrixFluentWebhooks.model.pojo.idable;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.kanayaya.BitrixFluentWebhooks.BitrixClient;
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
    public boolean delete(BitrixClient client) {
        return false;
    }

    @Override
    public <ALT extends EnumEntity> ALT getFull(BitrixClient client, Class<? extends ALT> clazz) {
        return null;
    }

    @Override
    public FullEnumEntity getFull(BitrixClient client) {
        return null;
    }
}
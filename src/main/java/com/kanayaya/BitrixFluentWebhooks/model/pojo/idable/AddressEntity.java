package com.kanayaya.BitrixFluentWebhooks.model.pojo.idable;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.kanayaya.BitrixFluentWebhooks.BitrixClient;
import com.kanayaya.BitrixFluentWebhooks.model.pojo.full.FullAddressEntity;

public class AddressEntity implements Entity<AddressEntity, FullAddressEntity, Integer> {
    @JsonProperty("TYPE_ID")
    private int id;
    public AddressEntity() {

    }
    public AddressEntity(int id) {
        this.id = id;
    }
    public Integer getId() {
        return id;
    }


    public boolean delete(BitrixClient client) {
        return false;
    }


    public <FULL extends AddressEntity> FULL getFull(BitrixClient client, Class<? extends FULL> clazz) {
        return null;
    }

    @Override
    public FullAddressEntity getFull(BitrixClient client) {
        return getFull(client, FullAddressEntity.class);
    }
}
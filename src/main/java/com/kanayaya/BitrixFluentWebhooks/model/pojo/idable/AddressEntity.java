package com.kanayaya.BitrixFluentWebhooks.model.pojo.idable;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.kanayaya.BitrixFluentWebhooks.BitrixRestClient;
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


    public boolean delete(BitrixRestClient client) {
        return false;
    }


    public <FULL extends AddressEntity> FULL getFull(BitrixRestClient client, Class<? extends FULL> clazz) {
        return null;
    }

    @Override
    public FullAddressEntity getFull(BitrixRestClient client) {
        return getFull(client, FullAddressEntity.class);
    }
}
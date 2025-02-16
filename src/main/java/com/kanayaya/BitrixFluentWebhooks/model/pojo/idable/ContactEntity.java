package com.kanayaya.BitrixFluentWebhooks.model.pojo.idable;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.kanayaya.BitrixFluentWebhooks.BitrixRestClient;
import com.kanayaya.BitrixFluentWebhooks.model.pojo.full.FullContactEntity;

public class ContactEntity implements Entity<ContactEntity, FullContactEntity, Integer> {
    @JsonProperty("ID")
    private int id;
    public ContactEntity() {

    }
    public ContactEntity(int id) {
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
    public <ALT extends ContactEntity> ALT getFull(BitrixRestClient client, Class<? extends ALT> clazz) {
        return null;
    }

    @Override
    public FullContactEntity getFull(BitrixRestClient client) {
        return null;
    }


}
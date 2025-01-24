package com.kanayaya.BitrixFluentWebhooks.model.pojo.idable;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.kanayaya.BitrixFluentWebhooks.BitrixClient;
import com.kanayaya.BitrixFluentWebhooks.model.pojo.full.FullContactEntity;
import com.kanayaya.BitrixFluentWebhooks.model.tables.Contact;

public class ContactEntity implements Entity<FullContactEntity> {
    @JsonProperty("ID")
    private int id;
    public ContactEntity() {

    }
    public ContactEntity(int id) {
        this.id = id;
    }
    @Override
    public int getId() {
        return id;
    }

    @Override
    public boolean delete(BitrixClient client) {
        return false;
    }

    @Override
    public FullContactEntity getFull(BitrixClient client) {
        return null;
    }
}
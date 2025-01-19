package com.kanayaya.BitrixFluentWebhooks.model.pojo.idable;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.kanayaya.BitrixFluentWebhooks.BitrixWebhookClient;
import com.kanayaya.BitrixFluentWebhooks.model.pojo.full.FullUserEntity;

public class UserEntity implements Entity<FullUserEntity> {
    @JsonProperty("ID")
    private int id;
    public UserEntity() {

    }
    public UserEntity(int id) {
        this.id = id;
    }
    @Override
    public int getId() {
        return id;
    }

    @Override
    public boolean delete(BitrixWebhookClient client) {
        return false;
    }

    @Override
    public FullUserEntity getFull() {
        return null;
    }
}

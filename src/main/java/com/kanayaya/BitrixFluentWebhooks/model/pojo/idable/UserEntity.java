package com.kanayaya.BitrixFluentWebhooks.model.pojo.idable;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.kanayaya.BitrixFluentWebhooks.BitrixRestClient;
import com.kanayaya.BitrixFluentWebhooks.model.pojo.full.FullUserEntity;
import com.kanayaya.BitrixFluentWebhooks.model.tables.User;

public class UserEntity implements Entity<UserEntity, FullUserEntity, Integer> {
    @JsonProperty("ID")
    private int id;
    public UserEntity() {

    }
    public UserEntity(int id) {
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
    public <ALT extends UserEntity> ALT getFull(BitrixRestClient client, Class<? extends ALT> clazz) {
        return null;
    }

    @Override
    public FullUserEntity getFull(BitrixRestClient client) {
        return client.user().get(User.ID.eq(getId())).send().get(0);
    }
}

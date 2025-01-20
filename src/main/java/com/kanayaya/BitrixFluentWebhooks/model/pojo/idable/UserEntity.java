package com.kanayaya.BitrixFluentWebhooks.model.pojo.idable;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.kanayaya.BitrixFluentWebhooks.BitrixClient;
import com.kanayaya.BitrixFluentWebhooks.model.pojo.full.FullUserEntity;
import com.kanayaya.BitrixFluentWebhooks.model.tables.User;

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
    public boolean delete(BitrixClient client) {
        return false;
    }

    @Override
    public FullUserEntity getFull(BitrixClient client) {
        return client.user().get(filter -> filter.field(User.ID).eq(getId())).send().get(0);
    }
}

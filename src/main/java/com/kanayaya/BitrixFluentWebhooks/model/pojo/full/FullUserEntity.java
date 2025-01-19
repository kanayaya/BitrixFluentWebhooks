package com.kanayaya.BitrixFluentWebhooks.model.pojo.full;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.kanayaya.BitrixFluentWebhooks.model.pojo.idable.UserEntity;

public class FullUserEntity extends UserEntity implements FullEntity<FullUserEntity> {
    @JsonProperty("ACTIVE")
    private boolean isActive;
    @JsonProperty("NAME")
    private String name;
    @Override
    public FullUserEntity getFull() {
        return this;
    }
}

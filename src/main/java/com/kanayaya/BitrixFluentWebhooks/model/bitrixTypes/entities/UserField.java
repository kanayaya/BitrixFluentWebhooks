package com.kanayaya.BitrixFluentWebhooks.model.bitrixTypes.entities;

import com.kanayaya.BitrixFluentWebhooks.model.Field;
import com.kanayaya.BitrixFluentWebhooks.model.Table;
import com.kanayaya.BitrixFluentWebhooks.model.pojo.idable.UserEntity;

public class UserField<TABLE extends Table> extends Field<TABLE, UserEntity> {
    public UserField(String name) {
        super(name, UserEntity::getId, s -> new UserEntity(Integer.parseInt(s)));
    }
}

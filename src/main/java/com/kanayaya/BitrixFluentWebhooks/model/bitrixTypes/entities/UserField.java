package com.kanayaya.BitrixFluentWebhooks.model.bitrixTypes.entities;

import com.kanayaya.BitrixFluentWebhooks.model.Table;
import com.kanayaya.BitrixFluentWebhooks.model.pojo.idable.UserEntity;

public class UserField<TABLE extends Table> extends EntityField<TABLE, UserEntity> {
    public UserField(String name) {
        super(name, s -> new UserEntity(Integer.parseInt(s)));
    }
}

package com.kanayaya.BitrixFluentWebhooks.model.bitrixTypes.entities;

import com.kanayaya.BitrixFluentWebhooks.model.Field;
import com.kanayaya.BitrixFluentWebhooks.model.Table;
import com.kanayaya.BitrixFluentWebhooks.model.pojo.idable.StatusEntity;

public class StatusField<TABLE extends Table> extends Field<TABLE, StatusEntity> {
    public StatusField(String name) {
        super(name, StatusEntity::new);
    }
}

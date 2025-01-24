package com.kanayaya.BitrixFluentWebhooks.model.bitrixTypes.entities;

import com.kanayaya.BitrixFluentWebhooks.model.Table;
import com.kanayaya.BitrixFluentWebhooks.model.pojo.idable.StatusEntity;

public class StatusField<TABLE extends Table> extends EntityField<TABLE, StatusEntity> {
    public StatusField(String name) {
        super(name, s -> new StatusEntity(Integer.parseInt(s)));
    }
}

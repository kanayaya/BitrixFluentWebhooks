package com.kanayaya.BitrixFluentWebhooks.model.bitrixTypes.entities;

import com.kanayaya.BitrixFluentWebhooks.model.Table;
import com.kanayaya.BitrixFluentWebhooks.model.pojo.idable.DealEntity;

public class DealField<TABLE extends Table> extends EntityField<TABLE, DealEntity> {
    public DealField(String name) {
        super(name, s -> new DealEntity(Integer.parseInt(s)));
    }
}

package com.kanayaya.BitrixFluentWebhooks.model.bitrixTypes.entities;

import com.kanayaya.BitrixFluentWebhooks.model.Field;
import com.kanayaya.BitrixFluentWebhooks.model.Table;
import com.kanayaya.BitrixFluentWebhooks.model.pojo.idable.CurrencyEntity;

public class CurrencyField<TABLE extends Table> extends Field<TABLE, CurrencyEntity> {
    public CurrencyField(String name) {
        super(name, CurrencyEntity::getCurrency, CurrencyEntity::new);
    }
}

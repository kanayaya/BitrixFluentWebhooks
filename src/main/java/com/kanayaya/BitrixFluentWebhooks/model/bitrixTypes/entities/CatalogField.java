package com.kanayaya.BitrixFluentWebhooks.model.bitrixTypes.entities;

import com.kanayaya.BitrixFluentWebhooks.model.Table;
import com.kanayaya.BitrixFluentWebhooks.model.pojo.idable.CatalogEntity;

import java.util.function.Function;

public class CatalogField<TABLE extends Table> extends EntityField<TABLE, CatalogEntity> {
    public CatalogField(String name) {
        super(name, s -> new CatalogEntity(Integer.parseInt(s)));
    }
}

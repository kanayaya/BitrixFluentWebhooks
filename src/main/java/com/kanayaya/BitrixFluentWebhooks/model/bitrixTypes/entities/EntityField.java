package com.kanayaya.BitrixFluentWebhooks.model.bitrixTypes.entities;

import com.kanayaya.BitrixFluentWebhooks.model.Field;
import com.kanayaya.BitrixFluentWebhooks.model.Table;
import com.kanayaya.BitrixFluentWebhooks.model.pojo.idable.Entity;

import java.util.function.Function;

public class EntityField<TABLE extends Table, ENTITY extends Entity<?>> extends Field<TABLE, ENTITY> {
    public EntityField(String name, Function<String, ENTITY> deserializer) {
        super(name, entity -> entity.getId(), deserializer);
    }
}

package com.kanayaya.BitrixFluentWebhooks.model.bitrixTypes;

import com.kanayaya.BitrixFluentWebhooks.model.Field;
import com.kanayaya.BitrixFluentWebhooks.model.Table;

import static com.kanayaya.BitrixFluentWebhooks.model.bitrixTypes.SerializerUtils.BOOLEAN_DESERIALIZER;
import static com.kanayaya.BitrixFluentWebhooks.model.bitrixTypes.SerializerUtils.BOOLEAN_SERIALIZER;

public class BooleanField<TABLE extends Table> extends Field<TABLE, Boolean> {
    public BooleanField(String name) {
        super(name, b->b, BOOLEAN_DESERIALIZER);
    }
}

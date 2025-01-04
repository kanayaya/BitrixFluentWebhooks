package com.kanayaya.BitrixFluentWebhooks.model.bitrixTypes;

import com.kanayaya.BitrixFluentWebhooks.model.Field;
import com.kanayaya.BitrixFluentWebhooks.model.Table;

public class StringField<TABLE extends Table> extends Field<TABLE, String> {
    public StringField(String name) {
        super(name, s->s, s->s);
    }
}

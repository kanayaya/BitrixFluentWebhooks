package com.kanayaya.BitrixFluentWebhooks.model.bitrixTypes;

import com.kanayaya.BitrixFluentWebhooks.model.Field;
import com.kanayaya.BitrixFluentWebhooks.model.Table;

import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;

public class MultipleField<TABLE extends Table, VALUE, ITEM extends Field<TABLE, VALUE>> extends Field<TABLE, List<VALUE>> {
    public MultipleField(String name, ITEM of, Function<String, List<VALUE>> f) {

        super(name, Object::toString, f );
    }
}

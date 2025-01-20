package com.kanayaya.BitrixFluentWebhooks.api.request.filter;

import com.kanayaya.BitrixFluentWebhooks.model.Field;
import com.kanayaya.BitrixFluentWebhooks.model.Table;
import com.kanayaya.BitrixFluentWebhooks.model.bitrixTypes.StringField;

import java.util.Map;

public interface Filter<TABLE extends Table> {
    Map<String, Object> getParams();
    <VALUE> ValueStep<TABLE, VALUE> field(Field<TABLE, VALUE> field);
    ValueStringStep<TABLE> field(StringField<TABLE> field);
    public interface ValueStep<TABLE extends Table, VALUE> {
        Filter<TABLE> eq(VALUE value);
        Filter<TABLE> in(Iterable<VALUE> values);
        Filter<TABLE> not(VALUE value);
        Filter<TABLE> gt(VALUE value);
        Filter<TABLE> lt(VALUE value);
        Filter<TABLE> ge(VALUE value);
        Filter<TABLE> le(VALUE value);
        Filter<TABLE> btw(VALUE value);
        Filter<TABLE> nbtw(VALUE value);
    }

    public interface ValueStringStep<TABLE extends Table> extends ValueStep<TABLE, String> {
        Filter<TABLE> contains(String value);
        Filter<TABLE> containsNo(String value);
    }
}

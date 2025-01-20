package com.kanayaya.BitrixFluentWebhooks.api.request.filter;

import com.kanayaya.BitrixFluentWebhooks.model.Field;
import com.kanayaya.BitrixFluentWebhooks.model.Table;
import com.kanayaya.BitrixFluentWebhooks.model.bitrixTypes.StringField;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;

public class MutableFilter<TABLE extends Table> implements Filter<TABLE> {
    private final Map<String, Object> params = new HashMap<>();

    public <VALUE> ValueStep<TABLE, VALUE> field(Field<TABLE, VALUE> field) {
        return (ValueStepInner<TABLE, VALUE>) (biConsumer) -> {
            biConsumer.accept(field, params);
            return this;
        };
    }
    public ValueStringStep<TABLE> field(StringField<TABLE> field) {
        return (ValueStringStepInner<TABLE>) (biConsumer) -> {
            biConsumer.accept(field, params);
            return this;
        };
    }

    @Override
    public Map<String, Object> getParams() {
        return new HashMap<>(params);
    }

    @FunctionalInterface
    private interface ValueStepInner<TABLE extends Table, VALUE> extends Filter.ValueStep<TABLE, VALUE> {
        MutableFilter<TABLE> filter(BiConsumer<Field<TABLE, VALUE>, Map<String, Object>> modifier);

        @Override
        default MutableFilter<TABLE> eq(VALUE value) {
            return filter((field, paramsMap) -> paramsMap.put("=" + field.getName(), field.serialize(value)));
        }
        @Override
        default MutableFilter<TABLE> in(Iterable<VALUE> value) {

            return filter((field, paramsMap) -> {
                List<Object> serialized = new ArrayList<>();
                for (VALUE v :
                        value) {
                    serialized.add(field.serialize(v));
                }
                paramsMap.put(field.getName(), serialized);
            });
        }

        @Override
        default MutableFilter<TABLE> not(VALUE value) {
            return filter((field, paramsMap) -> paramsMap.put("!" + field.getName(), field.serialize(value)));
        }

        @Override
        default MutableFilter<TABLE> gt(VALUE value) {
            return filter((field, paramsMap) -> paramsMap.put(">" + field.getName(), field.serialize(value)));
        }

        @Override
        default MutableFilter<TABLE> lt(VALUE value) {
            return filter((field, paramsMap) -> paramsMap.put("<" + field.getName(), field.serialize(value)));
        }

        @Override
        default MutableFilter<TABLE> ge(VALUE value) {
            return filter((field, paramsMap) -> paramsMap.put(">=" + field.getName(), field.serialize(value)));
        }

        @Override
        default MutableFilter<TABLE> le(VALUE value) {
            return filter((field, paramsMap) -> paramsMap.put("<=" + field.getName(), field.serialize(value)));
        }

        @Override
        default MutableFilter<TABLE> btw(VALUE value) {
            return filter((field, paramsMap) -> paramsMap.put("><" + field.getName(), field.serialize(value)));
        }

        @Override
        default MutableFilter<TABLE> nbtw(VALUE value) {
            return filter((field, paramsMap) -> paramsMap.put("!><" + field.getName(), field.serialize(value)));
        }
    }

    @FunctionalInterface
    private interface ValueStringStepInner<TABLE extends Table> extends Filter.ValueStringStep<TABLE>, ValueStepInner<TABLE, String> {
        @Override
        default MutableFilter<TABLE> contains(String value) {
            return filter((field, paramsMap) -> paramsMap.put("%" + field.getName(), field.serialize(value)));
        }
        @Override
        default MutableFilter<TABLE> containsNo(String value) {
            return filter((field, paramsMap) -> paramsMap.put("!%" + field.getName(), field.serialize(value)));
        }
    }
    private static Map.Entry<String, String> newEntry(String key, String value) {
        return new Map.Entry<>() {
            @Override
            public String getKey() {
                return key;
            }

            @Override
            public String getValue() {
                return value;
            }

            @Override
            public String setValue(String value) {
                throw new UnsupportedOperationException();
            }
        };
    }
}

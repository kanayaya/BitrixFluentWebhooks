package com.kanayaya.BitrixFluentWebhooks.api.request;

import com.kanayaya.BitrixFluentWebhooks.model.Field;
import com.kanayaya.BitrixFluentWebhooks.model.Table;
import com.kanayaya.BitrixFluentWebhooks.model.bitrixTypes.StringField;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;

public class PathFilterBuilder <TABLE extends Table> {
    private final List<Map.Entry<String, String>> params = new ArrayList<>();

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
    public List<Map.Entry<String, String>> getParameters() {
        return new ArrayList<>(params);
    }

    @FunctionalInterface
    private interface ValueStepInner<TABLE extends Table, VALUE> extends ValueStep<TABLE, VALUE> {
        PathFilterBuilder<TABLE> filter(BiConsumer<Field<TABLE, VALUE>, List<Map.Entry<String, String>>> modifier);

        @Override
        default PathFilterBuilder<TABLE> eq(VALUE value) {
            return filter((field, list) -> list.add(newEntry("=" + field.getName(), field.serialize(value))));
        }
    }
    public interface ValueStep<TABLE extends Table, VALUE> {
        PathFilterBuilder<TABLE> eq(VALUE value);
//        PathFilterBuilder<TABLE> in(Iterable<VALUE> value);
//        PathFilterBuilder<TABLE> not(VALUE value);
//        PathFilterBuilder<TABLE> gt(VALUE value);
//        PathFilterBuilder<TABLE> lt(VALUE value);
//        PathFilterBuilder<TABLE> ge(VALUE value);
//        PathFilterBuilder<TABLE> le(VALUE value);
//        PathFilterBuilder<TABLE> btw(VALUE value);
//        PathFilterBuilder<TABLE> nbtw(VALUE value);
    }
    @FunctionalInterface
    private interface ValueStringStepInner<TABLE extends Table> extends ValueStringStep<TABLE>, ValueStepInner<TABLE, String> {
        @Override
        default PathFilterBuilder<TABLE> contains(String value) {
            return filter((field, list) -> list.add(newEntry("%" + field.getName(), field.serialize(value))));
        }
    }
    public interface ValueStringStep<TABLE extends Table> extends ValueStep<TABLE, String> {
        PathFilterBuilder<TABLE> contains(String value);
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

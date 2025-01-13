package com.kanayaya.BitrixFluentWebhooks.model;

import java.util.function.Function;

public class Field<TABLE extends Table, VALUE> {
    private final String name;
    private final Function<VALUE, Object> serializer;
    private final Function<String, VALUE> deserializer;

    public Field(String name, Function<VALUE, Object> serializer, Function<String, VALUE> deserializer) {
        this.name = name;
        this.serializer = serializer;
        this.deserializer = deserializer;
    }
    public Field(String name, Function<String, VALUE> deserializer) {
        this(name, o->o, deserializer);
    }

    public String getName() {
        return name;
    }
    public Object serialize(VALUE value) {
        return serializer.apply(value);
    }
    public VALUE deserialize(String s) {
        return deserializer.apply(s);
    }
}

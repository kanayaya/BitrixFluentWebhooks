package com.kanayaya.BitrixFluentWebhooks.model;

import java.util.function.Function;

public class Field<TABLE extends Table, VALUE> {
    private final String name;
    private final Function<VALUE, String> serializer;
    private final Function<String, VALUE> deserializer;

    public Field(String name, Function<VALUE, String> serializer, Function<String, VALUE> deserializer) {
        this.name = name;
        this.serializer = serializer;
        this.deserializer = deserializer;
    }
    public Field(String name, Function<String, VALUE> deserializer) {
        this(name, Object::toString, deserializer);
    }

    public String getName() {
        return name;
    }
    public String serialize(VALUE value) {
        return serializer.apply(value);
    }
    public VALUE deserialize(String s) {
        return deserializer.apply(s);
    }
}

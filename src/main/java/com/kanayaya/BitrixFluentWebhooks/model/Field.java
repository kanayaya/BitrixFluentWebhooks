package com.kanayaya.BitrixFluentWebhooks.model;

import java.util.List;
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

    public Condition<TABLE> eq(VALUE value) {
        return new Condition<>("=", name, value);
    }
    public Condition<TABLE>  in(Iterable<VALUE> values) {
        return new Condition<>(name, values);
    }
    public Condition<TABLE>  notIn(Iterable<VALUE> values) {
        return new Condition<>("!", name, values);
    }
    public Condition<TABLE>  not(VALUE value) {
        return new Condition<>("!", name, value);
    }
    public Condition<TABLE>  gt(VALUE value) {
        return new Condition<>(">", name, value);
    }
    public Condition<TABLE>  lt(VALUE value) {
        return new Condition<>("<", name, value);
    }
    public Condition<TABLE>  ge(VALUE value) {
        return new Condition<>(">=", name, value);
    }
    public Condition<TABLE>  le(VALUE value) {
        return new Condition<>("<=", name, value);
    }
    public Condition<TABLE>  btw(VALUE from, VALUE to) {
        return new Condition<>("><", name, List.of(from, to));
    }
    public Condition<TABLE>  nbtw(VALUE from, VALUE to) {
        return new Condition<>("!><", name, List.of(from, to));
    }
}

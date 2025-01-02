package com.kanayaya.BitrixFluentWebhooks.model;

import java.util.function.Function;

public class Field<TABLE extends Table, VALUE> {
    private final String name;
    private final Function<VALUE, String> serializer;
    private final Function<String, VALUE> deserializer;
}

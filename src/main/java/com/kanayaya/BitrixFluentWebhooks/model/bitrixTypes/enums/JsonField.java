package com.kanayaya.BitrixFluentWebhooks.model.bitrixTypes.enums;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.kanayaya.BitrixFluentWebhooks.model.Field;
import com.kanayaya.BitrixFluentWebhooks.model.Table;

import java.util.function.Function;

public class JsonField<TABLE extends Table> extends Field<TABLE, JsonNode> {
    public JsonField(String name) {
        super(name, j->j, s -> {
            try {
                return new ObjectMapper().readTree(s);
            } catch (JsonProcessingException e) {
                throw new RuntimeException(e);
            }
        });
    }
}

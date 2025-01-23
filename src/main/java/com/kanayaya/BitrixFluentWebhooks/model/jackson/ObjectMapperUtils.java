package com.kanayaya.BitrixFluentWebhooks.model.jackson;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.kanayaya.BitrixFluentWebhooks.model.jackson.deserializers.OffsetDateTimeDeserializer;

import java.time.OffsetDateTime;

public class ObjectMapperUtils {
    public static ObjectMapper newMapper() {
        ObjectMapper objectMapper = new ObjectMapper();
        SimpleModule module = new SimpleModule();
        module.addDeserializer(OffsetDateTime.class, new OffsetDateTimeDeserializer());
        objectMapper.registerModule(module);
        return objectMapper;
    }
}

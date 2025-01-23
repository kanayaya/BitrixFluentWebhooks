package com.kanayaya.BitrixFluentWebhooks.model.bitrixTypes;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.function.Function;

public class SerializerUtils {
    public static final Function<Boolean, String> BOOLEAN_SERIALIZER = bool -> bool? "Y" : "N";
    public static final Function<String, Boolean> BOOLEAN_DESERIALIZER = s -> s.trim().equalsIgnoreCase("Y");

    public static final Function<String, Integer> INTEGER_DESERIALIZER = Integer::parseInt;
    public static final Function<String, Double> DOUBLE_DESERIALIZER = Double::parseDouble;
    public static final Function<String, LocalDate> DATE_DESERIALIZER = s -> LocalDate.parse(s, DateTimeFormatter.ISO_DATE);
    public static final Function<String, LocalDateTime> DATE_TIME_DESERIALIZER = s -> LocalDateTime.parse(s, DateTimeFormatter.ISO_DATE_TIME);
    public static final Function<String, OffsetDateTime> OFFSET_DATE_TIME_DESERIALIZER = s -> OffsetDateTime.parse(s, DateTimeFormatter.ISO_OFFSET_DATE_TIME);
    public static final Function<LocalDate, String> DATE_SERIALIZER = DateTimeFormatter.ISO_DATE::format;
    public static final Function<LocalDateTime, String> DATE_TIME_SERIALIZER = DateTimeFormatter.ISO_DATE_TIME::format;
    public static final Function<OffsetDateTime, String> OFFSET_DATE_TIME_SERIALIZER = DateTimeFormatter.ISO_OFFSET_DATE_TIME::format;
    public static final Function<String, String[]> ARRAY_DESERIALIZER = s-> {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return mapper.readValue(s, String[].class);
        } catch (JsonProcessingException e) {
            throw new IllegalArgumentException("violates json array processing rules: " + s, e);
        }
    };


}

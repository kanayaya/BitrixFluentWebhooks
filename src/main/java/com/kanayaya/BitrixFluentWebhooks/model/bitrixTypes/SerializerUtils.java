package com.kanayaya.BitrixFluentWebhooks.model.bitrixTypes;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.function.Function;

public class SerializerUtils {
    public static final Function<Boolean, String> BOOLEAN_SERIALIZER = bool -> bool? "Y" : "N";
    public static final Function<String, Boolean> BOOLEAN_DESERIALIZER = s -> s.trim().equalsIgnoreCase("Y");

    public static final Function<String, Integer> INTEGER_DESERIALIZER = Integer::parseInt;

    public static final Function<String, LocalDate> DATE_DESERIALIZER = s -> LocalDate.parse(s, DateTimeFormatter.ISO_DATE);
    public static final Function<String, LocalDateTime> DATE_TIME_DESERIALIZER = s -> LocalDateTime.parse(s, DateTimeFormatter.ISO_DATE_TIME);
    public static final Function<String, OffsetDateTime> OFFSET_DATE_TIME_DESERIALIZER = s -> OffsetDateTime.parse(s, DateTimeFormatter.ISO_OFFSET_DATE_TIME);
    public static final Function<LocalDate, String> DATE_SERIALIZER = DateTimeFormatter.ISO_DATE::format;
    public static final Function<LocalDateTime, String> DATE_TIME_SERIALIZER = DateTimeFormatter.ISO_DATE_TIME::format;
    public static final Function<OffsetDateTime, String> OFFSET_DATE_TIME_SERIALIZER = DateTimeFormatter.ISO_OFFSET_DATE_TIME::format;


}

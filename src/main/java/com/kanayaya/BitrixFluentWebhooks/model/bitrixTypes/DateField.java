package com.kanayaya.BitrixFluentWebhooks.model.bitrixTypes;

import com.kanayaya.BitrixFluentWebhooks.model.Field;
import com.kanayaya.BitrixFluentWebhooks.model.Table;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.temporal.Temporal;
import java.util.function.Function;

import static com.kanayaya.BitrixFluentWebhooks.model.bitrixTypes.SerializerUtils.*;

public class DateField<TABLE extends Table, VALUE extends Temporal> extends Field<TABLE, VALUE> {
    public DateField(String name, DateLevel<VALUE> dateLevel) {
        super(name, dateLevel::serialize, dateLevel::deserialize);
    }

    public static class DateLevel<T extends Temporal> {
        public static final DateLevel<LocalDate> DATE_LEVEL = new DateLevel<>(DATE_DESERIALIZER, DATE_SERIALIZER);
        public static final DateLevel<LocalDateTime> DATE_TIME_LEVEL = new DateLevel<>(DATE_TIME_DESERIALIZER, DATE_TIME_SERIALIZER);
        public static final DateLevel<OffsetDateTime> OFFSET_DATE_TIME_LEVEL = new DateLevel<>(OFFSET_DATE_TIME_DESERIALIZER, OFFSET_DATE_TIME_SERIALIZER);

        private final Function<String, T> deserializer;
        private final Function<T, String> serializer;

        private DateLevel(Function<String, T> deserializer, Function<T, String> serializer) {
            this.deserializer = deserializer;
            this.serializer = serializer;
        }
        public String serialize(T dateTime) {
            return serializer.apply(dateTime);
        }
        public T deserialize(String dateString) {
            return deserializer.apply(dateString);
        }
    }
}

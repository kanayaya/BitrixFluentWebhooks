package com.kanayaya.BitrixFluentWebhooks.model.bitrixTypes;

import java.util.function.Function;

public class SerializerUtils {
    public static final Function<Boolean, String> BOOLEAN_SERIALIZER = bool -> bool? "Y" : "N";
    public static final Function<String, Boolean> BOOLEAN_DESERIALIZER = s -> s.equalsIgnoreCase("Y");
    public static final Function<String, Integer> INTEGER_DESERIALIZER = Integer::parseInt;

}

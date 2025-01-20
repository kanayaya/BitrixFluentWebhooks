package com.kanayaya.BitrixFluentWebhooks.api.request;

import com.kanayaya.BitrixFluentWebhooks.model.Table;

import java.lang.reflect.Array;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.Collection;
import java.util.Map;

public class UrlBodyMaker<TABLE extends Table> {
    public static String buildQueryString(Map<String, Object> params) {
        StringBuilder queryString = new StringBuilder();
        buildQueryString(params, queryString, "");
        return queryString.toString();
    }

    private static void buildQueryString(Object value, StringBuilder queryString, String prefix) {
        if (value instanceof Map) {
            Map<?, ?> map = (Map<?, ?>) value;
            for (Map.Entry<?, ?> entry : map.entrySet()) {
                String key = prefix.isEmpty() ? entry.getKey().toString() : prefix + "[" + entry.getKey() + "]";
                buildQueryString(entry.getValue(), queryString, key);
            }
        } else if (value instanceof Collection) {
            Collection<?> collection = (Collection<?>) value;
            for (Object item : collection) {
                buildQueryString(item, queryString, prefix + "[]");
            }
        } else if (value.getClass().isArray()) {
            int length = Array.getLength(value);
            for (int i = 0; i < length; i++) {
                buildQueryString(Array.get(value, i), queryString, prefix + "[]");
            }
        } else {
            appendKeyValue(queryString, prefix, value);
        }
    }

    private static void appendKeyValue(StringBuilder queryString, String key, Object value) {
        if (queryString.length() > 0) {
            queryString.append("&");
        }
        queryString.append(URLEncoder.encode(key, StandardCharsets.UTF_8))
                .append("=")
                .append(URLEncoder.encode(String.valueOf(value), StandardCharsets.UTF_8));
    }
}

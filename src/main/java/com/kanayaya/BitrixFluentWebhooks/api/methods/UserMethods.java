package com.kanayaya.BitrixFluentWebhooks.api.methods;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.kanayaya.BitrixFluentWebhooks.BitrixRestClient;
import com.kanayaya.BitrixFluentWebhooks.api.Method;
import com.kanayaya.BitrixFluentWebhooks.exceptions.BitrixException;
import com.kanayaya.BitrixFluentWebhooks.model.Condition;
import com.kanayaya.BitrixFluentWebhooks.model.pojo.full.FullUserEntity;
import com.kanayaya.BitrixFluentWebhooks.model.tables.User;
import org.jetbrains.annotations.ApiStatus.Internal;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserMethods extends RequestStorage {
    private final BitrixRestClient client;
    private final Map<String, Object> params = new HashMap<>();
    private Method method;

    public UserMethods(BitrixRestClient client) {
        this.client = client;
    }

    @Override
    Map<String, Object> getParams() {
        return params.isEmpty()? null : params;
    }

    @Override
    Method getMethod() {
        return method;
    }

    @Override
    void addParam(String key, Object value) {
        params.put(key, value);
    }

    @Override
    void addAll(Map<String, Object> values) {
        params.putAll(values);
    }

    public FullUserEntity current() {
        try {
            return client.getMapper().treeToValue(client.invoke(Method.USER_CURRENT), FullUserEntity.class);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
    public JsonNode fields() {
        return client.invoke(Method.USER_FIELDS);
    }

    @SafeVarargs
    public final GetUser get(Condition<User>... conditions) {
        for (Condition<User> condition : conditions) {
            params.put(condition.toParam().getKey(), condition.toParam().getValue());
        }
        return new GetUser();
    }
    @Internal
    public class GetUser {
        private GetUser() {}
        public List<FullUserEntity> send() {
            ObjectMapper mapper = client.getMapper();
            JsonNode responseNode = client.invoke(Method.USER_GET, params);
            JavaType type = mapper.getTypeFactory().constructCollectionType(List.class, FullUserEntity.class);
            try {
                return mapper.treeToValue(responseNode, type);
            } catch (JsonProcessingException e) {
                throw new BitrixException(e);
            }
        }
    }
}

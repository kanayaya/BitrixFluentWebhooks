package com.kanayaya.BitrixFluentWebhooks.api.methods.user;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonNode;
import com.kanayaya.BitrixFluentWebhooks.BitrixRestClient;
import com.kanayaya.BitrixFluentWebhooks.api.Method;
import com.kanayaya.BitrixFluentWebhooks.api.methods.user.builder.UserGetArgsBuilder;
import com.kanayaya.BitrixFluentWebhooks.api.methods.user.builder.UserGetNoArgsBuilder;
import com.kanayaya.BitrixFluentWebhooks.exceptions.BitrixException;
import com.kanayaya.BitrixFluentWebhooks.model.Condition;
import com.kanayaya.BitrixFluentWebhooks.model.pojo.full.FullUserEntity;
import com.kanayaya.BitrixFluentWebhooks.model.tables.User;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserMethods {
    private final BitrixRestClient client;
    public UserGetNoArgsBuilder get() {
        return new UserGetArgsBuilder(client);
    }
    public FullUserEntity current() {
        return current(FullUserEntity.class);
    }
    public <T> T current(Class<? extends T> clazz) {
        try {
            return client.getMapper().treeToValue(client.invoke(Method.USER_CURRENT), clazz);
        } catch (JsonProcessingException e) {
            throw new BitrixException(e);
        }
    }
    @SafeVarargs
    public final <T> List<T> search(Class<? extends T> clazz, Condition<User>... conditions) {
        Map<String, Object> filter = new HashMap<>();
        for (Condition<User> c : conditions) {
            Map.Entry<String, Object> param = c.toParam();
            filter.put(param.getKey(), param.getValue());
        }
        JavaType type = client.getMapper().getTypeFactory().constructCollectionType(List.class, clazz);
        try {
            return client.getMapper().treeToValue(client.invoke(Method.USER_SEARCH, filter.isEmpty()? null : filter), type);
        } catch (JsonProcessingException e) {
            throw new BitrixException(e);
        }
    }
    @SafeVarargs
    public final List<FullUserEntity> search(Condition<User>... conditions) {
        return search(FullUserEntity.class, conditions);
    }
    public JsonNode fields() {
        return client.invoke(Method.USER_FIELDS);
    }

    public UserMethods(BitrixRestClient client) {
        this.client = client;
    }
}

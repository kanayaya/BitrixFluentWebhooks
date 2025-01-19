package com.kanayaya.BitrixFluentWebhooks.api.methods;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.kanayaya.BitrixFluentWebhooks.BitrixClient;
import com.kanayaya.BitrixFluentWebhooks.api.Method;
import com.kanayaya.BitrixFluentWebhooks.api.request.MutableFilter;
import com.kanayaya.BitrixFluentWebhooks.exceptions.BitrixException;
import com.kanayaya.BitrixFluentWebhooks.model.pojo.full.FullUserEntity;
import com.kanayaya.BitrixFluentWebhooks.model.tables.User;
import org.jetbrains.annotations.ApiStatus.Internal;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserMethods extends RequestStorage {
    private final BitrixClient client;
    private final Map<String, Object> params = new HashMap<>();
    private Method method;

    public UserMethods(BitrixClient client) {
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
            return new ObjectMapper().treeToValue(client.invoke(Method.USER_CURRENT).get("result"), FullUserEntity.class);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
    public JsonNode fields() {
        return client.invoke(Method.USER_FIELDS).get("result");
    }
    public GetUser get(MutableFilter<User> filter) {
        params.putAll(filter.getParams());
        return new GetUser();
    }
    @Internal
    public class GetUser {
        private GetUser() {}
        public List<FullUserEntity> send() {
            ObjectMapper mapper = new ObjectMapper();
            JsonNode responseNode = client.invoke(Method.USER_GET, params);
            JsonNode resultNode = responseNode.get("result");
            JavaType type = mapper.getTypeFactory().constructCollectionType(List.class, FullUserEntity.class);
            try {
                return mapper.treeToValue(resultNode, type);
            } catch (JsonProcessingException e) {
                throw new BitrixException(e);
            }
        }
    }
}

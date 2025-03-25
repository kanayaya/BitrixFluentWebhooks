package com.kanayaya.BitrixFluentWebhooks.api.methods.user.builder;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JavaType;
import com.kanayaya.BitrixFluentWebhooks.BitrixRestClient;
import com.kanayaya.BitrixFluentWebhooks.api.Method;
import com.kanayaya.BitrixFluentWebhooks.api.enums.Order;
import com.kanayaya.BitrixFluentWebhooks.exceptions.BitrixException;
import com.kanayaya.BitrixFluentWebhooks.model.Condition;
import com.kanayaya.BitrixFluentWebhooks.model.Field;
import com.kanayaya.BitrixFluentWebhooks.model.pojo.full.FullUserEntity;
import com.kanayaya.BitrixFluentWebhooks.model.tables.User;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/** Построитель аргументов для метода {@link Method#USER_GET}
 *
 */
public class UserGetArgsBuilder implements UserGetWithArgsBuilder, UserGetNoArgsBuilder, UserGetSortOrderBuilder {
    private final Map<String, Object> params = new HashMap<>();
    private final BitrixRestClient client;

    public UserGetArgsBuilder(BitrixRestClient client) {
        this.client = client;
    }


    @SafeVarargs
    @Override
    public final UserGetWithArgsBuilder withFilter(Condition<User>... conditions) {
        Map<String, Object> filter = new HashMap<>();
        for (Condition<User> c : conditions) {
            Map.Entry<String, Object> param = c.toParam();
            filter.put(param.getKey(), param.getValue());
        }
        params.put("FILTER", filter);
        return this;
    }

    @Override
    public UserGetArgsBuilder withAdminMode(boolean adminMode) {
        params.put("ADMIN_MODE", adminMode);
        return this;
    }

    @Override
    public UserGetSortOrderBuilder withSort(Field<User, ?> field) {
        params.put("sort", field.getName());
        return this;
    }

    @Override
    public UserGetWithArgsBuilder asc() {
        params.put("order", Order.ASC.getOrder());
        return this;
    }

    @Override
    public UserGetWithArgsBuilder desc() {
        params.put("order", Order.DESC.getOrder());
        return this;
    }

    @Override
    public <T> List<T> get(Class<? extends T> clazz) {
        JavaType type = client.getMapper().getTypeFactory().constructCollectionType(List.class, clazz);
        try {
            return client.getMapper().treeToValue(client.invoke(Method.USER_GET, params.isEmpty()? null : params), type);
        } catch (JsonProcessingException e) {
            throw new BitrixException(e);
        }
    }
    @Override
    public List<FullUserEntity> get() {
        return get(FullUserEntity.class);
    }
    @Override
    public <T> List<T> all(Class<? extends T> clazz) {
        return get(clazz);
    }
    @Override
    public List<FullUserEntity> all() {
        return all(FullUserEntity.class);
    }
}

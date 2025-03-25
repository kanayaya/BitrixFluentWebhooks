package com.kanayaya.BitrixFluentWebhooks.api.methods.user.builder;

import com.kanayaya.BitrixFluentWebhooks.model.Condition;
import com.kanayaya.BitrixFluentWebhooks.model.Field;
import com.kanayaya.BitrixFluentWebhooks.model.pojo.full.FullUserEntity;
import com.kanayaya.BitrixFluentWebhooks.model.tables.User;

import java.util.List;

public interface UserGetWithArgsBuilder {
    UserGetWithArgsBuilder withFilter(Condition<User>... conditions);
    UserGetWithArgsBuilder withAdminMode(boolean adminMode);
    UserGetSortOrderBuilder withSort(Field<User, ?> field);
    <T> List<T> get(Class<? extends T> clazz);
    List<FullUserEntity> get();
}

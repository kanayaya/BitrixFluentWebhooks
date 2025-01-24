package com.kanayaya.BitrixFluentWebhooks.model.bitrixTypes.entities;

import com.kanayaya.BitrixFluentWebhooks.model.Table;
import com.kanayaya.BitrixFluentWebhooks.model.pojo.idable.ActivityEntity;

import java.util.function.Function;

public class ActivityField<TABLE extends Table> extends EntityField<TABLE, ActivityEntity> {
    public ActivityField(String name) {
        super(name, s -> new ActivityEntity(Integer.parseInt(s)));
    }
}

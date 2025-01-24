package com.kanayaya.BitrixFluentWebhooks.model.bitrixTypes.entities;

import com.kanayaya.BitrixFluentWebhooks.model.Table;
import com.kanayaya.BitrixFluentWebhooks.model.pojo.idable.ActivityCommunicationEntity;

import java.util.function.Function;

public class ActivityCommunicationEntityField<TABLE extends Table> extends EntityField<TABLE, ActivityCommunicationEntity> {
    public ActivityCommunicationEntityField(String name) {
        super(name, s -> new ActivityCommunicationEntity(Integer.parseInt(s)));
    }
}

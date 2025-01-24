package com.kanayaya.BitrixFluentWebhooks.model.bitrixTypes.entities;

import com.kanayaya.BitrixFluentWebhooks.model.Table;
import com.kanayaya.BitrixFluentWebhooks.model.pojo.idable.ActivityCommunicationEntity;

public class ActivityCommunicationField<TABLE extends Table> extends EntityField<TABLE, ActivityCommunicationEntity> {
    public ActivityCommunicationField(String name) {
        super(name, s -> new ActivityCommunicationEntity(Integer.parseInt(s)));
    }
}

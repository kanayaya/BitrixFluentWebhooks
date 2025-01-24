package com.kanayaya.BitrixFluentWebhooks.model.bitrixTypes.entities;

import com.kanayaya.BitrixFluentWebhooks.model.Table;
import com.kanayaya.BitrixFluentWebhooks.model.pojo.idable.LeadEntity;

public class LeadField<TABLE extends Table> extends EntityField<TABLE, LeadEntity> {
    public LeadField(String name) {
        super(name, s -> new LeadEntity(Integer.parseInt(s)));
    }
}

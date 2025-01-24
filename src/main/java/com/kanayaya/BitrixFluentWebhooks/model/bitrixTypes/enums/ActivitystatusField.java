package com.kanayaya.BitrixFluentWebhooks.model.bitrixTypes.enums;

import com.kanayaya.BitrixFluentWebhooks.model.Field;
import com.kanayaya.BitrixFluentWebhooks.model.enums.Activitystatus;
import com.kanayaya.BitrixFluentWebhooks.model.tables.Activity;

import java.util.function.Function;

public class ActivitystatusField extends Field<Activity, Activitystatus> {
    public ActivitystatusField(String name) {
        super(name, Activitystatus::getId, s -> Activitystatus.getById(Integer.parseInt(s)));
    }
}

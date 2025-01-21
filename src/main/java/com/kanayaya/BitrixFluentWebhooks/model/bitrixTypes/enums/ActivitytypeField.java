package com.kanayaya.BitrixFluentWebhooks.model.bitrixTypes.enums;

import com.kanayaya.BitrixFluentWebhooks.model.Field;
import com.kanayaya.BitrixFluentWebhooks.model.enums.Activitytype;
import com.kanayaya.BitrixFluentWebhooks.model.tables.Activity;

public class ActivitytypeField extends Field<Activity, Activitytype> {
    public ActivitytypeField(String name) {
        super(name, Activitytype::getId, s -> Activitytype.getById(Integer.parseInt(s)));
    }
}

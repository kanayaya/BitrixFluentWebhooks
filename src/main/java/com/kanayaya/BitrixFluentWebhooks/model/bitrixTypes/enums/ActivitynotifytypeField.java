package com.kanayaya.BitrixFluentWebhooks.model.bitrixTypes.enums;

import com.kanayaya.BitrixFluentWebhooks.model.Field;
import com.kanayaya.BitrixFluentWebhooks.model.enums.Activitynotifytype;
import com.kanayaya.BitrixFluentWebhooks.model.tables.Activity;

public class ActivitynotifytypeField  extends Field<Activity, Activitynotifytype> {
    public ActivitynotifytypeField(String name) {
        super(name, Activitynotifytype::getId, s -> Activitynotifytype.getById(Integer.parseInt(s)));
    }
}

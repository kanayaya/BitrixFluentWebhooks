package com.kanayaya.BitrixFluentWebhooks.model.bitrixTypes.enums;

import com.kanayaya.BitrixFluentWebhooks.model.Field;
import com.kanayaya.BitrixFluentWebhooks.model.enums.Activitypriority;
import com.kanayaya.BitrixFluentWebhooks.model.tables.Activity;

import java.util.function.Function;

public class ActivitypriorityField extends Field<Activity, Activitypriority> {
    public ActivitypriorityField(String name) {
        super(name, Activitypriority::getId, s -> Activitypriority.getById(Integer.parseInt(s)));
    }
}

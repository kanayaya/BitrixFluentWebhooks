package com.kanayaya.BitrixFluentWebhooks.model.bitrixTypes.enums;

import com.kanayaya.BitrixFluentWebhooks.model.Field;
import com.kanayaya.BitrixFluentWebhooks.model.enums.Activitydirection;
import com.kanayaya.BitrixFluentWebhooks.model.tables.Activity;

public class ActivitydirectionField extends Field<Activity, Activitydirection> {
    public ActivitydirectionField(String name) {
        super(name, Activitydirection::getId, s -> Activitydirection.getById(Integer.parseInt(s)));
    }
}

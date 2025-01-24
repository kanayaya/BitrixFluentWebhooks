package com.kanayaya.BitrixFluentWebhooks.model.bitrixTypes.enums;

import com.kanayaya.BitrixFluentWebhooks.model.Field;
import com.kanayaya.BitrixFluentWebhooks.model.enums.Contenttype;
import com.kanayaya.BitrixFluentWebhooks.model.tables.Activity;

import java.util.function.Function;

public class ContenttypeField extends Field<Activity, Contenttype> {
    public ContenttypeField(String name) {
        super(name, Contenttype::getId, s -> Contenttype.getById(Integer.parseInt(s)));
    }
}

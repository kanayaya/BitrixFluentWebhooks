package com.kanayaya.BitrixFluentWebhooks.model.bitrixTypes.enums;

import com.kanayaya.BitrixFluentWebhooks.model.Field;
import com.kanayaya.BitrixFluentWebhooks.model.enums.Ownertype;
import com.kanayaya.BitrixFluentWebhooks.model.tables.Activity;

import java.util.function.Function;

public class OwnertypeField extends Field<Activity, Ownertype> {
    public OwnertypeField(String name) {
        super(name, Ownertype::getId, s -> Ownertype.getById(Integer.parseInt(s)));
    }
}

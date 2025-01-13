package com.kanayaya.BitrixFluentWebhooks.model.bitrixTypes;

import com.kanayaya.BitrixFluentWebhooks.model.Field;
import com.kanayaya.BitrixFluentWebhooks.model.Table;
import com.kanayaya.BitrixFluentWebhooks.model.enums.Country;

public class CountryField<TABLE extends Table> extends Field<TABLE, Country> {
    public CountryField(String name) {
        super(name, Country::toString, s -> Country.getById(Integer.parseInt(s)));
    }
}

package com.kanayaya.BitrixFluentWebhooks.model.bitrixTypes.entities;

import com.kanayaya.BitrixFluentWebhooks.model.Table;
import com.kanayaya.BitrixFluentWebhooks.model.pojo.idable.CompanyEntity;

import java.util.function.Function;

public class CompanyField<TABLE extends Table> extends EntityField<TABLE, CompanyEntity> {
    public CompanyField(String name) {
        super(name, s -> new CompanyEntity(Integer.parseInt(s)));
    }
}

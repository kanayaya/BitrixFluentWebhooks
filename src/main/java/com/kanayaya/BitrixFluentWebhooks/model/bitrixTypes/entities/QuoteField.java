package com.kanayaya.BitrixFluentWebhooks.model.bitrixTypes.entities;

import com.kanayaya.BitrixFluentWebhooks.model.Table;
import com.kanayaya.BitrixFluentWebhooks.model.pojo.idable.QuoteEntity;

public class QuoteField<TABLE extends Table> extends EntityField<TABLE, QuoteEntity>{
    public QuoteField(String name) {
        super(name, s -> new QuoteEntity(Integer.parseInt(s)));
    }
}

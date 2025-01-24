package com.kanayaya.BitrixFluentWebhooks.model.bitrixTypes.entities;

import com.kanayaya.BitrixFluentWebhooks.model.Table;
import com.kanayaya.BitrixFluentWebhooks.model.pojo.idable.ContactEntity;

public class ContactField<TABLE extends Table> extends EntityField<TABLE, ContactEntity> {
    public ContactField(String name) {
        super(name, s -> new ContactEntity(Integer.parseInt(s)));
    }
}

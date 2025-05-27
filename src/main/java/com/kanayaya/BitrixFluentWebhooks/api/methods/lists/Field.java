package com.kanayaya.BitrixFluentWebhooks.api.methods.lists;

import com.kanayaya.BitrixFluentWebhooks.BitrixRestClient;
import com.kanayaya.BitrixFluentWebhooks.api.methods.lists.field.Type;

public class Field {
    public final Type type;
    private final BitrixRestClient client;

    public Field(BitrixRestClient client) {
        this.client = client;
        type = new Type(client);
    }

    // public void add() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#LISTS_FIELD_ADD
    // public void get() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#LISTS_FIELD_GET
    // public void update() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#LISTS_FIELD_UPDATE
    // public void delete() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#LISTS_FIELD_DELETE
}
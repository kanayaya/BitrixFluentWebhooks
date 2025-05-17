package com.kanayaya.BitrixFluentWebhooks.api.methods.entity;

import com.kanayaya.BitrixFluentWebhooks.BitrixRestClient;
import com.kanayaya.BitrixFluentWebhooks.api.methods.entity.item.Property;

public class Item {
    public final Property property;
    private final BitrixRestClient client;

    public Item(BitrixRestClient client) {
        this.client = client;
        property = new Property(client);
    }

    // public void add() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#ENTITY_ITEM_ADD
    // public void get() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#ENTITY_ITEM_GET
    // public void update() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#ENTITY_ITEM_UPDATE
    // public void delete() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#ENTITY_ITEM_DELETE
}
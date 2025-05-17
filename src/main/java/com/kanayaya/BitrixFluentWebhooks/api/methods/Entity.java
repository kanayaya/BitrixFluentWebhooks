package com.kanayaya.BitrixFluentWebhooks.api.methods;

import com.kanayaya.BitrixFluentWebhooks.BitrixRestClient;
import com.kanayaya.BitrixFluentWebhooks.api.methods.entity.Item;
import com.kanayaya.BitrixFluentWebhooks.api.methods.entity.Section;

public class Entity {
    public final Item item;
    public final Section section;
    private final BitrixRestClient client;

    public Entity(BitrixRestClient client) {
        this.client = client;
        item = new Item(client);
        section = new Section(client);
    }

    // public void add() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#ENTITY_ADD
    // public void get() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#ENTITY_GET
    // public void rights() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#ENTITY_RIGHTS
    // public void update() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#ENTITY_UPDATE
    // public void delete() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#ENTITY_DELETE
}
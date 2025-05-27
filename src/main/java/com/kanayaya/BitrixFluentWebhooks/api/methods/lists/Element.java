package com.kanayaya.BitrixFluentWebhooks.api.methods.lists;

import com.kanayaya.BitrixFluentWebhooks.BitrixRestClient;
import com.kanayaya.BitrixFluentWebhooks.api.methods.lists.element.Get;

public class Element {
    public final Get get;
    private final BitrixRestClient client;

    public Element(BitrixRestClient client) {
        this.client = client;
        get = new Get(client);
    }

    // public void add() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#LISTS_ELEMENT_ADD
    // public void get() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#LISTS_ELEMENT_GET
    // public void update() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#LISTS_ELEMENT_UPDATE
    // public void delete() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#LISTS_ELEMENT_DELETE
}
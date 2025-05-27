package com.kanayaya.BitrixFluentWebhooks.api.methods.crm;

import com.kanayaya.BitrixFluentWebhooks.BitrixRestClient;
import com.kanayaya.BitrixFluentWebhooks.api.methods.crm.calllist.Items;

public class Calllist {
    public final Items items;
    private final BitrixRestClient client;

    public Calllist(BitrixRestClient client) {
        this.client = client;
        items = new Items(client);
    }

    // public void add() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#CRM_CALLLIST_ADD
    // public void statuslist() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#CRM_CALLLIST_STATUSLIST
    // public void get() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#CRM_CALLLIST_GET
    // public void update() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#CRM_CALLLIST_UPDATE
    // public void list() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#CRM_CALLLIST_LIST
}
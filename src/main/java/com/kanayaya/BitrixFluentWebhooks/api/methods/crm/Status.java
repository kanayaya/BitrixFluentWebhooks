package com.kanayaya.BitrixFluentWebhooks.api.methods.crm;

import com.kanayaya.BitrixFluentWebhooks.BitrixRestClient;
import com.kanayaya.BitrixFluentWebhooks.api.methods.crm.status.Entity;
import com.kanayaya.BitrixFluentWebhooks.api.methods.crm.status.Extra;

public class Status {
    public final Extra extra;
    public final Entity entity;
    private final BitrixRestClient client;

    public Status(BitrixRestClient client) {
        this.client = client;
        extra = new Extra(client);
        entity = new Entity(client);
    }

    // public void add() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#CRM_STATUS_ADD
    // public void get() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#CRM_STATUS_GET
    // public void update() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#CRM_STATUS_UPDATE
    // public void list() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#CRM_STATUS_LIST
    // public void fields() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#CRM_STATUS_FIELDS
    // public void delete() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#CRM_STATUS_DELETE
}
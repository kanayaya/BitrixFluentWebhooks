package com.kanayaya.BitrixFluentWebhooks.api.methods.crm;

import com.kanayaya.BitrixFluentWebhooks.BitrixRestClient;
import com.kanayaya.BitrixFluentWebhooks.api.methods.crm.activity.Type;
import com.kanayaya.BitrixFluentWebhooks.api.methods.crm.activity.*;

public class Activity {
    public final Todo todo;
    public final Layout layout;
    public final Binding binding;
    public final Type type;
    public final Communication communication;
    public final Configurable configurable;
    private final BitrixRestClient client;

    public Activity(BitrixRestClient client) {
        this.client = client;
        todo = new Todo(client);
        layout = new Layout(client);
        binding = new Binding(client);
        type = new Type(client);
        communication = new Communication(client);
        configurable = new Configurable(client);
    }

    // public void add() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#CRM_ACTIVITY_ADD
    // public void get() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#CRM_ACTIVITY_GET
    // public void update() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#CRM_ACTIVITY_UPDATE
    // public void list() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#CRM_ACTIVITY_LIST
    // public void fields() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#CRM_ACTIVITY_FIELDS
    // public void delete() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#CRM_ACTIVITY_DELETE
}
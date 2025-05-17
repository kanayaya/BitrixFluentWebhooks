package com.kanayaya.BitrixFluentWebhooks.api.methods.crm;

import com.kanayaya.BitrixFluentWebhooks.BitrixRestClient;
import com.kanayaya.BitrixFluentWebhooks.api.methods.crm.requisite.Bankdetail;
import com.kanayaya.BitrixFluentWebhooks.api.methods.crm.requisite.Link;
import com.kanayaya.BitrixFluentWebhooks.api.methods.crm.requisite.Preset;
import com.kanayaya.BitrixFluentWebhooks.api.methods.crm.requisite.Userfield;

public class Requisite {
    public final Userfield userfield;
    public final Link link;
    public final Preset preset;
    public final Bankdetail bankdetail;
    private final BitrixRestClient client;

    public Requisite(BitrixRestClient client) {
        this.client = client;
        userfield = new Userfield(client);
        link = new Link(client);
        preset = new Preset(client);
        bankdetail = new Bankdetail(client);
    }

    // public void add() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#CRM_REQUISITE_ADD
    // public void get() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#CRM_REQUISITE_GET
    // public void update() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#CRM_REQUISITE_UPDATE
    // public void list() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#CRM_REQUISITE_LIST
    // public void fields() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#CRM_REQUISITE_FIELDS
    // public void delete() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#CRM_REQUISITE_DELETE
}
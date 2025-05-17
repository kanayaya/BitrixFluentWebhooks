package com.kanayaya.BitrixFluentWebhooks.api.methods.crm;

import com.kanayaya.BitrixFluentWebhooks.BitrixRestClient;
import com.kanayaya.BitrixFluentWebhooks.api.methods.crm.userfield.Enumeration;
import com.kanayaya.BitrixFluentWebhooks.api.methods.crm.userfield.Settings;

public class Userfield {
    public final Settings settings;
    public final Enumeration enumeration;
    private final BitrixRestClient client;

    public Userfield(BitrixRestClient client) {
        this.client = client;
        settings = new Settings(client);
        enumeration = new Enumeration(client);
    }

    // public void types() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#CRM_USERFIELD_TYPES
    // public void fields() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#CRM_USERFIELD_FIELDS
}
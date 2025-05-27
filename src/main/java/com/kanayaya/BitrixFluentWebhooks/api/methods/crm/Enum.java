package com.kanayaya.BitrixFluentWebhooks.api.methods.crm;

import com.kanayaya.BitrixFluentWebhooks.BitrixRestClient;
import com.kanayaya.BitrixFluentWebhooks.api.methods.crm.anEnum.Entityeditor;
import com.kanayaya.BitrixFluentWebhooks.api.methods.crm.anEnum.Settings;

public class Enum {
    public final Settings settings;
    public final Entityeditor entityeditor;
    private final BitrixRestClient client;

    public Enum(BitrixRestClient client) {
        this.client = client;
        settings = new Settings(client);
        entityeditor = new Entityeditor(client);
    }

    // public void activitypriority() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#CRM_ENUM_ACTIVITYPRIORITY
    // public void activitydirection() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#CRM_ENUM_ACTIVITYDIRECTION
    // public void activitystatus() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#CRM_ENUM_ACTIVITYSTATUS
    // public void ownertype() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#CRM_ENUM_OWNERTYPE
    // public void addresstype() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#CRM_ENUM_ADDRESSTYPE
    // public void activitynotifytype() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#CRM_ENUM_ACTIVITYNOTIFYTYPE
    // public void fields() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#CRM_ENUM_FIELDS
    // public void activitytype() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#CRM_ENUM_ACTIVITYTYPE
    // public void contenttype() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#CRM_ENUM_CONTENTTYPE
}
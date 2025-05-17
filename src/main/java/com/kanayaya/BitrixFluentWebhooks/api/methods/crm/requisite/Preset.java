package com.kanayaya.BitrixFluentWebhooks.api.methods.crm.requisite;

import com.kanayaya.BitrixFluentWebhooks.BitrixRestClient;
import com.kanayaya.BitrixFluentWebhooks.api.methods.crm.requisite.preset.Field;

public class Preset {
    public final Field field;
    private final BitrixRestClient client;

    public Preset(BitrixRestClient client) {
        this.client = client;
        field = new Field(client);
    }

    // public void add() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#CRM_REQUISITE_PRESET_ADD
    // public void get() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#CRM_REQUISITE_PRESET_GET
    // public void update() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#CRM_REQUISITE_PRESET_UPDATE
    // public void countries() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#CRM_REQUISITE_PRESET_COUNTRIES
    // public void list() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#CRM_REQUISITE_PRESET_LIST
    // public void fields() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#CRM_REQUISITE_PRESET_FIELDS
    // public void delete() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#CRM_REQUISITE_PRESET_DELETE
}
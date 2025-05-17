package com.kanayaya.BitrixFluentWebhooks.api.methods.crm;

import com.kanayaya.BitrixFluentWebhooks.BitrixRestClient;
import com.kanayaya.BitrixFluentWebhooks.api.methods.crm.currency.Base;
import com.kanayaya.BitrixFluentWebhooks.api.methods.crm.currency.Localizations;

public class Currency {
    public final Localizations localizations;
    public final Base base;
    private final BitrixRestClient client;

    public Currency(BitrixRestClient client) {
        this.client = client;
        localizations = new Localizations(client);
        base = new Base(client);
    }

    // public void add() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#CRM_CURRENCY_ADD
    // public void get() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#CRM_CURRENCY_GET
    // public void update() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#CRM_CURRENCY_UPDATE
    // public void list() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#CRM_CURRENCY_LIST
    // public void fields() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#CRM_CURRENCY_FIELDS
    // public void delete() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#CRM_CURRENCY_DELETE
}
package com.kanayaya.BitrixFluentWebhooks.api.methods.crm.quote;

import com.kanayaya.BitrixFluentWebhooks.BitrixRestClient;
import com.kanayaya.BitrixFluentWebhooks.api.methods.crm.quote.contact.Items;

public class Contact {
    public final Items items;
    private final BitrixRestClient client;

    public Contact(BitrixRestClient client) {
        this.client = client;
        items = new Items(client);
    }

    // public void add() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#CRM_QUOTE_CONTACT_ADD
    // public void fields() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#CRM_QUOTE_CONTACT_FIELDS
    // public void delete() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#CRM_QUOTE_CONTACT_DELETE
}
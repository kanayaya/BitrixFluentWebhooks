package com.kanayaya.BitrixFluentWebhooks.api.methods.crm;

import com.kanayaya.BitrixFluentWebhooks.BitrixRestClient;
import com.kanayaya.BitrixFluentWebhooks.api.methods.crm.quote.Contact;
import com.kanayaya.BitrixFluentWebhooks.api.methods.crm.quote.Productrows;
import com.kanayaya.BitrixFluentWebhooks.api.methods.crm.quote.Userfield;

public class Quote {
    public final Userfield userfield;
    public final Contact contact;
    public final Productrows productrows;
    private final BitrixRestClient client;

    public Quote(BitrixRestClient client) {
        this.client = client;
        userfield = new Userfield(client);
        contact = new Contact(client);
        productrows = new Productrows(client);
    }

    // public void add() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#CRM_QUOTE_ADD
    // public void get() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#CRM_QUOTE_GET
    // public void update() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#CRM_QUOTE_UPDATE
    // public void list() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#CRM_QUOTE_LIST
    // public void fields() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#CRM_QUOTE_FIELDS
    // public void delete() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#CRM_QUOTE_DELETE
}
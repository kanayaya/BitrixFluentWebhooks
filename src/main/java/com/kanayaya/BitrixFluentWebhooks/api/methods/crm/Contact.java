package com.kanayaya.BitrixFluentWebhooks.api.methods.crm;

import com.kanayaya.BitrixFluentWebhooks.BitrixRestClient;
import com.kanayaya.BitrixFluentWebhooks.api.methods.crm.contact.Company;
import com.kanayaya.BitrixFluentWebhooks.api.methods.crm.contact.Details;
import com.kanayaya.BitrixFluentWebhooks.api.methods.crm.contact.Userfield;

public class Contact {
    public final Userfield userfield;
    public final Details details;
    public final Company company;
    private final BitrixRestClient client;

    public Contact(BitrixRestClient client) {
        this.client = client;
        userfield = new Userfield(client);
        details = new Details(client);
        company = new Company(client);
    }

    // public void add() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#CRM_CONTACT_ADD
    // public void get() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#CRM_CONTACT_GET
    // public void update() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#CRM_CONTACT_UPDATE
    // public void list() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#CRM_CONTACT_LIST
    // public void fields() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#CRM_CONTACT_FIELDS
    // public void delete() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#CRM_CONTACT_DELETE
}
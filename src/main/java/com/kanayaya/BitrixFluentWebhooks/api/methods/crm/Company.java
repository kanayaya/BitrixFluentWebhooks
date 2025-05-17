package com.kanayaya.BitrixFluentWebhooks.api.methods.crm;

import com.kanayaya.BitrixFluentWebhooks.BitrixRestClient;
import com.kanayaya.BitrixFluentWebhooks.api.methods.crm.company.Contact;
import com.kanayaya.BitrixFluentWebhooks.api.methods.crm.company.Details;
import com.kanayaya.BitrixFluentWebhooks.api.methods.crm.company.Userfield;

public class Company {
    public final Userfield userfield;
    public final Contact contact;
    public final Details details;
    private final BitrixRestClient client;

    public Company(BitrixRestClient client) {
        this.client = client;
        userfield = new Userfield(client);
        contact = new Contact(client);
        details = new Details(client);
    }

    // public void add() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#CRM_COMPANY_ADD
    // public void get() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#CRM_COMPANY_GET
    // public void update() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#CRM_COMPANY_UPDATE
    // public void list() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#CRM_COMPANY_LIST
    // public void fields() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#CRM_COMPANY_FIELDS
    // public void delete() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#CRM_COMPANY_DELETE
}
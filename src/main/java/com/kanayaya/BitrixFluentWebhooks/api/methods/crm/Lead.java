package com.kanayaya.BitrixFluentWebhooks.api.methods.crm;

import com.kanayaya.BitrixFluentWebhooks.BitrixRestClient;
import com.kanayaya.BitrixFluentWebhooks.api.methods.crm.lead.Contact;
import com.kanayaya.BitrixFluentWebhooks.api.methods.crm.lead.Details;
import com.kanayaya.BitrixFluentWebhooks.api.methods.crm.lead.Productrows;
import com.kanayaya.BitrixFluentWebhooks.api.methods.crm.lead.Userfield;

public class Lead {
    public final Userfield userfield;
    public final Contact contact;
    public final Details details;
    public final Productrows productrows;
    private final BitrixRestClient client;

    public Lead(BitrixRestClient client) {
        this.client = client;
        userfield = new Userfield(client);
        contact = new Contact(client);
        details = new Details(client);
        productrows = new Productrows(client);
    }

    // public void add() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#CRM_LEAD_ADD
    // public void get() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#CRM_LEAD_GET
    // public void update() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#CRM_LEAD_UPDATE
    // public void list() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#CRM_LEAD_LIST
    // public void fields() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#CRM_LEAD_FIELDS
    // public void delete() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#CRM_LEAD_DELETE
}
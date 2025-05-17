package com.kanayaya.BitrixFluentWebhooks.api.methods.crm;

import com.kanayaya.BitrixFluentWebhooks.BitrixRestClient;
import com.kanayaya.BitrixFluentWebhooks.api.methods.crm.deal.Contact;
import com.kanayaya.BitrixFluentWebhooks.api.methods.crm.deal.Userfield;
import com.kanayaya.BitrixFluentWebhooks.api.methods.crm.deal.*;

public class Deal {
    public final Userfield userfield;
    public final Recurring recurring;
    public final Contact contact;
    public final Details details;
    public final Productrows productrows;
    private final BitrixRestClient client;

    public Deal(BitrixRestClient client) {
        this.client = client;
        userfield = new Userfield(client);
        recurring = new Recurring(client);
        contact = new Contact(client);
        details = new Details(client);
        productrows = new Productrows(client);
    }

    // public void add() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#CRM_DEAL_ADD
    // public void get() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#CRM_DEAL_GET
    // public void update() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#CRM_DEAL_UPDATE
    // public void list() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#CRM_DEAL_LIST
    // public void fields() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#CRM_DEAL_FIELDS
    // public void delete() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#CRM_DEAL_DELETE
}
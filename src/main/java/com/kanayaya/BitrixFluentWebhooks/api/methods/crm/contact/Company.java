package com.kanayaya.BitrixFluentWebhooks.api.methods.crm.contact;

import com.kanayaya.BitrixFluentWebhooks.BitrixRestClient;
import com.kanayaya.BitrixFluentWebhooks.api.methods.crm.contact.company.Items;

public class Company {
    public final Items items;
    private final BitrixRestClient client;

    public Company(BitrixRestClient client) {
        this.client = client;
        items = new Items(client);
    }

    // public void add() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#CRM_CONTACT_COMPANY_ADD
    // public void fields() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#CRM_CONTACT_COMPANY_FIELDS
    // public void delete() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#CRM_CONTACT_COMPANY_DELETE
}
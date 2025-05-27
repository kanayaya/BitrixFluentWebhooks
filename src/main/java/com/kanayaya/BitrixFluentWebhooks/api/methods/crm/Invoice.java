package com.kanayaya.BitrixFluentWebhooks.api.methods.crm;

import com.kanayaya.BitrixFluentWebhooks.BitrixRestClient;
import com.kanayaya.BitrixFluentWebhooks.api.methods.crm.invoice.Recurring;
import com.kanayaya.BitrixFluentWebhooks.api.methods.crm.invoice.Status;
import com.kanayaya.BitrixFluentWebhooks.api.methods.crm.invoice.Userfield;

public class Invoice {
    public final Userfield userfield;
    public final Recurring recurring;
    public final Status status;
    private final BitrixRestClient client;

    public Invoice(BitrixRestClient client) {
        this.client = client;
        userfield = new Userfield(client);
        recurring = new Recurring(client);
        status = new Status(client);
    }

    // public void add() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#CRM_INVOICE_ADD
    // public void get() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#CRM_INVOICE_GET
    // public void update() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#CRM_INVOICE_UPDATE
    // public void list() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#CRM_INVOICE_LIST
    // public void fields() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#CRM_INVOICE_FIELDS
    // public void getexternallink() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#CRM_INVOICE_GETEXTERNALLINK
    // public void delete() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#CRM_INVOICE_DELETE
}
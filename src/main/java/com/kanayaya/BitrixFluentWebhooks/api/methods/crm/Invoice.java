package com.kanayaya.BitrixFluentWebhooks.api.methods.crm;

import com.kanayaya.BitrixFluentWebhooks.BitrixRestClient;
import com.kanayaya.BitrixFluentWebhooks.api.methods.crm.invoice.Status;

public class Invoice {
    public final Status status;
    private final BitrixRestClient client;

    public Invoice(BitrixRestClient client) {
        this.client = client;
        status = new Status(client);
    }


}
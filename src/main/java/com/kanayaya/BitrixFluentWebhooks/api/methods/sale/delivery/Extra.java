package com.kanayaya.BitrixFluentWebhooks.api.methods.sale.delivery;

import com.kanayaya.BitrixFluentWebhooks.BitrixRestClient;
import com.kanayaya.BitrixFluentWebhooks.api.methods.sale.delivery.extra.Service;

public class Extra {
    public final Service service;
    private final BitrixRestClient client;

    public Extra(BitrixRestClient client) {
        this.client = client;
        service = new Service(client);
    }


}
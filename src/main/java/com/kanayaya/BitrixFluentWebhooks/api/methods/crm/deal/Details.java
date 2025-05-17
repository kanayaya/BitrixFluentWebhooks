package com.kanayaya.BitrixFluentWebhooks.api.methods.crm.deal;

import com.kanayaya.BitrixFluentWebhooks.BitrixRestClient;
import com.kanayaya.BitrixFluentWebhooks.api.methods.crm.deal.details.Configuration;

public class Details {
    public final Configuration configuration;
    private final BitrixRestClient client;

    public Details(BitrixRestClient client) {
        this.client = client;
        configuration = new Configuration(client);
    }


}
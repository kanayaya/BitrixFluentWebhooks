package com.kanayaya.BitrixFluentWebhooks.api.methods.crm;

import com.kanayaya.BitrixFluentWebhooks.BitrixRestClient;
import com.kanayaya.BitrixFluentWebhooks.api.methods.crm.sitebutton.Configuration;

public class Sitebutton {
    public final Configuration configuration;
    private final BitrixRestClient client;

    public Sitebutton(BitrixRestClient client) {
        this.client = client;
        configuration = new Configuration(client);
    }


}
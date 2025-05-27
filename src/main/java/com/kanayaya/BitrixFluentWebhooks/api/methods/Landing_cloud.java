package com.kanayaya.BitrixFluentWebhooks.api.methods;

import com.kanayaya.BitrixFluentWebhooks.BitrixRestClient;
import com.kanayaya.BitrixFluentWebhooks.api.methods.landing_cloud.Cloud;

public class Landing_cloud {
    public final Cloud cloud;
    private final BitrixRestClient client;

    public Landing_cloud(BitrixRestClient client) {
        this.client = client;
        cloud = new Cloud(client);
    }


}
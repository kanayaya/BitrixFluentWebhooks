package com.kanayaya.BitrixFluentWebhooks.api.methods;

import com.kanayaya.BitrixFluentWebhooks.BitrixRestClient;
import com.kanayaya.BitrixFluentWebhooks.api.methods.humanresources.Hcmlink;

public class Humanresources {
    public final Hcmlink hcmlink;
    private final BitrixRestClient client;

    public Humanresources(BitrixRestClient client) {
        this.client = client;
        hcmlink = new Hcmlink(client);
    }


}
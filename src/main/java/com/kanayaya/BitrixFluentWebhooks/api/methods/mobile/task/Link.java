package com.kanayaya.BitrixFluentWebhooks.api.methods.mobile.task;

import com.kanayaya.BitrixFluentWebhooks.BitrixRestClient;
import com.kanayaya.BitrixFluentWebhooks.api.methods.mobile.task.link.Params;

public class Link {
    public final Params params;
    private final BitrixRestClient client;

    public Link(BitrixRestClient client) {
        this.client = client;
        params = new Params(client);
    }


}
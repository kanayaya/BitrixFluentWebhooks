package com.kanayaya.BitrixFluentWebhooks.api.methods;

import com.kanayaya.BitrixFluentWebhooks.BitrixRestClient;
import com.kanayaya.BitrixFluentWebhooks.api.methods.tasks_extended.Meta;

public class Tasks_extended {
    public final Meta meta;
    private final BitrixRestClient client;

    public Tasks_extended(BitrixRestClient client) {
        this.client = client;
        meta = new Meta(client);
    }


}
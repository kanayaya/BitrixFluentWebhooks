package com.kanayaya.BitrixFluentWebhooks.api.methods.mobile;

import com.kanayaya.BitrixFluentWebhooks.BitrixRestClient;
import com.kanayaya.BitrixFluentWebhooks.api.methods.mobile.task.Link;

public class Task {
    public final Link link;
    private final BitrixRestClient client;

    public Task(BitrixRestClient client) {
        this.client = client;
        link = new Link(client);
    }


}
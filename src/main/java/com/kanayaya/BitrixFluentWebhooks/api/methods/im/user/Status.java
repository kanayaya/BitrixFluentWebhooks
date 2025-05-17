package com.kanayaya.BitrixFluentWebhooks.api.methods.im.user;

import com.kanayaya.BitrixFluentWebhooks.BitrixRestClient;
import com.kanayaya.BitrixFluentWebhooks.api.methods.im.user.status.Idle;

public class Status {
    public final Idle idle;
    private final BitrixRestClient client;

    public Status(BitrixRestClient client) {
        this.client = client;
        idle = new Idle(client);
    }

    // public void set() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#IM_USER_STATUS_SET
    // public void get() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#IM_USER_STATUS_GET
}
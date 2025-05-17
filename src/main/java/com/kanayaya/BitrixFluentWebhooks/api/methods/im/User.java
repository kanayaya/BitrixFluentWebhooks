package com.kanayaya.BitrixFluentWebhooks.api.methods.im;

import com.kanayaya.BitrixFluentWebhooks.BitrixRestClient;
import com.kanayaya.BitrixFluentWebhooks.api.methods.im.user.List;
import com.kanayaya.BitrixFluentWebhooks.api.methods.im.user.Status;

public class User {
    public final List list;
    public final Status status;
    private final BitrixRestClient client;

    public User(BitrixRestClient client) {
        this.client = client;
        list = new List(client);
        status = new Status(client);
    }

    // public void get() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#IM_USER_GET
}
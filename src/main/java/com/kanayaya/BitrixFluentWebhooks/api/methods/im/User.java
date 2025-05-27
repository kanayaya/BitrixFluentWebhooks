package com.kanayaya.BitrixFluentWebhooks.api.methods.im;

import com.kanayaya.BitrixFluentWebhooks.BitrixRestClient;
import com.kanayaya.BitrixFluentWebhooks.api.methods.im.user.Business;
import com.kanayaya.BitrixFluentWebhooks.api.methods.im.user.List;
import com.kanayaya.BitrixFluentWebhooks.api.methods.im.user.Status;

public class User {
    public final Business business;
    public final List list;
    public final Status status;
    private final BitrixRestClient client;

    public User(BitrixRestClient client) {
        this.client = client;
        business = new Business(client);
        list = new List(client);
        status = new Status(client);
    }

    // public void get() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#IM_USER_GET
}
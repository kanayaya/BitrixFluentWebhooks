package com.kanayaya.BitrixFluentWebhooks.api.methods;

import com.kanayaya.BitrixFluentWebhooks.BitrixRestClient;
import com.kanayaya.BitrixFluentWebhooks.api.methods.user.Option;
import com.kanayaya.BitrixFluentWebhooks.api.methods.user.Userfield;

public class User {
    public final Userfield userfield;
    public final Option option;
    private final BitrixRestClient client;

    public User(BitrixRestClient client) {
        this.client = client;
        userfield = new Userfield(client);
        option = new Option(client);
    }

    // public void add() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#USER_ADD
    // public void search() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#USER_SEARCH
    // public void current() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#USER_CURRENT
    // public void access() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#USER_ACCESS
    // public void get() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#USER_GET
    // public void update() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#USER_UPDATE
    // public void admin() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#USER_ADMIN
    // public void fields() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#USER_FIELDS
}
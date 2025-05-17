package com.kanayaya.BitrixFluentWebhooks.api.methods;

import com.kanayaya.BitrixFluentWebhooks.BitrixRestClient;
import com.kanayaya.BitrixFluentWebhooks.api.methods.sonet_group.Feature;
import com.kanayaya.BitrixFluentWebhooks.api.methods.sonet_group.User;

public class Sonet_group {
    public final Feature feature;
    public final User user;
    private final BitrixRestClient client;

    public Sonet_group(BitrixRestClient client) {
        this.client = client;
        feature = new Feature(client);
        user = new User(client);
    }

    // public void setowner() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#SONET_GROUP_SETOWNER
    // public void get() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#SONET_GROUP_GET
    // public void update() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#SONET_GROUP_UPDATE
    // public void create() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#SONET_GROUP_CREATE
    // public void delete() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#SONET_GROUP_DELETE
}
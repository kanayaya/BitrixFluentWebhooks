package com.kanayaya.BitrixFluentWebhooks.api.methods.log;

import com.kanayaya.BitrixFluentWebhooks.BitrixRestClient;
import com.kanayaya.BitrixFluentWebhooks.api.methods.log.blogpost.Getusers;

public class Blogpost {
    public final Getusers getusers;
    private final BitrixRestClient client;

    public Blogpost(BitrixRestClient client) {
        this.client = client;
        getusers = new Getusers(client);
    }

    // public void add() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#LOG_BLOGPOST_ADD
    // public void get() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#LOG_BLOGPOST_GET
    // public void update() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#LOG_BLOGPOST_UPDATE
    // public void share() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#LOG_BLOGPOST_SHARE
    // public void delete() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#LOG_BLOGPOST_DELETE
}
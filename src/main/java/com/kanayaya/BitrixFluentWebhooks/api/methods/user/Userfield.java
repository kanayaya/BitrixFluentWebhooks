package com.kanayaya.BitrixFluentWebhooks.api.methods.user;

import com.kanayaya.BitrixFluentWebhooks.BitrixRestClient;
import com.kanayaya.BitrixFluentWebhooks.api.methods.user.userfield.File;

public class Userfield {
    public final File file;
    private final BitrixRestClient client;

    public Userfield(BitrixRestClient client) {
        this.client = client;
        file = new File(client);
    }

    // public void add() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#USER_USERFIELD_ADD
    // public void update() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#USER_USERFIELD_UPDATE
    // public void list() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#USER_USERFIELD_LIST
    // public void delete() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#USER_USERFIELD_DELETE
}
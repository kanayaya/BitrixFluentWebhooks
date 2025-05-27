package com.kanayaya.BitrixFluentWebhooks.api.methods.user;

import com.kanayaya.BitrixFluentWebhooks.BitrixRestClient;
import com.kanayaya.BitrixFluentWebhooks.api.methods.user.history.Fields;

public class History {
    public final Fields fields;
    private final BitrixRestClient client;

    public History(BitrixRestClient client) {
        this.client = client;
        fields = new Fields(client);
    }

    // public void list() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#USER_HISTORY_LIST
}
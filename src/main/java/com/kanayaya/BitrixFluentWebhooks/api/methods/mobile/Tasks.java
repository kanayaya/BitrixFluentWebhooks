package com.kanayaya.BitrixFluentWebhooks.api.methods.mobile;

import com.kanayaya.BitrixFluentWebhooks.BitrixRestClient;
import com.kanayaya.BitrixFluentWebhooks.api.methods.mobile.tasks.Deadlines;
import com.kanayaya.BitrixFluentWebhooks.api.methods.mobile.tasks.Group;

public class Tasks {
    public final Deadlines deadlines;
    public final Group group;
    private final BitrixRestClient client;

    public Tasks(BitrixRestClient client) {
        this.client = client;
        deadlines = new Deadlines(client);
        group = new Group(client);
    }


}
package com.kanayaya.BitrixFluentWebhooks.api.methods;

import com.kanayaya.BitrixFluentWebhooks.BitrixRestClient;
import com.kanayaya.BitrixFluentWebhooks.api.methods.tasks.Api;
import com.kanayaya.BitrixFluentWebhooks.api.methods.tasks.Task;

public class Tasks {
    public final Task task;
    public final Api api;
    private final BitrixRestClient client;

    public Tasks(BitrixRestClient client) {
        this.client = client;
        task = new Task(client);
        api = new Api(client);
    }


}
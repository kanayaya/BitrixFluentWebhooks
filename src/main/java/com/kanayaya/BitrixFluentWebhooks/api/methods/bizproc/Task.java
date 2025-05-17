package com.kanayaya.BitrixFluentWebhooks.api.methods.bizproc;

import com.kanayaya.BitrixFluentWebhooks.BitrixRestClient;


public class Task {
    private final BitrixRestClient client;


    public Task(BitrixRestClient client) {
        this.client = client;
    }

    // public void list() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#BIZPROC_TASK_LIST
    // public void complete() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#BIZPROC_TASK_COMPLETE
}
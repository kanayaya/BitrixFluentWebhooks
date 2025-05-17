package com.kanayaya.BitrixFluentWebhooks.api.methods.bizproc;

import com.kanayaya.BitrixFluentWebhooks.BitrixRestClient;


public class Event {
    private final BitrixRestClient client;


    public Event(BitrixRestClient client) {
        this.client = client;
    }

    // public void send() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#BIZPROC_EVENT_SEND
}
package com.kanayaya.BitrixFluentWebhooks.api.methods.imconnector.send;

import com.kanayaya.BitrixFluentWebhooks.BitrixRestClient;


public class Status {
    private final BitrixRestClient client;


    public Status(BitrixRestClient client) {
        this.client = client;
    }

    // public void delivery() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#IMCONNECTOR_SEND_STATUS_DELIVERY
    // public void reading() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#IMCONNECTOR_SEND_STATUS_READING
}
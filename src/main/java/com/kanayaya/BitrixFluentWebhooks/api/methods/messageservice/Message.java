package com.kanayaya.BitrixFluentWebhooks.api.methods.messageservice;

import com.kanayaya.BitrixFluentWebhooks.BitrixRestClient;
import com.kanayaya.BitrixFluentWebhooks.api.methods.messageservice.message.Status;

public class Message {
    public final Status status;
    private final BitrixRestClient client;

    public Message(BitrixRestClient client) {
        this.client = client;
        status = new Status(client);
    }


}
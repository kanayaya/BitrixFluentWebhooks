package com.kanayaya.BitrixFluentWebhooks.api.methods.imconnector;

import com.kanayaya.BitrixFluentWebhooks.BitrixRestClient;
import com.kanayaya.BitrixFluentWebhooks.api.methods.imconnector.send.Status;

public class Send {
    public final Status status;
    private final BitrixRestClient client;

    public Send(BitrixRestClient client) {
        this.client = client;
        status = new Status(client);
    }

    // public void messages() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#IMCONNECTOR_SEND_MESSAGES
}
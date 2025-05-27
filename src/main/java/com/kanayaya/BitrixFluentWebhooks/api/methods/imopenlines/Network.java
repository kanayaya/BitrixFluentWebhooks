package com.kanayaya.BitrixFluentWebhooks.api.methods.imopenlines;

import com.kanayaya.BitrixFluentWebhooks.BitrixRestClient;
import com.kanayaya.BitrixFluentWebhooks.api.methods.imopenlines.network.Message;

public class Network {
    public final Message message;
    private final BitrixRestClient client;

    public Network(BitrixRestClient client) {
        this.client = client;
        message = new Message(client);
    }

    // public void join() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#IMOPENLINES_NETWORK_JOIN
}
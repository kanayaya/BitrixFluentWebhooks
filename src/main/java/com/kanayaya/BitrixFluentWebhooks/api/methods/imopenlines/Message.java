package com.kanayaya.BitrixFluentWebhooks.api.methods.imopenlines;

import com.kanayaya.BitrixFluentWebhooks.BitrixRestClient;
import com.kanayaya.BitrixFluentWebhooks.api.methods.imopenlines.message.Quick;
import com.kanayaya.BitrixFluentWebhooks.api.methods.imopenlines.message.Session;

public class Message {
    public final Quick quick;
    public final Session session;
    private final BitrixRestClient client;

    public Message(BitrixRestClient client) {
        this.client = client;
        quick = new Quick(client);
        session = new Session(client);
    }


}
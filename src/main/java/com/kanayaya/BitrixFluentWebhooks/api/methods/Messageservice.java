package com.kanayaya.BitrixFluentWebhooks.api.methods;

import com.kanayaya.BitrixFluentWebhooks.BitrixRestClient;
import com.kanayaya.BitrixFluentWebhooks.api.methods.messageservice.Message;
import com.kanayaya.BitrixFluentWebhooks.api.methods.messageservice.Sender;

public class Messageservice {
    public final Sender sender;
    public final Message message;
    private final BitrixRestClient client;

    public Messageservice(BitrixRestClient client) {
        this.client = client;
        sender = new Sender(client);
        message = new Message(client);
    }


}
package com.kanayaya.BitrixFluentWebhooks.api.methods;

import com.kanayaya.BitrixFluentWebhooks.BitrixRestClient;
import com.kanayaya.BitrixFluentWebhooks.api.methods.forum.Message;

public class Forum {
    public final Message message;
    private final BitrixRestClient client;

    public Forum(BitrixRestClient client) {
        this.client = client;
        message = new Message(client);
    }


}
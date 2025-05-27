package com.kanayaya.BitrixFluentWebhooks.api.methods.imconnector;

import com.kanayaya.BitrixFluentWebhooks.BitrixRestClient;
import com.kanayaya.BitrixFluentWebhooks.api.methods.imconnector.chat.Name;

public class Chat {
    public final Name name;
    private final BitrixRestClient client;

    public Chat(BitrixRestClient client) {
        this.client = client;
        name = new Name(client);
    }


}
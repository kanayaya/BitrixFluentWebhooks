package com.kanayaya.BitrixFluentWebhooks.api.methods.imopenlines.crm;

import com.kanayaya.BitrixFluentWebhooks.BitrixRestClient;
import com.kanayaya.BitrixFluentWebhooks.api.methods.imopenlines.crm.chat.User;

public class Chat {
    public final User user;
    private final BitrixRestClient client;

    public Chat(BitrixRestClient client) {
        this.client = client;
        user = new User(client);
    }

    // public void get() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#IMOPENLINES_CRM_CHAT_GET
    // public void getlastid() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#IMOPENLINES_CRM_CHAT_GETLASTID
}
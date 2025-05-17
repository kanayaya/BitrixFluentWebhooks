package com.kanayaya.BitrixFluentWebhooks.api.methods.imopenlines;

import com.kanayaya.BitrixFluentWebhooks.BitrixRestClient;
import com.kanayaya.BitrixFluentWebhooks.api.methods.imopenlines.crm.Chat;
import com.kanayaya.BitrixFluentWebhooks.api.methods.imopenlines.crm.Lead;
import com.kanayaya.BitrixFluentWebhooks.api.methods.imopenlines.crm.Message;

public class Crm {
    public final Chat chat;
    public final Message message;
    public final Lead lead;
    private final BitrixRestClient client;

    public Crm(BitrixRestClient client) {
        this.client = client;
        chat = new Chat(client);
        message = new Message(client);
        lead = new Lead(client);
    }


}
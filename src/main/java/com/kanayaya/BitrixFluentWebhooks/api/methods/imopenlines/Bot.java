package com.kanayaya.BitrixFluentWebhooks.api.methods.imopenlines;

import com.kanayaya.BitrixFluentWebhooks.BitrixRestClient;
import com.kanayaya.BitrixFluentWebhooks.api.methods.imopenlines.bot.Session;

public class Bot {
    public final Session session;
    private final BitrixRestClient client;

    public Bot(BitrixRestClient client) {
        this.client = client;
        session = new Session(client);
    }


}
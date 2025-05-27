package com.kanayaya.BitrixFluentWebhooks.api.methods.imbot;

import com.kanayaya.BitrixFluentWebhooks.BitrixRestClient;
import com.kanayaya.BitrixFluentWebhooks.api.methods.imbot.network.Question;

public class Network {
    public final Question question;
    private final BitrixRestClient client;

    public Network(BitrixRestClient client) {
        this.client = client;
        question = new Question(client);
    }


}
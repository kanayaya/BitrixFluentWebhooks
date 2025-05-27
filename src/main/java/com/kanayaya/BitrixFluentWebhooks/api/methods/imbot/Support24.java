package com.kanayaya.BitrixFluentWebhooks.api.methods.imbot;

import com.kanayaya.BitrixFluentWebhooks.BitrixRestClient;
import com.kanayaya.BitrixFluentWebhooks.api.methods.imbot.support24.Question;

public class Support24 {
    public final Question question;
    private final BitrixRestClient client;

    public Support24(BitrixRestClient client) {
        this.client = client;
        question = new Question(client);
    }


}
package com.kanayaya.BitrixFluentWebhooks.api.methods.imbot.support24;

import com.kanayaya.BitrixFluentWebhooks.BitrixRestClient;
import com.kanayaya.BitrixFluentWebhooks.api.methods.imbot.support24.question.Config;

public class Question {
    public final Config config;
    private final BitrixRestClient client;

    public Question(BitrixRestClient client) {
        this.client = client;
        config = new Config(client);
    }

    // public void add() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#IMBOT_SUPPORT24_QUESTION_ADD
    // public void search() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#IMBOT_SUPPORT24_QUESTION_SEARCH
    // public void list() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#IMBOT_SUPPORT24_QUESTION_LIST
}
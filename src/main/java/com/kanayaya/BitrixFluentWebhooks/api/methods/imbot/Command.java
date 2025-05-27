package com.kanayaya.BitrixFluentWebhooks.api.methods.imbot;

import com.kanayaya.BitrixFluentWebhooks.BitrixRestClient;


public class Command {
    private final BitrixRestClient client;


    public Command(BitrixRestClient client) {
        this.client = client;
    }

    // public void answer() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#IMBOT_COMMAND_ANSWER
    // public void unregister() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#IMBOT_COMMAND_UNREGISTER
    // public void update() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#IMBOT_COMMAND_UPDATE
    // public void register() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#IMBOT_COMMAND_REGISTER
}
package com.kanayaya.BitrixFluentWebhooks.api.methods;

import com.kanayaya.BitrixFluentWebhooks.BitrixRestClient;
import com.kanayaya.BitrixFluentWebhooks.api.methods.ai.Engine;

public class Ai {
    public final Engine engine;
    private final BitrixRestClient client;

    public Ai(BitrixRestClient client) {
        this.client = client;
        engine = new Engine(client);
    }


}
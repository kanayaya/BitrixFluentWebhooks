package com.kanayaya.BitrixFluentWebhooks.api.methods.pull;

import com.kanayaya.BitrixFluentWebhooks.BitrixRestClient;
import com.kanayaya.BitrixFluentWebhooks.api.methods.pull.application.Config;
import com.kanayaya.BitrixFluentWebhooks.api.methods.pull.application.Event;
import com.kanayaya.BitrixFluentWebhooks.api.methods.pull.application.Push;

public class Application {
    public final Event event;
    public final Config config;
    public final Push push;
    private final BitrixRestClient client;

    public Application(BitrixRestClient client) {
        this.client = client;
        event = new Event(client);
        config = new Config(client);
        push = new Push(client);
    }


}
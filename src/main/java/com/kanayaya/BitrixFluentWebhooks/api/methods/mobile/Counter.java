package com.kanayaya.BitrixFluentWebhooks.api.methods.mobile;

import com.kanayaya.BitrixFluentWebhooks.BitrixRestClient;
import com.kanayaya.BitrixFluentWebhooks.api.methods.mobile.counter.Config;
import com.kanayaya.BitrixFluentWebhooks.api.methods.mobile.counter.Types;

public class Counter {
    public final Types types;
    public final Config config;
    private final BitrixRestClient client;

    public Counter(BitrixRestClient client) {
        this.client = client;
        types = new Types(client);
        config = new Config(client);
    }

    // public void get() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#MOBILE_COUNTER_GET
}
package com.kanayaya.BitrixFluentWebhooks.api.methods;

import com.kanayaya.BitrixFluentWebhooks.BitrixRestClient;
import com.kanayaya.BitrixFluentWebhooks.api.methods.app.Option;

public class App {
    public final Option option;
    private final BitrixRestClient client;

    public App(BitrixRestClient client) {
        this.client = client;
        option = new Option(client);
    }

    // public void info() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#APP_INFO
}
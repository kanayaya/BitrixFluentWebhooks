package com.kanayaya.BitrixFluentWebhooks.api.methods;

import com.kanayaya.BitrixFluentWebhooks.BitrixRestClient;
import com.kanayaya.BitrixFluentWebhooks.api.methods.event.Offline;

public class Event {
    public final Offline offline;
    private final BitrixRestClient client;

    public Event(BitrixRestClient client) {
        this.client = client;
        offline = new Offline(client);
    }

    // public void bind() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#EVENT_BIND
    // public void test() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#EVENT_TEST
    // public void unbind() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#EVENT_UNBIND
    // public void get() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#EVENT_GET
}
package com.kanayaya.BitrixFluentWebhooks.api.methods.voximplant;

import com.kanayaya.BitrixFluentWebhooks.BitrixRestClient;
import com.kanayaya.BitrixFluentWebhooks.api.methods.voximplant.line.Outgoing;

public class Line {
    public final Outgoing outgoing;
    private final BitrixRestClient client;

    public Line(BitrixRestClient client) {
        this.client = client;
        outgoing = new Outgoing(client);
    }

    // public void get() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#VOXIMPLANT_LINE_GET
}
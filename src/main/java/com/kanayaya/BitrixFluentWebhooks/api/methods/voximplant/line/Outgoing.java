package com.kanayaya.BitrixFluentWebhooks.api.methods.voximplant.line;

import com.kanayaya.BitrixFluentWebhooks.BitrixRestClient;
import com.kanayaya.BitrixFluentWebhooks.api.methods.voximplant.line.outgoing.Sip;

public class Outgoing {
    public final Sip sip;
    private final BitrixRestClient client;

    public Outgoing(BitrixRestClient client) {
        this.client = client;
        sip = new Sip(client);
    }

    // public void set() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#VOXIMPLANT_LINE_OUTGOING_SET
    // public void get() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#VOXIMPLANT_LINE_OUTGOING_GET
}
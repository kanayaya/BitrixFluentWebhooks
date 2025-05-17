package com.kanayaya.BitrixFluentWebhooks.api.methods.voximplant;

import com.kanayaya.BitrixFluentWebhooks.BitrixRestClient;
import com.kanayaya.BitrixFluentWebhooks.api.methods.voximplant.sip.Connector;

public class Sip {
    public final Connector connector;
    private final BitrixRestClient client;

    public Sip(BitrixRestClient client) {
        this.client = client;
        connector = new Connector(client);
    }

    // public void add() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#VOXIMPLANT_SIP_ADD
    // public void get() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#VOXIMPLANT_SIP_GET
    // public void update() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#VOXIMPLANT_SIP_UPDATE
    // public void delete() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#VOXIMPLANT_SIP_DELETE
    // public void status() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#VOXIMPLANT_SIP_STATUS
}
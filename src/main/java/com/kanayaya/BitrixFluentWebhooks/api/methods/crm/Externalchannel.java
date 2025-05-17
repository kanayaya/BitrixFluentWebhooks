package com.kanayaya.BitrixFluentWebhooks.api.methods.crm;

import com.kanayaya.BitrixFluentWebhooks.BitrixRestClient;
import com.kanayaya.BitrixFluentWebhooks.api.methods.crm.externalchannel.Activity;
import com.kanayaya.BitrixFluentWebhooks.api.methods.crm.externalchannel.Connector;

public class Externalchannel {
    public final Connector connector;
    public final Activity activity;
    private final BitrixRestClient client;

    public Externalchannel(BitrixRestClient client) {
        this.client = client;
        connector = new Connector(client);
        activity = new Activity(client);
    }

    // public void contact() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#CRM_EXTERNALCHANNEL_CONTACT
    // public void company() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#CRM_EXTERNALCHANNEL_COMPANY
}
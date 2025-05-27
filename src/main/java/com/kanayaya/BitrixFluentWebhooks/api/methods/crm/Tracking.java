package com.kanayaya.BitrixFluentWebhooks.api.methods.crm;

import com.kanayaya.BitrixFluentWebhooks.BitrixRestClient;
import com.kanayaya.BitrixFluentWebhooks.api.methods.crm.tracking.Trace;

public class Tracking {
    public final Trace trace;
    private final BitrixRestClient client;

    public Tracking(BitrixRestClient client) {
        this.client = client;
        trace = new Trace(client);
    }


}
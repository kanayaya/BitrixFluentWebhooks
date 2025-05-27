package com.kanayaya.BitrixFluentWebhooks.api.methods.mobile.push;

import com.kanayaya.BitrixFluentWebhooks.BitrixRestClient;
import com.kanayaya.BitrixFluentWebhooks.api.methods.mobile.push.smartfilter.Status;

public class Smartfilter {
    public final Status status;
    private final BitrixRestClient client;

    public Smartfilter(BitrixRestClient client) {
        this.client = client;
        status = new Status(client);
    }


}
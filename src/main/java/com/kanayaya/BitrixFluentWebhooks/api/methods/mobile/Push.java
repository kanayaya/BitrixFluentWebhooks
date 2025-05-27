package com.kanayaya.BitrixFluentWebhooks.api.methods.mobile;

import com.kanayaya.BitrixFluentWebhooks.BitrixRestClient;
import com.kanayaya.BitrixFluentWebhooks.api.methods.mobile.push.Config;
import com.kanayaya.BitrixFluentWebhooks.api.methods.mobile.push.Smartfilter;
import com.kanayaya.BitrixFluentWebhooks.api.methods.mobile.push.Status;
import com.kanayaya.BitrixFluentWebhooks.api.methods.mobile.push.Types;

public class Push {
    public final Smartfilter smartfilter;
    public final Types types;
    public final Config config;
    public final Status status;
    private final BitrixRestClient client;

    public Push(BitrixRestClient client) {
        this.client = client;
        smartfilter = new Smartfilter(client);
        types = new Types(client);
        config = new Config(client);
        status = new Status(client);
    }


}
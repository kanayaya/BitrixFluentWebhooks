package com.kanayaya.BitrixFluentWebhooks.api.methods.mobile.intranet;

import com.kanayaya.BitrixFluentWebhooks.BitrixRestClient;
import com.kanayaya.BitrixFluentWebhooks.api.methods.mobile.intranet.stresslevel.Sharedata;

public class Stresslevel {
    public final Sharedata sharedata;
    private final BitrixRestClient client;

    public Stresslevel(BitrixRestClient client) {
        this.client = client;
        sharedata = new Sharedata(client);
    }


}
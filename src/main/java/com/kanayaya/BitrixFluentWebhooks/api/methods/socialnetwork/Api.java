package com.kanayaya.BitrixFluentWebhooks.api.methods.socialnetwork;

import com.kanayaya.BitrixFluentWebhooks.BitrixRestClient;
import com.kanayaya.BitrixFluentWebhooks.api.methods.socialnetwork.api.Workgroup;

public class Api {
    public final Workgroup workgroup;
    private final BitrixRestClient client;

    public Api(BitrixRestClient client) {
        this.client = client;
        workgroup = new Workgroup(client);
    }


}
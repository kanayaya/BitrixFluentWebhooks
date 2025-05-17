package com.kanayaya.BitrixFluentWebhooks.api.methods;

import com.kanayaya.BitrixFluentWebhooks.BitrixRestClient;
import com.kanayaya.BitrixFluentWebhooks.api.methods.socialnetwork.Api;

public class Socialnetwork {
    public final Api api;
    private final BitrixRestClient client;

    public Socialnetwork(BitrixRestClient client) {
        this.client = client;
        api = new Api(client);
    }


}
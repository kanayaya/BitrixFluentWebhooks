package com.kanayaya.BitrixFluentWebhooks.api.methods;

import com.kanayaya.BitrixFluentWebhooks.BitrixRestClient;
import com.kanayaya.BitrixFluentWebhooks.api.methods.sign.B2e;

public class Sign {
    public final B2e b2e;
    private final BitrixRestClient client;

    public Sign(BitrixRestClient client) {
        this.client = client;
        b2e = new B2e(client);
    }


}
package com.kanayaya.BitrixFluentWebhooks.api.methods.sign;

import com.kanayaya.BitrixFluentWebhooks.BitrixRestClient;
import com.kanayaya.BitrixFluentWebhooks.api.methods.sign.b2e.Hcmlink;
import com.kanayaya.BitrixFluentWebhooks.api.methods.sign.b2e.Mysafe;
import com.kanayaya.BitrixFluentWebhooks.api.methods.sign.b2e.Personal;
import com.kanayaya.BitrixFluentWebhooks.api.methods.sign.b2e.Provider;

public class B2e {
    public final Provider provider;
    public final Mysafe mysafe;
    public final Hcmlink hcmlink;
    public final Personal personal;
    private final BitrixRestClient client;

    public B2e(BitrixRestClient client) {
        this.client = client;
        provider = new Provider(client);
        mysafe = new Mysafe(client);
        hcmlink = new Hcmlink(client);
        personal = new Personal(client);
    }


}
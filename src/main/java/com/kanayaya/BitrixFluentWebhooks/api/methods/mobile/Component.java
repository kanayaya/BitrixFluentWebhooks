package com.kanayaya.BitrixFluentWebhooks.api.methods.mobile;

import com.kanayaya.BitrixFluentWebhooks.BitrixRestClient;
import com.kanayaya.BitrixFluentWebhooks.api.methods.mobile.component.Customparams;

public class Component {
    public final Customparams customparams;
    private final BitrixRestClient client;

    public Component(BitrixRestClient client) {
        this.client = client;
        customparams = new Customparams(client);
    }


}
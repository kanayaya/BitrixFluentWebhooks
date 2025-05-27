package com.kanayaya.BitrixFluentWebhooks.api.methods.imopenlines.widget;

import com.kanayaya.BitrixFluentWebhooks.BitrixRestClient;
import com.kanayaya.BitrixFluentWebhooks.api.methods.imopenlines.widget.crm.Bindings;

public class Crm {
    public final Bindings bindings;
    private final BitrixRestClient client;

    public Crm(BitrixRestClient client) {
        this.client = client;
        bindings = new Bindings(client);
    }


}
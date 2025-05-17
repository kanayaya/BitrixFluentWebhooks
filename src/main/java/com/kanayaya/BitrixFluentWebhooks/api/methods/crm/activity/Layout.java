package com.kanayaya.BitrixFluentWebhooks.api.methods.crm.activity;

import com.kanayaya.BitrixFluentWebhooks.BitrixRestClient;
import com.kanayaya.BitrixFluentWebhooks.api.methods.crm.activity.layout.Blocks;

public class Layout {
    public final Blocks blocks;
    private final BitrixRestClient client;

    public Layout(BitrixRestClient client) {
        this.client = client;
        blocks = new Blocks(client);
    }


}
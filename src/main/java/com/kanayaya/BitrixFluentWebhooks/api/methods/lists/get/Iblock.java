package com.kanayaya.BitrixFluentWebhooks.api.methods.lists.get;

import com.kanayaya.BitrixFluentWebhooks.BitrixRestClient;
import com.kanayaya.BitrixFluentWebhooks.api.methods.lists.get.iblock.Type;

public class Iblock {
    public final Type type;
    private final BitrixRestClient client;

    public Iblock(BitrixRestClient client) {
        this.client = client;
        type = new Type(client);
    }


}
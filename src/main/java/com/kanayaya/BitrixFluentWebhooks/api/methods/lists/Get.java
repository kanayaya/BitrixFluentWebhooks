package com.kanayaya.BitrixFluentWebhooks.api.methods.lists;

import com.kanayaya.BitrixFluentWebhooks.BitrixRestClient;
import com.kanayaya.BitrixFluentWebhooks.api.methods.lists.get.Iblock;

public class Get {
    public final Iblock iblock;
    private final BitrixRestClient client;

    public Get(BitrixRestClient client) {
        this.client = client;
        iblock = new Iblock(client);
    }


}
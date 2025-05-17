package com.kanayaya.BitrixFluentWebhooks.api.methods;

import com.kanayaya.BitrixFluentWebhooks.BitrixRestClient;
import com.kanayaya.BitrixFluentWebhooks.api.methods.iblock.Element;

public class Iblock {
    public final Element Element;
    private final BitrixRestClient client;

    public Iblock(BitrixRestClient client) {
        this.client = client;
        Element = new Element(client);
    }


}
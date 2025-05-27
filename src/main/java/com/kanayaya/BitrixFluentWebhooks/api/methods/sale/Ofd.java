package com.kanayaya.BitrixFluentWebhooks.api.methods.sale;

import com.kanayaya.BitrixFluentWebhooks.BitrixRestClient;
import com.kanayaya.BitrixFluentWebhooks.api.methods.sale.ofd.Settings;

public class Ofd {
    public final Settings settings;
    private final BitrixRestClient client;

    public Ofd(BitrixRestClient client) {
        this.client = client;
        settings = new Settings(client);
    }

    // public void list() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#SALE_OFD_LIST
}
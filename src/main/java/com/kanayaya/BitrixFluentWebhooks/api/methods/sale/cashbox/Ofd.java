package com.kanayaya.BitrixFluentWebhooks.api.methods.sale.cashbox;

import com.kanayaya.BitrixFluentWebhooks.BitrixRestClient;
import com.kanayaya.BitrixFluentWebhooks.api.methods.sale.cashbox.ofd.Settings;

public class Ofd {
    public final Settings settings;
    private final BitrixRestClient client;

    public Ofd(BitrixRestClient client) {
        this.client = client;
        settings = new Settings(client);
    }


}
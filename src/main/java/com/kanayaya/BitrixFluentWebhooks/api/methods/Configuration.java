package com.kanayaya.BitrixFluentWebhooks.api.methods;

import com.kanayaya.BitrixFluentWebhooks.BitrixRestClient;
import com.kanayaya.BitrixFluentWebhooks.api.methods.configuration.Import;

public class Configuration {
    public final Import impоrt;
    private final BitrixRestClient client;

    public Configuration(BitrixRestClient client) {
        this.client = client;
        impоrt = new Import(client);
    }


}
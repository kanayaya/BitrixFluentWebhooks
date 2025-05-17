package com.kanayaya.BitrixFluentWebhooks.api.methods;

import com.kanayaya.BitrixFluentWebhooks.BitrixRestClient;
import com.kanayaya.BitrixFluentWebhooks.api.methods.configuration.Import;

public class Configuration {
    private final BitrixRestClient client;
    public final Import anImport;

    public Configuration(BitrixRestClient client) {
        this.client = client;
        anImport = new Import(client);
    }


}
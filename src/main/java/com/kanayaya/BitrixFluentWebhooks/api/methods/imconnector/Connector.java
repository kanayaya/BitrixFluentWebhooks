package com.kanayaya.BitrixFluentWebhooks.api.methods.imconnector;

import com.kanayaya.BitrixFluentWebhooks.BitrixRestClient;
import com.kanayaya.BitrixFluentWebhooks.api.methods.imconnector.connector.Data;

public class Connector {
    public final Data data;
    private final BitrixRestClient client;

    public Connector(BitrixRestClient client) {
        this.client = client;
        data = new Data(client);
    }


}
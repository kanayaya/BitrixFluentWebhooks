package com.kanayaya.BitrixFluentWebhooks.api.methods.crm.anEnum;

import com.kanayaya.BitrixFluentWebhooks.BitrixRestClient;
import com.kanayaya.BitrixFluentWebhooks.api.methods.crm.anEnum.entityeditor.Configuration;

public class Entityeditor {
    public final Configuration configuration;
    private final BitrixRestClient client;

    public Entityeditor(BitrixRestClient client) {
        this.client = client;
        configuration = new Configuration(client);
    }


}
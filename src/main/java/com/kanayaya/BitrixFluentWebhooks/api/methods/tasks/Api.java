package com.kanayaya.BitrixFluentWebhooks.api.methods.tasks;

import com.kanayaya.BitrixFluentWebhooks.BitrixRestClient;
import com.kanayaya.BitrixFluentWebhooks.api.methods.tasks.api.Scrum;

public class Api {
    public final Scrum scrum;
    private final BitrixRestClient client;

    public Api(BitrixRestClient client) {
        this.client = client;
        scrum = new Scrum(client);
    }


}
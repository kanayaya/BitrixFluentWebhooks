package com.kanayaya.BitrixFluentWebhooks.api.methods.sign.b2e;

import com.kanayaya.BitrixFluentWebhooks.BitrixRestClient;
import com.kanayaya.BitrixFluentWebhooks.api.methods.sign.b2e.hcmlink.Document;

public class Hcmlink {
    public final Document document;
    private final BitrixRestClient client;

    public Hcmlink(BitrixRestClient client) {
        this.client = client;
        document = new Document(client);
    }


}
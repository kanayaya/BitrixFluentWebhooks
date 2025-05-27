package com.kanayaya.BitrixFluentWebhooks.api.methods.humanresources.hcmlink;

import com.kanayaya.BitrixFluentWebhooks.BitrixRestClient;
import com.kanayaya.BitrixFluentWebhooks.api.methods.humanresources.hcmlink.field.Value;

public class Field {
    public final Value value;
    private final BitrixRestClient client;

    public Field(BitrixRestClient client) {
        this.client = client;
        value = new Value(client);
    }


}
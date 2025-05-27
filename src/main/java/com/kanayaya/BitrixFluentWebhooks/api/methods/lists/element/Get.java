package com.kanayaya.BitrixFluentWebhooks.api.methods.lists.element;

import com.kanayaya.BitrixFluentWebhooks.BitrixRestClient;
import com.kanayaya.BitrixFluentWebhooks.api.methods.lists.element.get.File;

public class Get {
    public final File file;
    private final BitrixRestClient client;

    public Get(BitrixRestClient client) {
        this.client = client;
        file = new File(client);
    }


}
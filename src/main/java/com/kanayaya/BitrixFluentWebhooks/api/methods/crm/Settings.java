package com.kanayaya.BitrixFluentWebhooks.api.methods.crm;

import com.kanayaya.BitrixFluentWebhooks.BitrixRestClient;
import com.kanayaya.BitrixFluentWebhooks.api.methods.crm.settings.Mode;

public class Settings {
    public final Mode mode;
    private final BitrixRestClient client;

    public Settings(BitrixRestClient client) {
        this.client = client;
        mode = new Mode(client);
    }


}
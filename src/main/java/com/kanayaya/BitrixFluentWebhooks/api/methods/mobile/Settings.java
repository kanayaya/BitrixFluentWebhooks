package com.kanayaya.BitrixFluentWebhooks.api.methods.mobile;

import com.kanayaya.BitrixFluentWebhooks.BitrixRestClient;
import com.kanayaya.BitrixFluentWebhooks.api.methods.mobile.settings.Energy;
import com.kanayaya.BitrixFluentWebhooks.api.methods.mobile.settings.Other;
import com.kanayaya.BitrixFluentWebhooks.api.methods.mobile.settings.Tabs;

public class Settings {
    public final Other other;
    public final Tabs tabs;
    public final Energy energy;
    private final BitrixRestClient client;

    public Settings(BitrixRestClient client) {
        this.client = client;
        other = new Other(client);
        tabs = new Tabs(client);
        energy = new Energy(client);
    }


}
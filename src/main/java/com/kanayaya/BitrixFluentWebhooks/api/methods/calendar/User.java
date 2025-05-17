package com.kanayaya.BitrixFluentWebhooks.api.methods.calendar;

import com.kanayaya.BitrixFluentWebhooks.BitrixRestClient;
import com.kanayaya.BitrixFluentWebhooks.api.methods.calendar.user.Settings;

public class User {
    public final Settings settings;
    private final BitrixRestClient client;

    public User(BitrixRestClient client) {
        this.client = client;
        settings = new Settings(client);
    }


}
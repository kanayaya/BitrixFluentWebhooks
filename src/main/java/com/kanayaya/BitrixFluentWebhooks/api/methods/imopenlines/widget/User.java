package com.kanayaya.BitrixFluentWebhooks.api.methods.imopenlines.widget;

import com.kanayaya.BitrixFluentWebhooks.BitrixRestClient;
import com.kanayaya.BitrixFluentWebhooks.api.methods.imopenlines.widget.user.Consent;

public class User {
    public final Consent consent;
    private final BitrixRestClient client;

    public User(BitrixRestClient client) {
        this.client = client;
        consent = new Consent(client);
    }

    // public void get() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#IMOPENLINES_WIDGET_USER_GET
    // public void register() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#IMOPENLINES_WIDGET_USER_REGISTER
}
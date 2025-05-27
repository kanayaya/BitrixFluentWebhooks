package com.kanayaya.BitrixFluentWebhooks.api.methods.crm;

import com.kanayaya.BitrixFluentWebhooks.BitrixRestClient;
import com.kanayaya.BitrixFluentWebhooks.api.methods.crm.button.Guest;
import com.kanayaya.BitrixFluentWebhooks.api.methods.crm.button.Widgets;

public class Button {
    public final Guest guest;
    public final Widgets widgets;
    private final BitrixRestClient client;

    public Button(BitrixRestClient client) {
        this.client = client;
        guest = new Guest(client);
        widgets = new Widgets(client);
    }

    // public void list() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#CRM_BUTTON_LIST
}
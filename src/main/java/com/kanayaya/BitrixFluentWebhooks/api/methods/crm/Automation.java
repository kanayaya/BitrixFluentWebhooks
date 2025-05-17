package com.kanayaya.BitrixFluentWebhooks.api.methods.crm;

import com.kanayaya.BitrixFluentWebhooks.BitrixRestClient;
import com.kanayaya.BitrixFluentWebhooks.api.methods.crm.automation.Trigger;

public class Automation {
    public final Trigger trigger;
    private final BitrixRestClient client;

    public Automation(BitrixRestClient client) {
        this.client = client;
        trigger = new Trigger(client);
    }

    // public void trigger() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#CRM_AUTOMATION_TRIGGER
}
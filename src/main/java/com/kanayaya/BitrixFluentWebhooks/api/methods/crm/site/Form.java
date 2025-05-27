package com.kanayaya.BitrixFluentWebhooks.api.methods.crm.site;

import com.kanayaya.BitrixFluentWebhooks.BitrixRestClient;
import com.kanayaya.BitrixFluentWebhooks.api.methods.crm.site.form.User;

public class Form {
    public final User user;
    private final BitrixRestClient client;

    public Form(BitrixRestClient client) {
        this.client = client;
        user = new User(client);
    }

    // public void fill() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#CRM_SITE_FORM_FILL
}
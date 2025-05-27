package com.kanayaya.BitrixFluentWebhooks.api.methods.crm;

import com.kanayaya.BitrixFluentWebhooks.BitrixRestClient;
import com.kanayaya.BitrixFluentWebhooks.api.methods.crm.webform.Configuration;
import com.kanayaya.BitrixFluentWebhooks.api.methods.crm.webform.Result;

public class Webform {
    public final Result result;
    public final Configuration configuration;
    private final BitrixRestClient client;

    public Webform(BitrixRestClient client) {
        this.client = client;
        result = new Result(client);
        configuration = new Configuration(client);
    }

    // public void list() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#CRM_WEBFORM_LIST
}
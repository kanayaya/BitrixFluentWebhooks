package com.kanayaya.BitrixFluentWebhooks.api.methods.crm;

import com.kanayaya.BitrixFluentWebhooks.BitrixRestClient;
import com.kanayaya.BitrixFluentWebhooks.api.methods.crm.site.Form;

public class Site {
    public final Form form;
    private final BitrixRestClient client;

    public Site(BitrixRestClient client) {
        this.client = client;
        form = new Form(client);
    }


}
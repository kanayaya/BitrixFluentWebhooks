package com.kanayaya.BitrixFluentWebhooks.api.methods.mobile;

import com.kanayaya.BitrixFluentWebhooks.BitrixRestClient;
import com.kanayaya.BitrixFluentWebhooks.api.methods.mobile.intranet.Departments;
import com.kanayaya.BitrixFluentWebhooks.api.methods.mobile.intranet.Stresslevel;

public class Intranet {
    public final Departments departments;
    public final Stresslevel stresslevel;
    private final BitrixRestClient client;

    public Intranet(BitrixRestClient client) {
        this.client = client;
        departments = new Departments(client);
        stresslevel = new Stresslevel(client);
    }


}
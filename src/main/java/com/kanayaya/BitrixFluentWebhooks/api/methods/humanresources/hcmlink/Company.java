package com.kanayaya.BitrixFluentWebhooks.api.methods.humanresources.hcmlink;

import com.kanayaya.BitrixFluentWebhooks.BitrixRestClient;
import com.kanayaya.BitrixFluentWebhooks.api.methods.humanresources.hcmlink.company.User;

public class Company {
    public final User user;
    private final BitrixRestClient client;

    public Company(BitrixRestClient client) {
        this.client = client;
        user = new User(client);
    }

    // public void add() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#HUMANRESOURCES_HCMLINK_COMPANY_ADD
    // public void update() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#HUMANRESOURCES_HCMLINK_COMPANY_UPDATE
    // public void list() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#HUMANRESOURCES_HCMLINK_COMPANY_LIST
    // public void delete() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#HUMANRESOURCES_HCMLINK_COMPANY_DELETE
}
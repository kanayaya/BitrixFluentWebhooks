package com.kanayaya.BitrixFluentWebhooks.api.methods.timeman.timecontrol;

import com.kanayaya.BitrixFluentWebhooks.BitrixRestClient;
import com.kanayaya.BitrixFluentWebhooks.api.methods.timeman.timecontrol.reports.Settings;
import com.kanayaya.BitrixFluentWebhooks.api.methods.timeman.timecontrol.reports.Users;

public class Reports {
    public final Settings settings;
    public final Users users;
    private final BitrixRestClient client;

    public Reports(BitrixRestClient client) {
        this.client = client;
        settings = new Settings(client);
        users = new Users(client);
    }

    // public void get() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#TIMEMAN_TIMECONTROL_REPORTS_GET
}
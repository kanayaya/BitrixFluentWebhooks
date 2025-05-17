package com.kanayaya.BitrixFluentWebhooks.api.methods.timeman;

import com.kanayaya.BitrixFluentWebhooks.BitrixRestClient;
import com.kanayaya.BitrixFluentWebhooks.api.methods.timeman.timecontrol.Report;
import com.kanayaya.BitrixFluentWebhooks.api.methods.timeman.timecontrol.Reports;
import com.kanayaya.BitrixFluentWebhooks.api.methods.timeman.timecontrol.Settings;

public class Timecontrol {
    public final Settings settings;
    public final Reports reports;
    public final Report report;
    private final BitrixRestClient client;

    public Timecontrol(BitrixRestClient client) {
        this.client = client;
        settings = new Settings(client);
        reports = new Reports(client);
        report = new Report(client);
    }


}
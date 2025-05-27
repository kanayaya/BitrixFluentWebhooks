package com.kanayaya.BitrixFluentWebhooks.api.methods.humanresources.hcmlink;

import com.kanayaya.BitrixFluentWebhooks.BitrixRestClient;
import com.kanayaya.BitrixFluentWebhooks.api.methods.humanresources.hcmlink.job.Status;

public class Job {
    public final Status status;
    private final BitrixRestClient client;

    public Job(BitrixRestClient client) {
        this.client = client;
        status = new Status(client);
    }

    // public void update() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#HUMANRESOURCES_HCMLINK_JOB_UPDATE
}
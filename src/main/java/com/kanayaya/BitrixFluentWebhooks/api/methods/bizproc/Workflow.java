package com.kanayaya.BitrixFluentWebhooks.api.methods.bizproc;

import com.kanayaya.BitrixFluentWebhooks.BitrixRestClient;
import com.kanayaya.BitrixFluentWebhooks.api.methods.bizproc.workflow.Instance;
import com.kanayaya.BitrixFluentWebhooks.api.methods.bizproc.workflow.Template;

public class Workflow {
    public final Template template;
    public final Instance instance;
    private final BitrixRestClient client;

    public Workflow(BitrixRestClient client) {
        this.client = client;
        template = new Template(client);
        instance = new Instance(client);
    }

    // public void instances() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#BIZPROC_WORKFLOW_INSTANCES
    // public void start() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#BIZPROC_WORKFLOW_START
    // public void terminate() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#BIZPROC_WORKFLOW_TERMINATE
    // public void kill() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#BIZPROC_WORKFLOW_KILL
}
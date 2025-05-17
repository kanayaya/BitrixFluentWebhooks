package com.kanayaya.BitrixFluentWebhooks.api.methods;

import com.kanayaya.BitrixFluentWebhooks.BitrixRestClient;
import com.kanayaya.BitrixFluentWebhooks.api.methods.bizproc.Event;
import com.kanayaya.BitrixFluentWebhooks.api.methods.bizproc.Task;
import com.kanayaya.BitrixFluentWebhooks.api.methods.bizproc.*;

public class Bizproc {
    public final Robot robot;
    public final Task task;
    public final Activity activity;
    public final Workflow workflow;
    public final Provider provider;
    public final Event event;
    private final BitrixRestClient client;

    public Bizproc(BitrixRestClient client) {
        this.client = client;
        robot = new Robot(client);
        task = new Task(client);
        activity = new Activity(client);
        workflow = new Workflow(client);
        provider = new Provider(client);
        event = new Event(client);
    }


}
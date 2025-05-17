package com.kanayaya.BitrixFluentWebhooks.api.methods;

import com.kanayaya.BitrixFluentWebhooks.BitrixRestClient;
import com.kanayaya.BitrixFluentWebhooks.api.methods.task.*;

public class Task {
    public final Logitem logitem;
    public final Item item;
    public final Checklistitem checklistitem;
    public final Stages stages;
    public final Dependence dependence;
    public final Commentitem commentitem;
    public final Planner planner;
    public final Elapseditem elapseditem;
    private final BitrixRestClient client;

    public Task(BitrixRestClient client) {
        this.client = client;
        logitem = new Logitem(client);
        item = new Item(client);
        checklistitem = new Checklistitem(client);
        stages = new Stages(client);
        dependence = new Dependence(client);
        commentitem = new Commentitem(client);
        planner = new Planner(client);
        elapseditem = new Elapseditem(client);
    }


}
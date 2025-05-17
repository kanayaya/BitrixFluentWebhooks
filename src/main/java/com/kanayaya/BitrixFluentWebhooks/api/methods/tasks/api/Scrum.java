package com.kanayaya.BitrixFluentWebhooks.api.methods.tasks.api;

import com.kanayaya.BitrixFluentWebhooks.BitrixRestClient;
import com.kanayaya.BitrixFluentWebhooks.api.methods.tasks.api.scrum.*;

public class Scrum {
    public final Task task;
    public final Backlog backlog;
    public final Kanban kanban;
    public final Sprint sprint;
    public final Epic epic;
    private final BitrixRestClient client;

    public Scrum(BitrixRestClient client) {
        this.client = client;
        task = new Task(client);
        backlog = new Backlog(client);
        kanban = new Kanban(client);
        sprint = new Sprint(client);
        epic = new Epic(client);
    }


}
package com.kanayaya.BitrixFluentWebhooks.api.methods.tasks;

import com.kanayaya.BitrixFluentWebhooks.BitrixRestClient;
import com.kanayaya.BitrixFluentWebhooks.api.methods.tasks.task.Counters;
import com.kanayaya.BitrixFluentWebhooks.api.methods.tasks.task.Favorite;
import com.kanayaya.BitrixFluentWebhooks.api.methods.tasks.task.Files;
import com.kanayaya.BitrixFluentWebhooks.api.methods.tasks.task.History;

public class Task {
    public final Counters counters;
    public final History history;
    public final Files files;
    public final Favorite favorite;
    private final BitrixRestClient client;

    public Task(BitrixRestClient client) {
        this.client = client;
        counters = new Counters(client);
        history = new History(client);
        files = new Files(client);
        favorite = new Favorite(client);
    }

    // public void add() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#TASKS_TASK_ADD
    // public void getaccess() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#TASKS_TASK_GETACCESS
    // public void deger() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#TASKS_TASK_DEGER
    // public void startwatch() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#TASKS_TASK_STARTWATCH
    // public void start() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#TASKS_TASK_START
    // public void update() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#TASKS_TASK_UPDATE
    // public void list() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#TASKS_TASK_LIST
    // public void delete() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#TASKS_TASK_DELETE
    // public void pause() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#TASKS_TASK_PAUSE
    // public void delegate() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#TASKS_TASK_DELEGATE
    // public void getFields() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#TASKS_TASK_GETFIELDS
    // public void approve() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#TASKS_TASK_APPROVE
    // public void get() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#TASKS_TASK_GET
    // public void renew() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#TASKS_TASK_RENEW
    // public void disapprove() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#TASKS_TASK_DISAPPROVE
    // public void complete() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#TASKS_TASK_COMPLETE
    // public void stopwatch() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#TASKS_TASK_STOPWATCH
}
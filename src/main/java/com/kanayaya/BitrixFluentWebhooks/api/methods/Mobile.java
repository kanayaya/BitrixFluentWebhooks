package com.kanayaya.BitrixFluentWebhooks.api.methods;

import com.kanayaya.BitrixFluentWebhooks.BitrixRestClient;
import com.kanayaya.BitrixFluentWebhooks.api.methods.mobile.Disk;
import com.kanayaya.BitrixFluentWebhooks.api.methods.mobile.Task;
import com.kanayaya.BitrixFluentWebhooks.api.methods.mobile.Tasks;
import com.kanayaya.BitrixFluentWebhooks.api.methods.mobile.User;
import com.kanayaya.BitrixFluentWebhooks.api.methods.mobile.*;

public class Mobile {
    public final Intranet intranet;
    public final Settings settings;
    public final Component component;
    public final Disk disk;
    public final Task task;
    public final Form form;
    public final Counter counter;
    public final User user;
    public final Tasks tasks;
    public final Push push;
    private final BitrixRestClient client;

    public Mobile(BitrixRestClient client) {
        this.client = client;
        intranet = new Intranet(client);
        settings = new Settings(client);
        component = new Component(client);
        disk = new Disk(client);
        task = new Task(client);
        form = new Form(client);
        counter = new Counter(client);
        user = new User(client);
        tasks = new Tasks(client);
        push = new Push(client);
    }


}
package com.kanayaya.BitrixFluentWebhooks.api.methods;

import com.kanayaya.BitrixFluentWebhooks.BitrixRestClient;
import com.kanayaya.BitrixFluentWebhooks.api.methods.im.Department;
import com.kanayaya.BitrixFluentWebhooks.api.methods.im.Disk;
import com.kanayaya.BitrixFluentWebhooks.api.methods.im.User;
import com.kanayaya.BitrixFluentWebhooks.api.methods.im.*;

public class Im {
    public final Dialog dialog;
    public final Search search;
    public final Disk disk;
    public final Counters counters;
    public final Chat chat;
    public final Department department;
    public final Message message;
    public final Recent recent;
    public final User user;
    public final Notify notify;
    private final BitrixRestClient client;

    public Im(BitrixRestClient client) {
        this.client = client;
        dialog = new Dialog(client);
        search = new Search(client);
        disk = new Disk(client);
        counters = new Counters(client);
        chat = new Chat(client);
        department = new Department(client);
        message = new Message(client);
        recent = new Recent(client);
        user = new User(client);
        notify = new Notify(client);
    }


}
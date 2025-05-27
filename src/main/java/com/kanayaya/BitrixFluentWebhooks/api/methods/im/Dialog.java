package com.kanayaya.BitrixFluentWebhooks.api.methods.im;

import com.kanayaya.BitrixFluentWebhooks.BitrixRestClient;
import com.kanayaya.BitrixFluentWebhooks.api.methods.im.dialog.Messages;
import com.kanayaya.BitrixFluentWebhooks.api.methods.im.dialog.Read;
import com.kanayaya.BitrixFluentWebhooks.api.methods.im.dialog.Users;

public class Dialog {
    public final Read read;
    public final Messages messages;
    public final Users users;
    private final BitrixRestClient client;

    public Dialog(BitrixRestClient client) {
        this.client = client;
        read = new Read(client);
        messages = new Messages(client);
        users = new Users(client);
    }

    // public void read() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#IM_DIALOG_READ
    // public void unread() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#IM_DIALOG_UNREAD
    // public void get() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#IM_DIALOG_GET
    // public void writing() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#IM_DIALOG_WRITING
}
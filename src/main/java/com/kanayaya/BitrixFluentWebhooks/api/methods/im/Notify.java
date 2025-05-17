package com.kanayaya.BitrixFluentWebhooks.api.methods.im;

import com.kanayaya.BitrixFluentWebhooks.BitrixRestClient;
import com.kanayaya.BitrixFluentWebhooks.api.methods.im.notify.Personal;
import com.kanayaya.BitrixFluentWebhooks.api.methods.im.notify.Read;
import com.kanayaya.BitrixFluentWebhooks.api.methods.im.notify.System;

public class Notify {
    public final Read read;
    public final System system;
    public final Personal personal;
    private final BitrixRestClient client;

    public Notify(BitrixRestClient client) {
        this.client = client;
        read = new Read(client);
        system = new System(client);
        personal = new Personal(client);
    }

    // public void confirm() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#IM_NOTIFY_CONFIRM
    // public void read() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#IM_NOTIFY_READ
    // public void answer() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#IM_NOTIFY_ANSWER
    // public void delete() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#IM_NOTIFY_DELETE
}
package com.kanayaya.BitrixFluentWebhooks.api.methods.imopenlines;

import com.kanayaya.BitrixFluentWebhooks.BitrixRestClient;
import com.kanayaya.BitrixFluentWebhooks.api.methods.imopenlines.session.Head;
import com.kanayaya.BitrixFluentWebhooks.api.methods.imopenlines.session.History;
import com.kanayaya.BitrixFluentWebhooks.api.methods.imopenlines.session.Mode;

public class Session {
    public final Head head;
    public final Mode mode;
    public final History history;
    private final BitrixRestClient client;

    public Session(BitrixRestClient client) {
        this.client = client;
        head = new Head(client);
        mode = new Mode(client);
        history = new History(client);
    }

    // public void intercept() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#IMOPENLINES_SESSION_INTERCEPT
    // public void start() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#IMOPENLINES_SESSION_START
    // public void join() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#IMOPENLINES_SESSION_JOIN
    // public void open() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#IMOPENLINES_SESSION_OPEN
}
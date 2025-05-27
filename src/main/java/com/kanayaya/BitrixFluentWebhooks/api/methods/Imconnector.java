package com.kanayaya.BitrixFluentWebhooks.api.methods;

import com.kanayaya.BitrixFluentWebhooks.BitrixRestClient;
import com.kanayaya.BitrixFluentWebhooks.api.methods.imconnector.*;

public class Imconnector {
    public final Set set;
    public final Connector connector;
    public final Chat chat;
    public final Update update;
    public final Delete delete;
    public final Send send;
    private final BitrixRestClient client;

    public Imconnector(BitrixRestClient client) {
        this.client = client;
        set = new Set(client);
        connector = new Connector(client);
        chat = new Chat(client);
        update = new Update(client);
        delete = new Delete(client);
        send = new Send(client);
    }

    // public void unregister() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#IMCONNECTOR_UNREGISTER
    // public void activate() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#IMCONNECTOR_ACTIVATE
    // public void list() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#IMCONNECTOR_LIST
    // public void register() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#IMCONNECTOR_REGISTER
    // public void status() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#IMCONNECTOR_STATUS
}
package com.kanayaya.BitrixFluentWebhooks.api.methods;

import com.kanayaya.BitrixFluentWebhooks.BitrixRestClient;
import com.kanayaya.BitrixFluentWebhooks.api.methods.imopenlines.Crm;
import com.kanayaya.BitrixFluentWebhooks.api.methods.imopenlines.*;

public class Imopenlines {
    public final Dialog dialog;
    public final Widget widget;
    public final Bot bot;
    public final Session session;
    public final Message message;
    public final Config config;
    public final Operator operator;
    public final Network network;
    public final Revision revision;
    public final Crm crm;
    private final BitrixRestClient client;

    public Imopenlines(BitrixRestClient client) {
        this.client = client;
        dialog = new Dialog(client);
        widget = new Widget(client);
        bot = new Bot(client);
        session = new Session(client);
        message = new Message(client);
        config = new Config(client);
        operator = new Operator(client);
        network = new Network(client);
        revision = new Revision(client);
        crm = new Crm(client);
    }

    // public void list() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#IMOPENLINES_LIST
}
package com.kanayaya.BitrixFluentWebhooks.api.methods;

import com.kanayaya.BitrixFluentWebhooks.BitrixRestClient;
import com.kanayaya.BitrixFluentWebhooks.api.methods.imopenlines.Crm;
import com.kanayaya.BitrixFluentWebhooks.api.methods.imopenlines.Message;
import com.kanayaya.BitrixFluentWebhooks.api.methods.imopenlines.Operator;
import com.kanayaya.BitrixFluentWebhooks.api.methods.imopenlines.Session;

public class Imopenlines {
    public final Session session;
    public final Message message;
    public final Operator operator;
    public final Crm crm;
    private final BitrixRestClient client;

    public Imopenlines(BitrixRestClient client) {
        this.client = client;
        session = new Session(client);
        message = new Message(client);
        operator = new Operator(client);
        crm = new Crm(client);
    }

    // public void list() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#IMOPENLINES_LIST
}
package com.kanayaya.BitrixFluentWebhooks.api.methods.imopenlines;

import com.kanayaya.BitrixFluentWebhooks.BitrixRestClient;
import com.kanayaya.BitrixFluentWebhooks.api.methods.imopenlines.widget.Config;
import com.kanayaya.BitrixFluentWebhooks.api.methods.imopenlines.widget.Crm;
import com.kanayaya.BitrixFluentWebhooks.api.methods.imopenlines.widget.Dialog;
import com.kanayaya.BitrixFluentWebhooks.api.methods.imopenlines.widget.Operator;
import com.kanayaya.BitrixFluentWebhooks.api.methods.imopenlines.widget.*;

public class Widget {
    public final Dialog dialog;
    public final Chat chat;
    public final Action action;
    public final Vote vote;
    public final User user;
    public final Config config;
    public final Operator operator;
    public final Crm crm;
    private final BitrixRestClient client;

    public Widget(BitrixRestClient client) {
        this.client = client;
        dialog = new Dialog(client);
        chat = new Chat(client);
        action = new Action(client);
        vote = new Vote(client);
        user = new User(client);
        config = new Config(client);
        operator = new Operator(client);
        crm = new Crm(client);
    }


}
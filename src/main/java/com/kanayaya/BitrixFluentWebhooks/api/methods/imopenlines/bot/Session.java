package com.kanayaya.BitrixFluentWebhooks.api.methods.imopenlines.bot;

import com.kanayaya.BitrixFluentWebhooks.BitrixRestClient;
import com.kanayaya.BitrixFluentWebhooks.api.methods.imopenlines.bot.session.Dialog;
import com.kanayaya.BitrixFluentWebhooks.api.methods.imopenlines.bot.session.Message;

public class Session {
    public final Dialog dialog;
    public final Message message;
    private final BitrixRestClient client;

    public Session(BitrixRestClient client) {
        this.client = client;
        dialog = new Dialog(client);
        message = new Message(client);
    }

    // public void transfer() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#IMOPENLINES_BOT_SESSION_TRANSFER
    // public void finish() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#IMOPENLINES_BOT_SESSION_FINISH
    // public void operator() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#IMOPENLINES_BOT_SESSION_OPERATOR
}
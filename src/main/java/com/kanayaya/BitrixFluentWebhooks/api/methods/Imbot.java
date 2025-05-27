package com.kanayaya.BitrixFluentWebhooks.api.methods;

import com.kanayaya.BitrixFluentWebhooks.BitrixRestClient;
import com.kanayaya.BitrixFluentWebhooks.api.methods.imbot.App;
import com.kanayaya.BitrixFluentWebhooks.api.methods.imbot.*;

public class Imbot {
    public final App app;
    public final Support24 support24;
    public final Dialog dialog;
    public final Bot bot;
    public final Chat chat;
    public final Message message;
    public final Command command;
    public final Network network;
    private final BitrixRestClient client;

    public Imbot(BitrixRestClient client) {
        this.client = client;
        app = new App(client);
        support24 = new Support24(client);
        dialog = new Dialog(client);
        bot = new Bot(client);
        chat = new Chat(client);
        message = new Message(client);
        command = new Command(client);
        network = new Network(client);
    }

    // public void unregister() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#IMBOT_UNREGISTER
    // public void update() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#IMBOT_UPDATE
    // public void register() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#IMBOT_REGISTER
}
package com.kanayaya.BitrixFluentWebhooks.api.methods.imbot;

import com.kanayaya.BitrixFluentWebhooks.BitrixRestClient;
import com.kanayaya.BitrixFluentWebhooks.api.methods.imbot.chat.User;

public class Chat {
    public final User user;
    private final BitrixRestClient client;

    public Chat(BitrixRestClient client) {
        this.client = client;
        user = new User(client);
    }

    // public void add() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#IMBOT_CHAT_ADD
    // public void sendtyping() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#IMBOT_CHAT_SENDTYPING
    // public void updatecolor() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#IMBOT_CHAT_UPDATECOLOR
    // public void setowner() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#IMBOT_CHAT_SETOWNER
    // public void setmanager() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#IMBOT_CHAT_SETMANAGER
    // public void leave() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#IMBOT_CHAT_LEAVE
    // public void get() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#IMBOT_CHAT_GET
    // public void updatetitle() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#IMBOT_CHAT_UPDATETITLE
    // public void updateavatar() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#IMBOT_CHAT_UPDATEAVATAR
}
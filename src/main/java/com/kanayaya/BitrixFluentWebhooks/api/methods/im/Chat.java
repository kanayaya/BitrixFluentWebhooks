package com.kanayaya.BitrixFluentWebhooks.api.methods.im;

import com.kanayaya.BitrixFluentWebhooks.BitrixRestClient;
import com.kanayaya.BitrixFluentWebhooks.api.methods.im.chat.User;

public class Chat {
    public final User user;
    private final BitrixRestClient client;

    public Chat(BitrixRestClient client) {
        this.client = client;
        user = new User(client);
    }

    // public void updateAvatar() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#IM_CHAT_UPDATEAVATAR
    // public void add() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#IM_CHAT_ADD
    // public void getentitychat() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#IM_CHAT_GETENTITYCHAT
    // public void setmanager() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#IM_CHAT_SETMANAGER
    // public void leave() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#IM_CHAT_LEAVE
    // public void get() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#IM_CHAT_GET
    // public void mute() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#IM_CHAT_MUTE
    // public void updateTitle() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#IM_CHAT_UPDATETITLE
    // public void setOwner() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#IM_CHAT_SETOWNER
    // public void updateColor() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#IM_CHAT_UPDATECOLOR
}
package com.kanayaya.BitrixFluentWebhooks.api.methods.im;

import com.kanayaya.BitrixFluentWebhooks.BitrixRestClient;
import com.kanayaya.BitrixFluentWebhooks.api.methods.im.search.Chat;
import com.kanayaya.BitrixFluentWebhooks.api.methods.im.search.Department;
import com.kanayaya.BitrixFluentWebhooks.api.methods.im.search.Last;
import com.kanayaya.BitrixFluentWebhooks.api.methods.im.search.User;

public class Search {
    public final Last last;
    public final Chat chat;
    public final Department department;
    public final User user;
    private final BitrixRestClient client;

    public Search(BitrixRestClient client) {
        this.client = client;
        last = new Last(client);
        chat = new Chat(client);
        department = new Department(client);
        user = new User(client);
    }


}
package com.kanayaya.BitrixFluentWebhooks.api.methods;

import com.kanayaya.BitrixFluentWebhooks.BitrixRestClient;
import com.kanayaya.BitrixFluentWebhooks.api.methods.voximplant.User;
import com.kanayaya.BitrixFluentWebhooks.api.methods.voximplant.*;

public class Voximplant {
    public final Statistic statistic;
    public final Tts tts;
    public final Line line;
    public final Callback callback;
    public final Sip sip;
    public final User user;
    public final Infocall infocall;
    public final Url url;
    private final BitrixRestClient client;

    public Voximplant(BitrixRestClient client) {
        this.client = client;
        statistic = new Statistic(client);
        tts = new Tts(client);
        line = new Line(client);
        callback = new Callback(client);
        sip = new Sip(client);
        user = new User(client);
        infocall = new Infocall(client);
        url = new Url(client);
    }


}
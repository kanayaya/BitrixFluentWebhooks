package com.kanayaya.BitrixFluentWebhooks.api.methods;

import com.kanayaya.BitrixFluentWebhooks.BitrixRestClient;
import com.kanayaya.BitrixFluentWebhooks.api.methods.timeman.Networkrange;
import com.kanayaya.BitrixFluentWebhooks.api.methods.timeman.Schedule;
import com.kanayaya.BitrixFluentWebhooks.api.methods.timeman.Timecontrol;

public class Timeman {
    public final Schedule schedule;
    public final Timecontrol timecontrol;
    public final Networkrange networkrange;
    private final BitrixRestClient client;

    public Timeman(BitrixRestClient client) {
        this.client = client;
        schedule = new Schedule(client);
        timecontrol = new Timecontrol(client);
        networkrange = new Networkrange(client);
    }

    // public void settings() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#TIMEMAN_SETTINGS
    // public void close() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#TIMEMAN_CLOSE
    // public void pause() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#TIMEMAN_PAUSE
    // public void open() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#TIMEMAN_OPEN
    // public void status() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#TIMEMAN_STATUS
}
package com.kanayaya.BitrixFluentWebhooks.api.methods.calendar;

import com.kanayaya.BitrixFluentWebhooks.BitrixRestClient;
import com.kanayaya.BitrixFluentWebhooks.api.methods.calendar.event.Get;

public class Event {
    public final Get get;
    private final BitrixRestClient client;

    public Event(BitrixRestClient client) {
        this.client = client;
        get = new Get(client);
    }

    // public void add() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#CALENDAR_EVENT_ADD
    // public void getbyid() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#CALENDAR_EVENT_GETBYID
    // public void get() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#CALENDAR_EVENT_GET
    // public void update() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#CALENDAR_EVENT_UPDATE
    // public void delete() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#CALENDAR_EVENT_DELETE
}
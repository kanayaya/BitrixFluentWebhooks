package com.kanayaya.BitrixFluentWebhooks.api.methods.calendar;

import com.kanayaya.BitrixFluentWebhooks.BitrixRestClient;
import com.kanayaya.BitrixFluentWebhooks.api.methods.calendar.resource.Booking;

public class Resource {
    public final Booking booking;
    private final BitrixRestClient client;

    public Resource(BitrixRestClient client) {
        this.client = client;
        booking = new Booking(client);
    }

    // public void add() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#CALENDAR_RESOURCE_ADD
    // public void update() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#CALENDAR_RESOURCE_UPDATE
    // public void list() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#CALENDAR_RESOURCE_LIST
    // public void delete() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#CALENDAR_RESOURCE_DELETE
}
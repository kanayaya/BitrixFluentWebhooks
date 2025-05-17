package com.kanayaya.BitrixFluentWebhooks.api.methods.calendar;

import com.kanayaya.BitrixFluentWebhooks.BitrixRestClient;
import com.kanayaya.BitrixFluentWebhooks.api.methods.calendar.meeting.Params;
import com.kanayaya.BitrixFluentWebhooks.api.methods.calendar.meeting.Status;

public class Meeting {
    public final Params params;
    public final Status status;
    private final BitrixRestClient client;

    public Meeting(BitrixRestClient client) {
        this.client = client;
        params = new Params(client);
        status = new Status(client);
    }


}
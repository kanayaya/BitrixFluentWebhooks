package com.kanayaya.BitrixFluentWebhooks.api.methods;

import com.kanayaya.BitrixFluentWebhooks.BitrixRestClient;
import com.kanayaya.BitrixFluentWebhooks.api.methods.calendar.Event;
import com.kanayaya.BitrixFluentWebhooks.api.methods.calendar.User;
import com.kanayaya.BitrixFluentWebhooks.api.methods.calendar.*;

public class Calendar {
    public final Settings settings;
    public final Resource resource;
    public final Accessibility accessibility;
    public final Section section;
    public final Event event;
    public final User user;
    public final Meeting meeting;
    private final BitrixRestClient client;

    public Calendar(BitrixRestClient client) {
        this.client = client;
        settings = new Settings(client);
        resource = new Resource(client);
        accessibility = new Accessibility(client);
        section = new Section(client);
        event = new Event(client);
        user = new User(client);
        meeting = new Meeting(client);
    }


}
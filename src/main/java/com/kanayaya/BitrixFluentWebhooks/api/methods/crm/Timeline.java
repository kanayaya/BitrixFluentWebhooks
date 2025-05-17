package com.kanayaya.BitrixFluentWebhooks.api.methods.crm;

import com.kanayaya.BitrixFluentWebhooks.BitrixRestClient;
import com.kanayaya.BitrixFluentWebhooks.api.methods.crm.timeline.Bindings;
import com.kanayaya.BitrixFluentWebhooks.api.methods.crm.timeline.Comment;
import com.kanayaya.BitrixFluentWebhooks.api.methods.crm.timeline.Layout;
import com.kanayaya.BitrixFluentWebhooks.api.methods.crm.timeline.Note;

public class Timeline {
    public final Layout layout;
    public final Note note;
    public final Bindings bindings;
    public final Comment comment;
    private final BitrixRestClient client;

    public Timeline(BitrixRestClient client) {
        this.client = client;
        layout = new Layout(client);
        note = new Note(client);
        bindings = new Bindings(client);
        comment = new Comment(client);
    }


}
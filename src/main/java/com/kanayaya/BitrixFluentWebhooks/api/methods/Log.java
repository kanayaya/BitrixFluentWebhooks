package com.kanayaya.BitrixFluentWebhooks.api.methods;

import com.kanayaya.BitrixFluentWebhooks.BitrixRestClient;
import com.kanayaya.BitrixFluentWebhooks.api.methods.log.Blogcomment;
import com.kanayaya.BitrixFluentWebhooks.api.methods.log.Blogpost;
import com.kanayaya.BitrixFluentWebhooks.api.methods.log.Comment;

public class Log {
    public final Comment comment;
    public final Blogpost blogpost;
    public final Blogcomment blogcomment;
    private final BitrixRestClient client;

    public Log(BitrixRestClient client) {
        this.client = client;
        comment = new Comment(client);
        blogpost = new Blogpost(client);
        blogcomment = new Blogcomment(client);
    }


}
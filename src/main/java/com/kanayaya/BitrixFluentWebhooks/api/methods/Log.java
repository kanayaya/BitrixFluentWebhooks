package com.kanayaya.BitrixFluentWebhooks.api.methods;

import com.kanayaya.BitrixFluentWebhooks.BitrixRestClient;
import com.kanayaya.BitrixFluentWebhooks.api.methods.log.Blogcomment;
import com.kanayaya.BitrixFluentWebhooks.api.methods.log.Blogpost;

public class Log {
    public final Blogpost blogpost;
    public final Blogcomment blogcomment;
    private final BitrixRestClient client;

    public Log(BitrixRestClient client) {
        this.client = client;
        blogpost = new Blogpost(client);
        blogcomment = new Blogcomment(client);
    }


}
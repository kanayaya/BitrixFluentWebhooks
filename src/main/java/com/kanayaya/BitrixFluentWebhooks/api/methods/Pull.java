package com.kanayaya.BitrixFluentWebhooks.api.methods;

import com.kanayaya.BitrixFluentWebhooks.BitrixRestClient;
import com.kanayaya.BitrixFluentWebhooks.api.methods.pull.Application;
import com.kanayaya.BitrixFluentWebhooks.api.methods.pull.Channel;
import com.kanayaya.BitrixFluentWebhooks.api.methods.pull.Config;
import com.kanayaya.BitrixFluentWebhooks.api.methods.pull.Watch;

public class Pull {
    public final Application application;
    public final Watch watch;
    public final Channel channel;
    public final Config config;
    private final BitrixRestClient client;

    public Pull(BitrixRestClient client) {
        this.client = client;
        application = new Application(client);
        watch = new Watch(client);
        channel = new Channel(client);
        config = new Config(client);
    }


}
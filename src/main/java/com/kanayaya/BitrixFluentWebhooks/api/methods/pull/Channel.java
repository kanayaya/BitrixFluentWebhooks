package com.kanayaya.BitrixFluentWebhooks.api.methods.pull;

import com.kanayaya.BitrixFluentWebhooks.BitrixRestClient;
import com.kanayaya.BitrixFluentWebhooks.api.methods.pull.channel.Public;

public class Channel {
    public final Public public_;
    private final BitrixRestClient client;

    public Channel(BitrixRestClient client) {
        this.client = client;
        public_ = new Public(client);
    }


}
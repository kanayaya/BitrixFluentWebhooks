package com.kanayaya.BitrixFluentWebhooks.api.methods.imopenlines;

import com.kanayaya.BitrixFluentWebhooks.BitrixRestClient;
import com.kanayaya.BitrixFluentWebhooks.api.methods.imopenlines.config.List;
import com.kanayaya.BitrixFluentWebhooks.api.methods.imopenlines.config.Path;

public class Config {
    public final Path path;
    public final List list;
    private final BitrixRestClient client;

    public Config(BitrixRestClient client) {
        this.client = client;
        path = new Path(client);
        list = new List(client);
    }

    // public void add() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#IMOPENLINES_CONFIG_ADD
    // public void get() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#IMOPENLINES_CONFIG_GET
    // public void update() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#IMOPENLINES_CONFIG_UPDATE
    // public void delete() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#IMOPENLINES_CONFIG_DELETE
}
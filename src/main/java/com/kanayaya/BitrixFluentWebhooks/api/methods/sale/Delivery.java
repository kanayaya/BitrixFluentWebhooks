package com.kanayaya.BitrixFluentWebhooks.api.methods.sale;

import com.kanayaya.BitrixFluentWebhooks.BitrixRestClient;
import com.kanayaya.BitrixFluentWebhooks.api.methods.sale.delivery.Config;
import com.kanayaya.BitrixFluentWebhooks.api.methods.sale.delivery.Extra;
import com.kanayaya.BitrixFluentWebhooks.api.methods.sale.delivery.Handler;
import com.kanayaya.BitrixFluentWebhooks.api.methods.sale.delivery.Request;

public class Delivery {
    public final Request request;
    public final Handler handler;
    public final Extra extra;
    public final Config config;
    private final BitrixRestClient client;

    public Delivery(BitrixRestClient client) {
        this.client = client;
        request = new Request(client);
        handler = new Handler(client);
        extra = new Extra(client);
        config = new Config(client);
    }

    // public void add() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#SALE_DELIVERY_ADD
    // public void getList() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#SALE_DELIVERY_GETLIST
    // public void update() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#SALE_DELIVERY_UPDATE
    // public void delete() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#SALE_DELIVERY_DELETE
}
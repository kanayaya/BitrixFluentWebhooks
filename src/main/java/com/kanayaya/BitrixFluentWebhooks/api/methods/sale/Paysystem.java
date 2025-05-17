package com.kanayaya.BitrixFluentWebhooks.api.methods.sale;

import com.kanayaya.BitrixFluentWebhooks.BitrixRestClient;
import com.kanayaya.BitrixFluentWebhooks.api.methods.sale.paysystem.Handler;
import com.kanayaya.BitrixFluentWebhooks.api.methods.sale.paysystem.Pay;
import com.kanayaya.BitrixFluentWebhooks.api.methods.sale.paysystem.Settings;

public class Paysystem {
    public final Settings settings;
    public final Handler handler;
    public final Pay pay;
    private final BitrixRestClient client;

    public Paysystem(BitrixRestClient client) {
        this.client = client;
        settings = new Settings(client);
        handler = new Handler(client);
        pay = new Pay(client);
    }

    // public void add() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#SALE_PAYSYSTEM_ADD
    // public void update() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#SALE_PAYSYSTEM_UPDATE
    // public void list() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#SALE_PAYSYSTEM_LIST
    // public void delete() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#SALE_PAYSYSTEM_DELETE
}
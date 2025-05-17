package com.kanayaya.BitrixFluentWebhooks.api.methods.sale;

import com.kanayaya.BitrixFluentWebhooks.BitrixRestClient;
import com.kanayaya.BitrixFluentWebhooks.api.methods.sale.cashbox.Check;
import com.kanayaya.BitrixFluentWebhooks.api.methods.sale.cashbox.Handler;

public class Cashbox {
    public final Handler handler;
    public final Check check;
    private final BitrixRestClient client;

    public Cashbox(BitrixRestClient client) {
        this.client = client;
        handler = new Handler(client);
        check = new Check(client);
    }

    // public void add() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#SALE_CASHBOX_ADD
    // public void update() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#SALE_CASHBOX_UPDATE
    // public void list() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#SALE_CASHBOX_LIST
    // public void delete() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#SALE_CASHBOX_DELETE
}
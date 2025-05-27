package com.kanayaya.BitrixFluentWebhooks.api.methods.sale;

import com.kanayaya.BitrixFluentWebhooks.BitrixRestClient;
import com.kanayaya.BitrixFluentWebhooks.api.methods.sale.cashbox.Check;
import com.kanayaya.BitrixFluentWebhooks.api.methods.sale.cashbox.Handler;
import com.kanayaya.BitrixFluentWebhooks.api.methods.sale.cashbox.Ofd;
import com.kanayaya.BitrixFluentWebhooks.api.methods.sale.cashbox.Settings;

public class Cashbox {
    public final Settings settings;
    public final Handler handler;
    public final Check check;
    public final Ofd ofd;
    private final BitrixRestClient client;

    public Cashbox(BitrixRestClient client) {
        this.client = client;
        settings = new Settings(client);
        handler = new Handler(client);
        check = new Check(client);
        ofd = new Ofd(client);
    }

    // public void add() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#SALE_CASHBOX_ADD
    // public void update() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#SALE_CASHBOX_UPDATE
    // public void list() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#SALE_CASHBOX_LIST
    // public void delete() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#SALE_CASHBOX_DELETE
}
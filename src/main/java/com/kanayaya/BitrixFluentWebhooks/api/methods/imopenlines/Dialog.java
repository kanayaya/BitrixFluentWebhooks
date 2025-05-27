package com.kanayaya.BitrixFluentWebhooks.api.methods.imopenlines;

import com.kanayaya.BitrixFluentWebhooks.BitrixRestClient;
import com.kanayaya.BitrixFluentWebhooks.api.methods.imopenlines.dialog.Form;
import com.kanayaya.BitrixFluentWebhooks.api.methods.imopenlines.dialog.Multi;

public class Dialog {
    public final Form form;
    public final Multi multi;
    private final BitrixRestClient client;

    public Dialog(BitrixRestClient client) {
        this.client = client;
        form = new Form(client);
        multi = new Multi(client);
    }

    // public void get() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#IMOPENLINES_DIALOG_GET
}
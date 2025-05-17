package com.kanayaya.BitrixFluentWebhooks.api.methods.sale.paysystem;

import com.kanayaya.BitrixFluentWebhooks.BitrixRestClient;
import com.kanayaya.BitrixFluentWebhooks.api.methods.sale.paysystem.settings.Invoice;
import com.kanayaya.BitrixFluentWebhooks.api.methods.sale.paysystem.settings.Payment;

public class Settings {
    public final Payment payment;
    public final Invoice invoice;
    private final BitrixRestClient client;

    public Settings(BitrixRestClient client) {
        this.client = client;
        payment = new Payment(client);
        invoice = new Invoice(client);
    }

    // public void get() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#SALE_PAYSYSTEM_SETTINGS_GET
    // public void update() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#SALE_PAYSYSTEM_SETTINGS_UPDATE
}
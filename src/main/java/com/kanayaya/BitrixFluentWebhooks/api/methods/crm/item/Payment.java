package com.kanayaya.BitrixFluentWebhooks.api.methods.crm.item;

import com.kanayaya.BitrixFluentWebhooks.BitrixRestClient;
import com.kanayaya.BitrixFluentWebhooks.api.methods.crm.item.payment.Delivery;
import com.kanayaya.BitrixFluentWebhooks.api.methods.crm.item.payment.Product;

public class Payment {
    public final Delivery delivery;
    public final Product product;
    private final BitrixRestClient client;

    public Payment(BitrixRestClient client) {
        this.client = client;
        delivery = new Delivery(client);
        product = new Product(client);
    }

    // public void add() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#CRM_ITEM_PAYMENT_ADD
    // public void get() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#CRM_ITEM_PAYMENT_GET
    // public void update() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#CRM_ITEM_PAYMENT_UPDATE
    // public void pay() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#CRM_ITEM_PAYMENT_PAY
    // public void unpay() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#CRM_ITEM_PAYMENT_UNPAY
    // public void list() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#CRM_ITEM_PAYMENT_LIST
    // public void delete() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#CRM_ITEM_PAYMENT_DELETE
}
package com.kanayaya.BitrixFluentWebhooks.api.methods.crm;

import com.kanayaya.BitrixFluentWebhooks.BitrixRestClient;
import com.kanayaya.BitrixFluentWebhooks.api.methods.crm.item.Delivery;
import com.kanayaya.BitrixFluentWebhooks.api.methods.crm.item.Payment;
import com.kanayaya.BitrixFluentWebhooks.api.methods.crm.item.Productrow;

public class Item {
    public final Delivery delivery;
    public final Productrow productrow;
    public final Payment payment;
    private final BitrixRestClient client;

    public Item(BitrixRestClient client) {
        this.client = client;
        delivery = new Delivery(client);
        productrow = new Productrow(client);
        payment = new Payment(client);
    }

    // public void add() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#CRM_ITEM_ADD
    // public void get() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#CRM_ITEM_GET
    // public void update() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#CRM_ITEM_UPDATE
    // public void list() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#CRM_ITEM_LIST
    // public void fields() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#CRM_ITEM_FIELDS
    // public void delete() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#CRM_ITEM_DELETE
}
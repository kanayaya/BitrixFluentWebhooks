package com.kanayaya.BitrixFluentWebhooks.api.methods.crm;

import com.kanayaya.BitrixFluentWebhooks.BitrixRestClient;
import com.kanayaya.BitrixFluentWebhooks.api.methods.crm.product.Property;

public class Product {
    public final Property property;
    private final BitrixRestClient client;

    public Product(BitrixRestClient client) {
        this.client = client;
        property = new Property(client);
    }

    // public void add() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#CRM_PRODUCT_ADD
    // public void get() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#CRM_PRODUCT_GET
    // public void update() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#CRM_PRODUCT_UPDATE
    // public void list() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#CRM_PRODUCT_LIST
    // public void fields() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#CRM_PRODUCT_FIELDS
    // public void delete() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#CRM_PRODUCT_DELETE
}
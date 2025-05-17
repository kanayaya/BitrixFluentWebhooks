package com.kanayaya.BitrixFluentWebhooks.api.methods.crm.product;

import com.kanayaya.BitrixFluentWebhooks.BitrixRestClient;
import com.kanayaya.BitrixFluentWebhooks.api.methods.crm.product.property.Enumeration;
import com.kanayaya.BitrixFluentWebhooks.api.methods.crm.product.property.Settings;

public class Property {
    public final Settings settings;
    public final Enumeration enumeration;
    private final BitrixRestClient client;

    public Property(BitrixRestClient client) {
        this.client = client;
        settings = new Settings(client);
        enumeration = new Enumeration(client);
    }

    // public void add() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#CRM_PRODUCT_PROPERTY_ADD
    // public void types() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#CRM_PRODUCT_PROPERTY_TYPES
    // public void get() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#CRM_PRODUCT_PROPERTY_GET
    // public void update() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#CRM_PRODUCT_PROPERTY_UPDATE
    // public void list() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#CRM_PRODUCT_PROPERTY_LIST
    // public void fields() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#CRM_PRODUCT_PROPERTY_FIELDS
    // public void delete() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#CRM_PRODUCT_PROPERTY_DELETE
}
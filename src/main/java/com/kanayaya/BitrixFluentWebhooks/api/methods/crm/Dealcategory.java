package com.kanayaya.BitrixFluentWebhooks.api.methods.crm;

import com.kanayaya.BitrixFluentWebhooks.BitrixRestClient;
import com.kanayaya.BitrixFluentWebhooks.api.methods.crm.dealcategory.Default;
import com.kanayaya.BitrixFluentWebhooks.api.methods.crm.dealcategory.Stage;

public class Dealcategory {
    public final Default defаult;
    public final Stage stage;
    private final BitrixRestClient client;

    public Dealcategory(BitrixRestClient client) {
        this.client = client;
        defаult = new Default(client);
        stage = new Stage(client);
    }

    // public void add() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#CRM_DEALCATEGORY_ADD
    // public void get() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#CRM_DEALCATEGORY_GET
    // public void update() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#CRM_DEALCATEGORY_UPDATE
    // public void list() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#CRM_DEALCATEGORY_LIST
    // public void fields() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#CRM_DEALCATEGORY_FIELDS
    // public void delete() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#CRM_DEALCATEGORY_DELETE
    // public void status() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#CRM_DEALCATEGORY_STATUS
}
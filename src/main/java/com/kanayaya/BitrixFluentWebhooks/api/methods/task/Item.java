package com.kanayaya.BitrixFluentWebhooks.api.methods.task;

import com.kanayaya.BitrixFluentWebhooks.BitrixRestClient;
import com.kanayaya.BitrixFluentWebhooks.api.methods.task.item.Userfield;

public class Item {
    public final Userfield userfield;
    private final BitrixRestClient client;

    public Item(BitrixRestClient client) {
        this.client = client;
        userfield = new Userfield(client);
    }

    // public void add() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#TASK_ITEM_ADD
    // public void defer() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#TASK_ITEM_DEFER
    // public void getdescription() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#TASK_ITEM_GETDESCRIPTION
    // public void update() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#TASK_ITEM_UPDATE
    // public void list() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#TASK_ITEM_LIST
    // public void getmanifest() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#TASK_ITEM_GETMANIFEST
    // public void getdata() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#TASK_ITEM_GETDATA
    // public void delete() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#TASK_ITEM_DELETE
    // public void getdependson() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#TASK_ITEM_GETDEPENDSON
    // public void getfiles() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#TASK_ITEM_GETFILES
    // public void addfile() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#TASK_ITEM_ADDFILE
    // public void delegate() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#TASK_ITEM_DELEGATE
    // public void deletefile() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#TASK_ITEM_DELETEFILE
    // public void getallowedtaskactionsasstrings() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#TASK_ITEM_GETALLOWEDTASKACTIONSASSTRINGS
    // public void addtofavourite() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#TASK_ITEM_ADDTOFAVOURITE
    // public void approve() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#TASK_ITEM_APPROVE
    // public void deletefromfavorite() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#TASK_ITEM_DELETEFROMFAVORITE
    // public void renew() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#TASK_ITEM_RENEW
    // public void disapprove() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#TASK_ITEM_DISAPPROVE
    // public void complete() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#TASK_ITEM_COMPLETE
    // public void isactionallowed() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#TASK_ITEM_ISACTIONALLOWED
    // public void startexecution() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#TASK_ITEM_STARTEXECUTION
    // public void getallowedactions() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#TASK_ITEM_GETALLOWEDACTIONS
}
package com.kanayaya.BitrixFluentWebhooks.api.methods.mobile;

import com.kanayaya.BitrixFluentWebhooks.BitrixRestClient;
import com.kanayaya.BitrixFluentWebhooks.api.methods.mobile.disk.Folder;

public class Disk {
    public final Folder folder;
    private final BitrixRestClient client;

    public Disk(BitrixRestClient client) {
        this.client = client;
        folder = new Folder(client);
    }

    // public void getfilebyobjectid() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#MOBILE_DISK_GETFILEBYOBJECTID
    // public void getattachmentsdata() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#MOBILE_DISK_GETATTACHMENTSDATA
    // public void getuploadedfilesfolder() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#MOBILE_DISK_GETUPLOADEDFILESFOLDER
}
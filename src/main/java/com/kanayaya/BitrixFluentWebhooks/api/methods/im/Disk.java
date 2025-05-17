package com.kanayaya.BitrixFluentWebhooks.api.methods.im;

import com.kanayaya.BitrixFluentWebhooks.BitrixRestClient;
import com.kanayaya.BitrixFluentWebhooks.api.methods.im.disk.File;
import com.kanayaya.BitrixFluentWebhooks.api.methods.im.disk.Folder;

public class Disk {
    public final File file;
    public final Folder folder;
    private final BitrixRestClient client;

    public Disk(BitrixRestClient client) {
        this.client = client;
        file = new File(client);
        folder = new Folder(client);
    }


}
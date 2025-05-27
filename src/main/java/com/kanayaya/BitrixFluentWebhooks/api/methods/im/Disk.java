package com.kanayaya.BitrixFluentWebhooks.api.methods.im;

import com.kanayaya.BitrixFluentWebhooks.BitrixRestClient;
import com.kanayaya.BitrixFluentWebhooks.api.methods.im.disk.File;
import com.kanayaya.BitrixFluentWebhooks.api.methods.im.disk.Folder;
import com.kanayaya.BitrixFluentWebhooks.api.methods.im.disk.Record;

public class Disk {
    public final File file;
    public final Folder folder;
    public final Record record;
    private final BitrixRestClient client;

    public Disk(BitrixRestClient client) {
        this.client = client;
        file = new File(client);
        folder = new Folder(client);
        record = new Record(client);
    }


}
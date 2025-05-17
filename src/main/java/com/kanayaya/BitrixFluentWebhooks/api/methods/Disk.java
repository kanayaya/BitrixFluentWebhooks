package com.kanayaya.BitrixFluentWebhooks.api.methods;

import com.kanayaya.BitrixFluentWebhooks.BitrixRestClient;
import com.kanayaya.BitrixFluentWebhooks.api.methods.disk.*;

public class Disk {
    public final File file;
    public final Folder folder;
    public final Rights rights;
    public final Storage storage;
    public final AttachedObject attachedObject;
    public final Version version;
    private final BitrixRestClient client;

    public Disk(BitrixRestClient client) {
        this.client = client;
        file = new File(client);
        folder = new Folder(client);
        rights = new Rights(client);
        storage = new Storage(client);
        attachedObject = new AttachedObject(client);
        version = new Version(client);
    }


}
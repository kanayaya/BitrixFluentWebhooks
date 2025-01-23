package com.kanayaya.BitrixFluentWebhooks.model.pojo;

import com.kanayaya.BitrixFluentWebhooks.BitrixClient;

import java.io.InputStream;

public interface BitrixFile {
    Integer getId();
    InputStream get(BitrixClient client);
}

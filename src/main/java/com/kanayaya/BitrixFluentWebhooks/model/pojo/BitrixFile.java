package com.kanayaya.BitrixFluentWebhooks.model.pojo;

import com.kanayaya.BitrixFluentWebhooks.BitrixRestClient;

import java.io.InputStream;

public interface BitrixFile {
    Integer getId();
    InputStream get(BitrixRestClient client);
}

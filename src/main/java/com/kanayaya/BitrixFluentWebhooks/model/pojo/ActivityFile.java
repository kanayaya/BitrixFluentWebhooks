package com.kanayaya.BitrixFluentWebhooks.model.pojo;

import com.kanayaya.BitrixFluentWebhooks.BitrixClient;

import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ActivityFile implements BitrixFile {
    public ActivityFile() {}
    public ActivityFile(Integer id, String url) {
        this.id = id;
        this.url = url;
    }

    private Integer id;
    private String url;
    @Override
    public Integer getId() {
        return id;
    }
    @Override
    public InputStream get(BitrixClient client) {
        try {
            return client.client().send(
                    HttpRequest.newBuilder().uri(new URI(url)).GET().build(),
                    HttpResponse.BodyHandlers.ofInputStream()).body();
        } catch (IOException | InterruptedException | URISyntaxException e) {
            throw new RuntimeException(e);
        }
    }
}

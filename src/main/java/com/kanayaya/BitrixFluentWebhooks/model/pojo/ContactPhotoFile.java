package com.kanayaya.BitrixFluentWebhooks.model.pojo;

import com.kanayaya.BitrixFluentWebhooks.BitrixClient;

import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ContactPhotoFile implements BitrixFile {
    private Integer id;
    private String showUrl;
    private String downloadUrl;
    public ContactPhotoFile() {}

    public ContactPhotoFile(Integer id, String showUrl, String downloadUrl) {
        this.id = id;
        this.showUrl = showUrl;
        this.downloadUrl = downloadUrl;
    }

    @Override
    public Integer getId() {
        return id;
    }

    @Override
    public InputStream get(BitrixClient client) {
        String uri = (downloadUrl.startsWith("http")? "" : client.host().endsWith("/")? client.host().substring(0, client.host().length() - 1) : client.host()) +
                downloadUrl;
        try {
            return client.client().send(HttpRequest.newBuilder().uri(new URI(uri)).GET().build(), HttpResponse.BodyHandlers.ofInputStream()).body();
        } catch (IOException | URISyntaxException | InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

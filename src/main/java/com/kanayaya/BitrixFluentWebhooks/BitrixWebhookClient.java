package com.kanayaya.BitrixFluentWebhooks;

import com.kanayaya.BitrixFluentWebhooks.api.Method;
import com.kanayaya.BitrixFluentWebhooks.api.request.PathFilterBuilder;
import com.kanayaya.BitrixFluentWebhooks.api.request.WebhookRequest;
import com.kanayaya.BitrixFluentWebhooks.model.tables.User;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;

public abstract class BitrixWebhookClient {
    public abstract String host();
    protected abstract String token();
    protected abstract Long userId();

    public String getUsersString(String name) {
        WebhookRequest request = new WebhookRequest(host(), token(), userId(), Method.USER_GET, new PathFilterBuilder<User>().field(User.NAME).contains(name).getParameters());

        try {
            HttpClient client = HttpClient.newHttpClient();
            System.out.println(client.send(HttpRequest.newBuilder().uri(new URI("http://localhost/rest/1/9q8lzi36i7cb8tk5/user.get.json/?%25NAME=%D0%BC%D0%B8%D0%BD")).GET().build(), HttpResponse.BodyHandlers.ofString(StandardCharsets.UTF_8)).body());
            HttpResponse<String> response = client.send(request.inner(), HttpResponse.BodyHandlers.ofString(StandardCharsets.UTF_8));
            return response.body();
        } catch (IOException | InterruptedException | URISyntaxException e) {
            throw new RuntimeException(e);
        }
    }


}

package com.kanayaya.BitrixFluentWebhooks.api.methods;

import com.kanayaya.BitrixFluentWebhooks.BitrixRestClient;
import com.kanayaya.BitrixFluentWebhooks.api.methods.documentgenerator.*;

public class Documentgenerator {
    public final Template template;
    public final Role role;
    public final Document document;
    public final Region region;
    public final Numerator numerator;
    private final BitrixRestClient client;

    public Documentgenerator(BitrixRestClient client) {
        this.client = client;
        template = new Template(client);
        role = new Role(client);
        document = new Document(client);
        region = new Region(client);
        numerator = new Numerator(client);
    }


}
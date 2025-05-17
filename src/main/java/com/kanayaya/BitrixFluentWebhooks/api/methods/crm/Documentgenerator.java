package com.kanayaya.BitrixFluentWebhooks.api.methods.crm;

import com.kanayaya.BitrixFluentWebhooks.BitrixRestClient;
import com.kanayaya.BitrixFluentWebhooks.api.methods.crm.documentgenerator.Document;
import com.kanayaya.BitrixFluentWebhooks.api.methods.crm.documentgenerator.Numerator;
import com.kanayaya.BitrixFluentWebhooks.api.methods.crm.documentgenerator.Template;

public class Documentgenerator {
    public final Template template;
    public final Document document;
    public final Numerator numerator;
    private final BitrixRestClient client;

    public Documentgenerator(BitrixRestClient client) {
        this.client = client;
        template = new Template(client);
        document = new Document(client);
        numerator = new Numerator(client);
    }


}
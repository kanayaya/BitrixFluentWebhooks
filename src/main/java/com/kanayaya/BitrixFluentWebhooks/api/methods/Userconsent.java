package com.kanayaya.BitrixFluentWebhooks.api.methods;

import com.kanayaya.BitrixFluentWebhooks.BitrixRestClient;
import com.kanayaya.BitrixFluentWebhooks.api.methods.userconsent.Agreement;
import com.kanayaya.BitrixFluentWebhooks.api.methods.userconsent.Consent;

public class Userconsent {
    public final Agreement agreement;
    public final Consent consent;
    private final BitrixRestClient client;

    public Userconsent(BitrixRestClient client) {
        this.client = client;
        agreement = new Agreement(client);
        consent = new Consent(client);
    }


}
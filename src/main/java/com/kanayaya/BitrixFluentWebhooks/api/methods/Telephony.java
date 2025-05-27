package com.kanayaya.BitrixFluentWebhooks.api.methods;

import com.kanayaya.BitrixFluentWebhooks.BitrixRestClient;
import com.kanayaya.BitrixFluentWebhooks.api.methods.telephony.Call;
import com.kanayaya.BitrixFluentWebhooks.api.methods.telephony.ExternalCall;
import com.kanayaya.BitrixFluentWebhooks.api.methods.telephony.ExternalLine;

public class Telephony {
    public final Call call;
    public final ExternalCall externalCall;
    public final ExternalLine externalLine;
    private final BitrixRestClient client;

    public Telephony(BitrixRestClient client) {
        this.client = client;
        call = new Call(client);
        externalCall = new ExternalCall(client);
        externalLine = new ExternalLine(client);
    }


}
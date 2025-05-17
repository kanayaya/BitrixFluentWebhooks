package com.kanayaya.BitrixFluentWebhooks.api.methods.voximplant;

import com.kanayaya.BitrixFluentWebhooks.BitrixRestClient;
import com.kanayaya.BitrixFluentWebhooks.api.methods.voximplant.tts.Voices;

public class Tts {
    public final Voices voices;
    private final BitrixRestClient client;

    public Tts(BitrixRestClient client) {
        this.client = client;
        voices = new Voices(client);
    }


}
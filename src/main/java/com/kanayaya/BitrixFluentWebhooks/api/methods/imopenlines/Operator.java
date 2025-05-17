package com.kanayaya.BitrixFluentWebhooks.api.methods.imopenlines;

import com.kanayaya.BitrixFluentWebhooks.BitrixRestClient;
import com.kanayaya.BitrixFluentWebhooks.api.methods.imopenlines.operator.Another;

public class Operator {
    public final Another another;
    private final BitrixRestClient client;

    public Operator(BitrixRestClient client) {
        this.client = client;
        another = new Another(client);
    }

    // public void transfer() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#IMOPENLINES_OPERATOR_TRANSFER
    // public void answer() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#IMOPENLINES_OPERATOR_ANSWER
    // public void finish() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#IMOPENLINES_OPERATOR_FINISH
    // public void skip() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#IMOPENLINES_OPERATOR_SKIP
    // public void spam() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#IMOPENLINES_OPERATOR_SPAM
}
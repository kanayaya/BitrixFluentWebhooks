package com.kanayaya.BitrixFluentWebhooks.model.pojo.idable;

import com.kanayaya.BitrixFluentWebhooks.BitrixRestClient;

public interface Entity<SELF extends Entity<SELF, FULL, ID_TYPE>, FULL extends SELF, ID_TYPE> {
    ID_TYPE getId();
    boolean delete(BitrixRestClient client);
    <ALT extends SELF> ALT getFull(BitrixRestClient client, Class<? extends ALT> clazz);
    FULL getFull(BitrixRestClient client);
}

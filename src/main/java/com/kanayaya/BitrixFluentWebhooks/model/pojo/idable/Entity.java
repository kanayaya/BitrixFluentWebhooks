package com.kanayaya.BitrixFluentWebhooks.model.pojo.idable;

import com.kanayaya.BitrixFluentWebhooks.BitrixClient;

public interface Entity<SELF extends Entity<SELF, FULL, ID_TYPE>, FULL extends SELF, ID_TYPE> {
    ID_TYPE getId();
    boolean delete(BitrixClient client);
    <ALT extends SELF> ALT getFull(BitrixClient client, Class<? extends ALT> clazz);
    FULL getFull(BitrixClient client);
}

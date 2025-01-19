package com.kanayaya.BitrixFluentWebhooks.model.pojo.idable;

import com.kanayaya.BitrixFluentWebhooks.BitrixWebhookClient;
import com.kanayaya.BitrixFluentWebhooks.model.pojo.full.FullEntity;

public interface Entity<FULL extends FullEntity<FULL>> {
    int getId();
    boolean delete(BitrixWebhookClient client);

    FULL getFull();

}

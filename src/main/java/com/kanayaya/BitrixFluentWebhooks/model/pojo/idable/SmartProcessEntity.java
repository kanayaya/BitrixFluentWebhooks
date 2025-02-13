package com.kanayaya.BitrixFluentWebhooks.model.pojo.idable;

public interface SmartProcessEntity<T extends SmartProcessEntity<T, FULL>, FULL extends T> extends Entity<T, FULL, Integer> {
    int getEntityTypeId();
}

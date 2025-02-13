package com.kanayaya.BitrixFluentWebhooks.model.pojo.idable;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.kanayaya.BitrixFluentWebhooks.BitrixClient;
import com.kanayaya.BitrixFluentWebhooks.model.pojo.full.FullCatalogEntity;

public class CatalogEntity implements Entity<CatalogEntity, FullCatalogEntity, Integer> {
    @JsonProperty("ID")
    private int id;
    public CatalogEntity() {

    }
    public CatalogEntity(int id) {
        this.id = id;
    }
    @Override
    public Integer getId() {
        return id;
    }

    @Override
    public boolean delete(BitrixClient client) {
        return false;
    }

    @Override
    public <ALT extends CatalogEntity> ALT getFull(BitrixClient client, Class<? extends ALT> clazz) {
        return null;
    }

    @Override
    public FullCatalogEntity getFull(BitrixClient client) {
        return getFull(client, FullCatalogEntity.class);
    }


}
package com.kanayaya.BitrixFluentWebhooks.model.pojo.idable;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.kanayaya.BitrixFluentWebhooks.BitrixClient;
import com.kanayaya.BitrixFluentWebhooks.model.pojo.full.FullCatalogEntity;
import com.kanayaya.BitrixFluentWebhooks.model.tables.Catalog;

public class CatalogEntity implements Entity<FullCatalogEntity> {
    @JsonProperty("ID")
    private int id;
    public CatalogEntity() {

    }
    public CatalogEntity(int id) {
        this.id = id;
    }
    @Override
    public int getId() {
        return id;
    }

    @Override
    public boolean delete(BitrixClient client) {
        return false;
    }

    @Override
    public FullCatalogEntity getFull(BitrixClient client) {
        return null;
    }
}
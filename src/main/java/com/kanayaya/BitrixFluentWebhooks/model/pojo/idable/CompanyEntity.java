package com.kanayaya.BitrixFluentWebhooks.model.pojo.idable;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.kanayaya.BitrixFluentWebhooks.BitrixClient;
import com.kanayaya.BitrixFluentWebhooks.model.pojo.full.FullCompanyEntity;

public class CompanyEntity implements Entity<CompanyEntity, FullCompanyEntity, Integer> {
    @JsonProperty("ID")
    private int id;
    public CompanyEntity() {

    }
    public CompanyEntity(int id) {
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
    public <ALT extends CompanyEntity> ALT getFull(BitrixClient client, Class<? extends ALT> clazz) {
        return null;
    }

    @Override
    public FullCompanyEntity getFull(BitrixClient client) {
        return null;
    }
}
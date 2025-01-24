package com.kanayaya.BitrixFluentWebhooks.model.pojo.idable;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.kanayaya.BitrixFluentWebhooks.BitrixClient;
import com.kanayaya.BitrixFluentWebhooks.model.pojo.full.FullCompanyEntity;
import com.kanayaya.BitrixFluentWebhooks.model.tables.Company;

public class CompanyEntity implements Entity<FullCompanyEntity> {
    @JsonProperty("ID")
    private int id;
    public CompanyEntity() {

    }
    public CompanyEntity(int id) {
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
    public FullCompanyEntity getFull(BitrixClient client) {
        return null;
    }
}
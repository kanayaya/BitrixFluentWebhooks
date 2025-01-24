package com.kanayaya.BitrixFluentWebhooks.model.pojo.idable;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.kanayaya.BitrixFluentWebhooks.BitrixClient;
import com.kanayaya.BitrixFluentWebhooks.model.pojo.full.FullLeadEntity;
import com.kanayaya.BitrixFluentWebhooks.model.tables.Lead;

public class LeadEntity implements Entity<FullLeadEntity> {
    @JsonProperty("ID")
    private int id;
    public LeadEntity() {

    }
    public LeadEntity(int id) {
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
    public FullLeadEntity getFull(BitrixClient client) {
        return null;
    }
}
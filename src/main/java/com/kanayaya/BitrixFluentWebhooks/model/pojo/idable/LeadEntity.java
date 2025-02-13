package com.kanayaya.BitrixFluentWebhooks.model.pojo.idable;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.kanayaya.BitrixFluentWebhooks.BitrixClient;
import com.kanayaya.BitrixFluentWebhooks.model.pojo.full.FullLeadEntity;

public class LeadEntity implements Entity<LeadEntity, FullLeadEntity, Integer> {
    @JsonProperty("ID")
    private int id;
    public LeadEntity() {

    }
    public LeadEntity(int id) {
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
    public <ALT extends LeadEntity> ALT getFull(BitrixClient client, Class<? extends ALT> clazz) {
        return null;
    }

    @Override
    public FullLeadEntity getFull(BitrixClient client) {
        return null;
    }
}
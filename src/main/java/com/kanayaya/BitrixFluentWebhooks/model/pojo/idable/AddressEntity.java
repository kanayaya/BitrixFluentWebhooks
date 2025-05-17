package com.kanayaya.BitrixFluentWebhooks.model.pojo.idable;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.kanayaya.BitrixFluentWebhooks.BitrixRestClient;
import com.kanayaya.BitrixFluentWebhooks.model.pojo.full.FullAddressEntity;

public class AddressEntity implements Entity<Integer> {
    @JsonProperty("TYPE_ID")
    private int id;
    public AddressEntity() {

    }
    public AddressEntity(int id) {
        this.id = id;
    }
    public Integer getId() {
        return id;
    }
}
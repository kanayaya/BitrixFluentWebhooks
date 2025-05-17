package com.kanayaya.BitrixFluentWebhooks.model.pojo.idable;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@JsonIdentityInfo(
        generator = ObjectIdGenerators.PropertyGenerator.class,
        property = "ID"
)
public class UserEntity implements Entity<Integer> {
    @JsonProperty("ID")
    private int id;
    public UserEntity() {

    }
    public UserEntity(int id) {
        this.id = id;
    }
    @Override
    public Integer getId() {
        return id;
    }
}

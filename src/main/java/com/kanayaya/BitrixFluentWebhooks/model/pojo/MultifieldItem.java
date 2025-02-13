package com.kanayaya.BitrixFluentWebhooks.model.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MultifieldItem<V> {
    @JsonProperty("ID")
    private Integer id;
    @JsonProperty("VALUE_TYPE")
    private String valueType;
    @JsonProperty("VALUE")
    private V value;
    @JsonProperty("TYPE_ID")
    private String typeId;

    public int getId() {
        return id;
    }

    public String getValueType() {
        return valueType;
    }

    public V getValue() {
        return value;
    }

    public String getTypeId() {
        return typeId;
    }

    @Override
    public String toString() {
        return "MultifieldItem{" +
                "id=" + id +
                ", valueType='" + valueType + '\'' +
                ", value=" + value +
                ", typeId='" + typeId + '\'' +
                '}';
    }
}

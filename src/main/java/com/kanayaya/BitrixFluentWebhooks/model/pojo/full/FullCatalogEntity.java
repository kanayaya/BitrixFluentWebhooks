package com.kanayaya.BitrixFluentWebhooks.model.pojo.full;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.kanayaya.BitrixFluentWebhooks.BitrixRestClient;
import com.kanayaya.BitrixFluentWebhooks.model.pojo.idable.CatalogEntity;

public class FullCatalogEntity extends CatalogEntity {
    /**
    * ID
    */
    @JsonProperty("ID")
    private Integer id;
    /**
    * Название
    */
    @JsonProperty("NAME")
    private String name;
    /**
    * Внешний источник
    */
    @JsonProperty("ORIGINATOR_ID")
    private String originatorId;
    /**
    * Идентификатор элемента в источнике данных
    */
    @JsonProperty("ORIGIN_ID")
    private String originId;
    /**
    * Внешний код
    */
    @JsonProperty("XML_ID")
    private String xmlId;

    @Override
    public <FULL extends CatalogEntity> FULL getFull(BitrixRestClient client, Class<? extends FULL> clazz) {
        if (getClass().equals(clazz)) {
            return (FULL) this;
        }
        return super.getFull(client, clazz);
    }
}
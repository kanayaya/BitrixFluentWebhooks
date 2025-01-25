package com.kanayaya.BitrixFluentWebhooks.model.pojo.full;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.kanayaya.BitrixFluentWebhooks.BitrixClient;
import com.kanayaya.BitrixFluentWebhooks.model.enums.YN;
import com.kanayaya.BitrixFluentWebhooks.model.pojo.idable.StatusEntity;

public class FullStatusEntity extends StatusEntity {
    /**
    * ID
    */
    @JsonProperty("ID")
    private Integer id;
    /**
    * ID элемента сущности
    */
    @JsonProperty("ENTITY_ID")
    private String entityId;
    /**
    * Статус
    */
    @JsonProperty("STATUS_ID")
    private String statusId;
    /**
    * Сортировка
    */
    @JsonProperty("SORT")
    private Integer sort;
    /**
    * Название
    */
    @JsonProperty("NAME")
    private String name;
    /**
    * Название по умолчанию
    */
    @JsonProperty("NAME_INIT")
    private String nameInit;
    /**
    * Системный
    */
    @JsonProperty("SYSTEM")
    private YN system;
    /**
    * CATEGORY_ID
    */
    @JsonProperty("CATEGORY_ID")
    private Integer categoryId;
    /**
    * COLOR
    */
    @JsonProperty("COLOR")
    private String color;
    /**
    * SEMANTICS
    */
    @JsonProperty("SEMANTICS")
    private YN semantics;

    @Override
    public FullStatusEntity getFull(BitrixClient client) {
        return this;
    }
}
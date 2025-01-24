package com.kanayaya.BitrixFluentWebhooks.model.pojo.full;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.kanayaya.BitrixFluentWebhooks.BitrixClient;
import com.kanayaya.BitrixFluentWebhooks.model.pojo.idable.ActivityCommunicationEntity;

public class FullActivityCommunicationEntity extends ActivityCommunicationEntity implements FullEntity<FullActivityCommunicationEntity> {
    /**
    * ID
    */
    @JsonProperty("ID")
    private Integer id;
    /**
    * Дело
    */
    @JsonProperty("ACTIVITY_ID")
    private Integer activityId;
    /**
    * ID элемента сущности
    */
    @JsonProperty("ENTITY_ID")
    private Integer entityId;
    /**
    * Тип сущности
    */
    @JsonProperty("ENTITY_TYPE_ID")
    private Integer entityTypeId;
    /**
    * Тип
    */
    @JsonProperty("TYPE")
    private String type;
    /**
    * Значение
    */
    @JsonProperty("VALUE")
    private String value;

    @Override
    public FullActivityCommunicationEntity getFull(BitrixClient client) {
        return this;
    }
}
package com.kanayaya.BitrixFluentWebhooks.model.pojo.full;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.kanayaya.BitrixFluentWebhooks.BitrixClient;
import com.kanayaya.BitrixFluentWebhooks.model.pojo.idable.AddressEntity;

public class FullAddressEntity extends AddressEntity {
    /**
    * ENTITY_TYPE_ID
    */
    @JsonProperty("ENTITY_TYPE_ID")
    private Integer entityTypeId;
    /**
    * ENTITY_ID
    */
    @JsonProperty("ENTITY_ID")
    private Integer entityId;
    /**
    * Улица, дом, корпус, строение
    */
    @JsonProperty("ADDRESS_1")
    private String address1;
    /**
    * Квартира / офис
    */
    @JsonProperty("ADDRESS_2")
    private String address2;
    /**
    * Город
    */
    @JsonProperty("CITY")
    private String city;
    /**
    * Почтовый индекс
    */
    @JsonProperty("POSTAL_CODE")
    private String postalCode;
    /**
    * Район
    */
    @JsonProperty("REGION")
    private String region;
    /**
    * Область
    */
    @JsonProperty("PROVINCE")
    private String province;
    /**
    * Страна
    */
    @JsonProperty("COUNTRY")
    private String country;
    /**
    * COUNTRY_CODE
    */
    @JsonProperty("COUNTRY_CODE")
    private String countryCode;
    /**
    * Идентификатор адреса местоположения
    */
    @JsonProperty("LOC_ADDR_ID")
    private Integer locAddrId;
    /**
    * ANCHOR_TYPE_ID
    */
    @JsonProperty("ANCHOR_TYPE_ID")
    private Integer anchorTypeId;
    /**
    * ANCHOR_ID
    */
    @JsonProperty("ANCHOR_ID")
    private Integer anchorId;

    @Override
    public <FULL extends AddressEntity> FULL getFull(BitrixClient client, Class<? extends FULL> clazz) {
        if (getClass().equals(clazz)) {
            return (FULL) this;
        }
        return super.getFull(client, clazz);
    }
}
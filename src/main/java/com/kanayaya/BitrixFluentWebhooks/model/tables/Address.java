package com.kanayaya.BitrixFluentWebhooks.model.tables;

import com.kanayaya.BitrixFluentWebhooks.model.Field;
import com.kanayaya.BitrixFluentWebhooks.model.Table;
import com.kanayaya.BitrixFluentWebhooks.model.bitrixTypes.*;
import com.kanayaya.BitrixFluentWebhooks.model.bitrixTypes.enums.CountryField;
import com.kanayaya.BitrixFluentWebhooks.model.bitrixTypes.enums.YNField;
import com.kanayaya.BitrixFluentWebhooks.model.bitrixTypes.entities.*;

import java.time.OffsetDateTime;

import static com.kanayaya.BitrixFluentWebhooks.model.bitrixTypes.SerializerUtils.*;

public class Address extends Table {
/**
    * TYPE_ID
    */
public static final Field<Address, Integer> TYPE_ID = new Field<>("TYPE_ID", INTEGER_DESERIALIZER);
/**
    * ENTITY_TYPE_ID
    */
public static final Field<Address, Integer> ENTITY_TYPE_ID = new Field<>("ENTITY_TYPE_ID", INTEGER_DESERIALIZER);
/**
    * ENTITY_ID
    */
public static final Field<Address, Integer> ENTITY_ID = new Field<>("ENTITY_ID", INTEGER_DESERIALIZER);
/**
    * Улица, дом, корпус, строение
    */
public static final StringField<Address> ADDRESS_1 = new StringField<>("ADDRESS_1");
/**
    * Квартира / офис
    */
public static final StringField<Address> ADDRESS_2 = new StringField<>("ADDRESS_2");
/**
    * Город
    */
public static final StringField<Address> CITY = new StringField<>("CITY");
/**
    * Почтовый индекс
    */
public static final StringField<Address> POSTAL_CODE = new StringField<>("POSTAL_CODE");
/**
    * Район
    */
public static final StringField<Address> REGION = new StringField<>("REGION");
/**
    * Область
    */
public static final StringField<Address> PROVINCE = new StringField<>("PROVINCE");
/**
    * Страна
    */
public static final StringField<Address> COUNTRY = new StringField<>("COUNTRY");
/**
    * COUNTRY_CODE
    */
public static final StringField<Address> COUNTRY_CODE = new StringField<>("COUNTRY_CODE");
/**
    * Идентификатор адреса местоположения
    */
public static final Field<Address, Integer> LOC_ADDR_ID = new Field<>("LOC_ADDR_ID", INTEGER_DESERIALIZER);
/**
    * ANCHOR_TYPE_ID
    */
public static final Field<Address, Integer> ANCHOR_TYPE_ID = new Field<>("ANCHOR_TYPE_ID", INTEGER_DESERIALIZER);
/**
    * ANCHOR_ID
    */
public static final Field<Address, Integer> ANCHOR_ID = new Field<>("ANCHOR_ID", INTEGER_DESERIALIZER);
}
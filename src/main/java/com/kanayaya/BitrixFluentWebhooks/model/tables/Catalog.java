package com.kanayaya.BitrixFluentWebhooks.model.tables;

import com.kanayaya.BitrixFluentWebhooks.model.Field;
import com.kanayaya.BitrixFluentWebhooks.model.Table;
import com.kanayaya.BitrixFluentWebhooks.model.bitrixTypes.*;
import com.kanayaya.BitrixFluentWebhooks.model.bitrixTypes.enums.CountryField;
import com.kanayaya.BitrixFluentWebhooks.model.bitrixTypes.enums.YNField;

import java.time.OffsetDateTime;

import static com.kanayaya.BitrixFluentWebhooks.model.bitrixTypes.SerializerUtils.*;

public class Catalog extends Table {
    /**
    * ID
    */
public static final Field<Catalog, Integer> ID = new Field<>("ID", INTEGER_DESERIALIZER);
/**
    * Название
    */
public static final StringField<Catalog> NAME = new StringField<>("NAME");
/**
    * Внешний источник
    */
public static final StringField<Catalog> ORIGINATOR_ID = new StringField<>("ORIGINATOR_ID");
/**
    * Идентификатор элемента в источнике данных
    */
public static final StringField<Catalog> ORIGIN_ID = new StringField<>("ORIGIN_ID");
/**
    * Внешний код
    */
public static final StringField<Catalog> XML_ID = new StringField<>("XML_ID");
}
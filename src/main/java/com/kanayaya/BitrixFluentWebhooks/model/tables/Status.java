package com.kanayaya.BitrixFluentWebhooks.model.tables;

import com.kanayaya.BitrixFluentWebhooks.model.Field;
import com.kanayaya.BitrixFluentWebhooks.model.Table;
import com.kanayaya.BitrixFluentWebhooks.model.bitrixTypes.*;
import com.kanayaya.BitrixFluentWebhooks.model.bitrixTypes.enums.CountryField;
import com.kanayaya.BitrixFluentWebhooks.model.bitrixTypes.enums.YNField;

import java.time.OffsetDateTime;

import static com.kanayaya.BitrixFluentWebhooks.model.bitrixTypes.SerializerUtils.*;

public class Status extends Table {
    /**
    * ID
    */
public static final Field<Status, Integer> ID = new Field<>("ID", INTEGER_DESERIALIZER);
/**
    * ID элемента сущности
    */
public static final StringField<Status> ENTITY_ID = new StringField<>("ENTITY_ID");
/**
    * Статус
    */
public static final StringField<Status> STATUS_ID = new StringField<>("STATUS_ID");
/**
    * Сортировка
    */
public static final Field<Status, Integer> SORT = new Field<>("SORT", INTEGER_DESERIALIZER);
/**
    * Название
    */
public static final StringField<Status> NAME = new StringField<>("NAME");
/**
    * Название по умолчанию
    */
public static final StringField<Status> NAME_INIT = new StringField<>("NAME_INIT");
/**
    * Системный
    */
public static final YNField<Status> SYSTEM = new YNField<>("SYSTEM");
/**
    * CATEGORY_ID
    */
public static final Field<Status, Integer> CATEGORY_ID = new Field<>("CATEGORY_ID", INTEGER_DESERIALIZER);
/**
    * COLOR
    */
public static final StringField<Status> COLOR = new StringField<>("COLOR");
/**
    * SEMANTICS
    */
public static final YNField<Status> SEMANTICS = new YNField<>("SEMANTICS");
}
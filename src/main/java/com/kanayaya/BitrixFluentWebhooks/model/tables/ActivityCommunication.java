package com.kanayaya.BitrixFluentWebhooks.model.tables;

import com.kanayaya.BitrixFluentWebhooks.model.Field;
import com.kanayaya.BitrixFluentWebhooks.model.Table;
import com.kanayaya.BitrixFluentWebhooks.model.bitrixTypes.*;
import com.kanayaya.BitrixFluentWebhooks.model.bitrixTypes.enums.CountryField;
import com.kanayaya.BitrixFluentWebhooks.model.bitrixTypes.enums.YNField;

import java.time.OffsetDateTime;

import static com.kanayaya.BitrixFluentWebhooks.model.bitrixTypes.SerializerUtils.*;

public class ActivityCommunication extends Table {/**
    * ID
    */
public static final Field<ActivityCommunication, Integer> ID = new Field<>("ID", INTEGER_DESERIALIZER);
/**
    * Дело
    */
public static final Field<ActivityCommunication, Integer> ACTIVITY_ID = new Field<>("ACTIVITY_ID", INTEGER_DESERIALIZER);
/**
    * ID элемента сущности
    */
public static final Field<ActivityCommunication, Integer> ENTITY_ID = new Field<>("ENTITY_ID", INTEGER_DESERIALIZER);
/**
    * Тип сущности
    */
public static final Field<ActivityCommunication, Integer> ENTITY_TYPE_ID = new Field<>("ENTITY_TYPE_ID", INTEGER_DESERIALIZER);
/**
    * Тип
    */
public static final StringField<ActivityCommunication> TYPE = new StringField<>("TYPE");
/**
    * Значение
    */
public static final StringField<ActivityCommunication> VALUE = new StringField<>("VALUE");
}
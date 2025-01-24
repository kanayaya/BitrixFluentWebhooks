package com.kanayaya.BitrixFluentWebhooks.model.tables;

import com.kanayaya.BitrixFluentWebhooks.model.Field;
import com.kanayaya.BitrixFluentWebhooks.model.Table;
import com.kanayaya.BitrixFluentWebhooks.model.bitrixTypes.*;
import com.kanayaya.BitrixFluentWebhooks.model.bitrixTypes.enums.*;
import com.kanayaya.BitrixFluentWebhooks.model.bitrixTypes.entities.*;

import java.time.OffsetDateTime;

import static com.kanayaya.BitrixFluentWebhooks.model.bitrixTypes.SerializerUtils.*;

public class Activity extends Table {
/**
    * ID
    */
public static final Field<Activity, Integer> ID = new Field<>("ID", INTEGER_DESERIALIZER);
/**
    * ID владельца
    */
public static final Field<Activity, Integer> OWNER_ID = new Field<>("OWNER_ID", INTEGER_DESERIALIZER);
/**
    * Тип владельца
    */
public static final OwnertypeField OWNER_TYPE_ID = new OwnertypeField("OWNER_TYPE_ID");
/**
    * Тип
    */
public static final ActivitytypeField TYPE_ID = new ActivitytypeField("TYPE_ID");
/**
    * ID провайдера
    */
public static final StringField<Activity> PROVIDER_ID = new StringField<>("PROVIDER_ID");
/**
    * Тип провайдера
    */
public static final StringField<Activity> PROVIDER_TYPE_ID = new StringField<>("PROVIDER_TYPE_ID");
/**
    * Тип коннектора
    */
public static final StringField<Activity> PROVIDER_GROUP_ID = new StringField<>("PROVIDER_GROUP_ID");
/**
    * ID связанной с делом сущности
    */
public static final Field<Activity, Integer> ASSOCIATED_ENTITY_ID = new Field<>("ASSOCIATED_ENTITY_ID", INTEGER_DESERIALIZER);
/**
    * Тема
    */
public static final StringField<Activity> SUBJECT = new StringField<>("SUBJECT");
/**
    * Начало
    */
public static final DateField<Activity, OffsetDateTime> START_TIME = new DateField<>("START_TIME", DateField.DateLevel.OFFSET_DATE_TIME_LEVEL);
/**
    * Срок
    */
public static final DateField<Activity, OffsetDateTime> END_TIME = new DateField<>("END_TIME", DateField.DateLevel.OFFSET_DATE_TIME_LEVEL);
/**
    * Срок исполнения
    */
public static final DateField<Activity, OffsetDateTime> DEADLINE = new DateField<>("DEADLINE", DateField.DateLevel.OFFSET_DATE_TIME_LEVEL);
/**
    * Выполнено
    */
public static final YNField<Activity> COMPLETED = new YNField<>("COMPLETED");
/**
    * Статус
    */
public static final ActivitystatusField STATUS = new ActivitystatusField("STATUS");
/**
    * Ответственный
    */
public static final UserField<Activity> RESPONSIBLE_ID = new UserField<>("RESPONSIBLE_ID");
/**
    * Важность
    */
public static final ActivitypriorityField PRIORITY = new ActivitypriorityField("PRIORITY");
/**
    * Тип уведомлений
    */
public static final ActivitynotifytypeField NOTIFY_TYPE = new ActivitynotifytypeField("NOTIFY_TYPE");
/**
    * Параметр уведомления
    */
public static final Field<Activity, Integer> NOTIFY_VALUE = new Field<>("NOTIFY_VALUE", INTEGER_DESERIALIZER);
/**
    * Описание
    */
public static final StringField<Activity> DESCRIPTION = new StringField<>("DESCRIPTION");
/**
    * Тип описания
    */
public static final ContenttypeField DESCRIPTION_TYPE = new ContenttypeField("DESCRIPTION_TYPE");
/**
    * Направление
    */
public static final ActivitydirectionField DIRECTION = new ActivitydirectionField("DIRECTION");
/**
    * Место
    */
public static final StringField<Activity> LOCATION = new StringField<>("LOCATION");
/**
    * Дата создания
    */
public static final DateField<Activity, OffsetDateTime> CREATED = new DateField<>("CREATED", DateField.DateLevel.OFFSET_DATE_TIME_LEVEL);
/**
    * Создал
    */
public static final UserField<Activity> AUTHOR_ID = new UserField<>("AUTHOR_ID");
/**
    * Дата изменения
    */
public static final DateField<Activity, OffsetDateTime> LAST_UPDATED = new DateField<>("LAST_UPDATED", DateField.DateLevel.OFFSET_DATE_TIME_LEVEL);
/**
    * Изменил
    */
public static final UserField<Activity> EDITOR_ID = new UserField<>("EDITOR_ID");
/**
    * Настройки
    */
public static final JsonField<Activity> SETTINGS = new JsonField<>("SETTINGS");
/**
    * Внешний код
    */
public static final StringField<Activity> ORIGIN_ID = new StringField<>("ORIGIN_ID");
/**
    * Внешний источник
    */
public static final StringField<Activity> ORIGINATOR_ID = new StringField<>("ORIGINATOR_ID");
/**
    * RESULT_STATUS
    */
public static final Field<Activity, Integer> RESULT_STATUS = new Field<>("RESULT_STATUS", INTEGER_DESERIALIZER);
/**
    * RESULT_STREAM
    */
public static final Field<Activity, Integer> RESULT_STREAM = new Field<>("RESULT_STREAM", INTEGER_DESERIALIZER);
/**
    * RESULT_SOURCE_ID
    */
public static final StringField<Activity> RESULT_SOURCE_ID = new StringField<>("RESULT_SOURCE_ID");
/**
    * Параметры провайдера
    */
public static final JsonField<Activity> PROVIDER_PARAMS = new JsonField<>("PROVIDER_PARAMS");
/**
    * Данные провайдера
    */
public static final StringField<Activity> PROVIDER_DATA = new StringField<>("PROVIDER_DATA");
/**
    * RESULT_MARK
    */
public static final Field<Activity, Integer> RESULT_MARK = new Field<>("RESULT_MARK", INTEGER_DESERIALIZER);
/**
    * RESULT_VALUE
    */
public static final Field<Activity, Double> RESULT_VALUE = new Field<>("RESULT_VALUE", DOUBLE_DESERIALIZER);
/**
    * RESULT_SUM
    */
public static final Field<Activity, Double> RESULT_SUM = new Field<>("RESULT_SUM", DOUBLE_DESERIALIZER);
/**
    * RESULT_CURRENCY_ID
    */
public static final StringField<Activity> RESULT_CURRENCY_ID = new StringField<>("RESULT_CURRENCY_ID");
/**
    * Автозаполнение
    */
public static final Field<Activity, Integer> AUTOCOMPLETE_RULE = new Field<>("AUTOCOMPLETE_RULE", INTEGER_DESERIALIZER);
/**
    * Канал коммуникации
    */
public static final ActivityCommunicationField<Activity> COMMUNICATIONS = new ActivityCommunicationField<>("COMMUNICATIONS");
/**
    * IS_INCOMING_CHANNEL
    */
public static final YNField<Activity> IS_INCOMING_CHANNEL = new YNField<>("IS_INCOMING_CHANNEL");
}
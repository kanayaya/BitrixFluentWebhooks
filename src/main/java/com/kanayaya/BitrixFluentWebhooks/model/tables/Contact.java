package com.kanayaya.BitrixFluentWebhooks.model.tables;

import com.kanayaya.BitrixFluentWebhooks.model.Field;
import com.kanayaya.BitrixFluentWebhooks.model.Table;
import com.kanayaya.BitrixFluentWebhooks.model.bitrixTypes.*;
import com.kanayaya.BitrixFluentWebhooks.model.bitrixTypes.entities.UserField;
import com.kanayaya.BitrixFluentWebhooks.model.bitrixTypes.enums.CountryField;
import com.kanayaya.BitrixFluentWebhooks.model.bitrixTypes.enums.YNField;

import java.time.OffsetDateTime;

import static com.kanayaya.BitrixFluentWebhooks.model.bitrixTypes.SerializerUtils.*;

public class Contact extends Table {
    /**
    * ID
    */
public static final Field<Contact, Integer> ID = new Field<>("ID", INTEGER_DESERIALIZER);
/**
    * Имя
    */
public static final StringField<Contact> NAME = new StringField<>("NAME");
/**
    * Отчество
    */
public static final StringField<Contact> SECOND_NAME = new StringField<>("SECOND_NAME");
/**
    * Фамилия
    */
public static final StringField<Contact> LAST_NAME = new StringField<>("LAST_NAME");
/**
    * Дата рождения
    */
public static final DateField<Contact, OffsetDateTime> BIRTHDATE = new DateField<>("BIRTHDATE", DateField.DateLevel.OFFSET_DATE_TIME_LEVEL);
/**
    * Дополнительно об источнике
    */
public static final StringField<Contact> SOURCE_DESCRIPTION = new StringField<>("SOURCE_DESCRIPTION");
/**
    * Должность
    */
public static final StringField<Contact> POST = new StringField<>("POST");
/**
    * Адрес
    */
public static final StringField<Contact> ADDRESS = new StringField<>("ADDRESS");
/**
    * Адрес (стр. 2)
    */
public static final StringField<Contact> ADDRESS_2 = new StringField<>("ADDRESS_2");
/**
    * Город
    */
public static final StringField<Contact> ADDRESS_CITY = new StringField<>("ADDRESS_CITY");
/**
    * Почтовый индекс
    */
public static final StringField<Contact> ADDRESS_POSTAL_CODE = new StringField<>("ADDRESS_POSTAL_CODE");
/**
    * Район
    */
public static final StringField<Contact> ADDRESS_REGION = new StringField<>("ADDRESS_REGION");
/**
    * Область
    */
public static final StringField<Contact> ADDRESS_PROVINCE = new StringField<>("ADDRESS_PROVINCE");
/**
    * Страна
    */
public static final StringField<Contact> ADDRESS_COUNTRY = new StringField<>("ADDRESS_COUNTRY");
/**
    * Код страны
    */
public static final StringField<Contact> ADDRESS_COUNTRY_CODE = new StringField<>("ADDRESS_COUNTRY_CODE");
/**
    * Идентификатор адреса местоположения
    */
public static final Field<Contact, Integer> ADDRESS_LOC_ADDR_ID = new Field<>("ADDRESS_LOC_ADDR_ID", INTEGER_DESERIALIZER);
/**
    * Комментарий
    */
public static final StringField<Contact> COMMENTS = new StringField<>("COMMENTS");
/**
    * Доступен для всех
    */
public static final YNField<Contact> OPENED = new YNField<>("OPENED");
/**
    * Участвует в экспорте контактов
    */
public static final YNField<Contact> EXPORT = new YNField<>("EXPORT");
/**
    * Задан телефон
    */
public static final YNField<Contact> HAS_PHONE = new YNField<>("HAS_PHONE");
/**
    * Задан e-mail
    */
public static final YNField<Contact> HAS_EMAIL = new YNField<>("HAS_EMAIL");
/**
    * Задана открытая линия
    */
public static final YNField<Contact> HAS_IMOL = new YNField<>("HAS_IMOL");
/**
    * Ответственный
    */
public static final UserField<Contact> ASSIGNED_BY_ID = new UserField<>("ASSIGNED_BY_ID");
/**
    * Кем создан
    */
public static final UserField<Contact> CREATED_BY_ID = new UserField<>("CREATED_BY_ID");
/**
    * Кем изменен
    */
public static final UserField<Contact> MODIFY_BY_ID = new UserField<>("MODIFY_BY_ID");
/**
    * Дата создания
    */
public static final DateField<Contact, OffsetDateTime> DATE_CREATE = new DateField<>("DATE_CREATE", DateField.DateLevel.OFFSET_DATE_TIME_LEVEL);
/**
    * Дата изменения
    */
public static final DateField<Contact, OffsetDateTime> DATE_MODIFY = new DateField<>("DATE_MODIFY", DateField.DateLevel.OFFSET_DATE_TIME_LEVEL);
/**
    * Внешний источник
    */
public static final StringField<Contact> ORIGINATOR_ID = new StringField<>("ORIGINATOR_ID");
/**
    * Идентификатор элемента во внешнем источнике
    */
public static final StringField<Contact> ORIGIN_ID = new StringField<>("ORIGIN_ID");
/**
    * Версия оригинала
    */
public static final StringField<Contact> ORIGIN_VERSION = new StringField<>("ORIGIN_VERSION");
/**
    * Привязка к лицам из модуля faceid
    */
public static final Field<Contact, Integer> FACE_ID = new Field<>("FACE_ID", INTEGER_DESERIALIZER);
/**
    * Рекламная система
    */
public static final StringField<Contact> UTM_SOURCE = new StringField<>("UTM_SOURCE");
/**
    * Тип трафика
    */
public static final StringField<Contact> UTM_MEDIUM = new StringField<>("UTM_MEDIUM");
/**
    * Обозначение рекламной кампании
    */
public static final StringField<Contact> UTM_CAMPAIGN = new StringField<>("UTM_CAMPAIGN");
/**
    * Содержание кампании
    */
public static final StringField<Contact> UTM_CONTENT = new StringField<>("UTM_CONTENT");
/**
    * Условие поиска кампании
    */
public static final StringField<Contact> UTM_TERM = new StringField<>("UTM_TERM");
/**
    * Последняя активность
    */
public static final DateField<Contact, OffsetDateTime> LAST_ACTIVITY_TIME = new DateField<>("LAST_ACTIVITY_TIME", DateField.DateLevel.OFFSET_DATE_TIME_LEVEL);
/**
    * Кем осуществлена последняя активность в таймлайне
    */
public static final UserField<Contact> LAST_ACTIVITY_BY = new UserField<>("LAST_ACTIVITY_BY");
}
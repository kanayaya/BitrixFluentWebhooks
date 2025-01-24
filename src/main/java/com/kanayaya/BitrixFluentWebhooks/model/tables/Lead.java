package com.kanayaya.BitrixFluentWebhooks.model.tables;

import com.kanayaya.BitrixFluentWebhooks.model.Field;
import com.kanayaya.BitrixFluentWebhooks.model.Table;
import com.kanayaya.BitrixFluentWebhooks.model.bitrixTypes.*;
import com.kanayaya.BitrixFluentWebhooks.model.bitrixTypes.entities.UserField;
import com.kanayaya.BitrixFluentWebhooks.model.bitrixTypes.enums.CountryField;
import com.kanayaya.BitrixFluentWebhooks.model.bitrixTypes.enums.YNField;

import java.time.OffsetDateTime;

import static com.kanayaya.BitrixFluentWebhooks.model.bitrixTypes.SerializerUtils.*;

public class Lead extends Table {
    /**
    * ID
    */
public static final Field<Lead, Integer> ID = new Field<>("ID", INTEGER_DESERIALIZER);
/**
    * Название лида
    */
public static final StringField<Lead> TITLE = new StringField<>("TITLE");
/**
    * Имя
    */
public static final StringField<Lead> NAME = new StringField<>("NAME");
/**
    * Отчество
    */
public static final StringField<Lead> SECOND_NAME = new StringField<>("SECOND_NAME");
/**
    * Фамилия
    */
public static final StringField<Lead> LAST_NAME = new StringField<>("LAST_NAME");
/**
    * Дата рождения
    */
public static final DateField<Lead, OffsetDateTime> BIRTHDATE = new DateField<>("BIRTHDATE", DateField.DateLevel.OFFSET_DATE_TIME_LEVEL);
/**
    * Название компании
    */
public static final StringField<Lead> COMPANY_TITLE = new StringField<>("COMPANY_TITLE");
/**
    * Дополнительно об источнике
    */
public static final StringField<Lead> SOURCE_DESCRIPTION = new StringField<>("SOURCE_DESCRIPTION");
/**
    * Дополнительно о стадии
    */
public static final StringField<Lead> STATUS_DESCRIPTION = new StringField<>("STATUS_DESCRIPTION");
/**
    * Состояние статуса
    */
public static final StringField<Lead> STATUS_SEMANTIC_ID = new StringField<>("STATUS_SEMANTIC_ID");
/**
    * Должность
    */
public static final StringField<Lead> POST = new StringField<>("POST");
/**
    * Адрес
    */
public static final StringField<Lead> ADDRESS = new StringField<>("ADDRESS");
/**
    * Адрес (стр. 2)
    */
public static final StringField<Lead> ADDRESS_2 = new StringField<>("ADDRESS_2");
/**
    * Город
    */
public static final StringField<Lead> ADDRESS_CITY = new StringField<>("ADDRESS_CITY");
/**
    * Почтовый индекс
    */
public static final StringField<Lead> ADDRESS_POSTAL_CODE = new StringField<>("ADDRESS_POSTAL_CODE");
/**
    * Район
    */
public static final StringField<Lead> ADDRESS_REGION = new StringField<>("ADDRESS_REGION");
/**
    * Область
    */
public static final StringField<Lead> ADDRESS_PROVINCE = new StringField<>("ADDRESS_PROVINCE");
/**
    * Страна
    */
public static final StringField<Lead> ADDRESS_COUNTRY = new StringField<>("ADDRESS_COUNTRY");
/**
    * Код страны
    */
public static final StringField<Lead> ADDRESS_COUNTRY_CODE = new StringField<>("ADDRESS_COUNTRY_CODE");
/**
    * Идентификатор адреса местоположения
    */
public static final Field<Lead, Integer> ADDRESS_LOC_ADDR_ID = new Field<>("ADDRESS_LOC_ADDR_ID", INTEGER_DESERIALIZER);
/**
    * Сумма
    */
public static final Field<Lead, Double> OPPORTUNITY = new Field<>("OPPORTUNITY", DOUBLE_DESERIALIZER);
/**
    * IS_MANUAL_OPPORTUNITY
    */
public static final YNField<Lead> IS_MANUAL_OPPORTUNITY = new YNField<>("IS_MANUAL_OPPORTUNITY");
/**
    * Доступен для всех
    */
public static final YNField<Lead> OPENED = new YNField<>("OPENED");
/**
    * Комментарий
    */
public static final StringField<Lead> COMMENTS = new StringField<>("COMMENTS");
/**
    * Задан телефон
    */
public static final YNField<Lead> HAS_PHONE = new YNField<>("HAS_PHONE");
/**
    * Задан e-mail
    */
public static final YNField<Lead> HAS_EMAIL = new YNField<>("HAS_EMAIL");
/**
    * Задана открытая линия
    */
public static final YNField<Lead> HAS_IMOL = new YNField<>("HAS_IMOL");
/**
    * Ответственный
    */
public static final UserField<Lead> ASSIGNED_BY_ID = new UserField<>("ASSIGNED_BY_ID");
/**
    * Кем создан
    */
public static final UserField<Lead> CREATED_BY_ID = new UserField<>("CREATED_BY_ID");
/**
    * Кем изменен
    */
public static final UserField<Lead> MODIFY_BY_ID = new UserField<>("MODIFY_BY_ID");
/**
    * MOVED_BY_ID
    */
public static final UserField<Lead> MOVED_BY_ID = new UserField<>("MOVED_BY_ID");
/**
    * Дата создания
    */
public static final DateField<Lead, OffsetDateTime> DATE_CREATE = new DateField<>("DATE_CREATE", DateField.DateLevel.OFFSET_DATE_TIME_LEVEL);
/**
    * Дата изменения
    */
public static final DateField<Lead, OffsetDateTime> DATE_MODIFY = new DateField<>("DATE_MODIFY", DateField.DateLevel.OFFSET_DATE_TIME_LEVEL);
/**
    * MOVED_TIME
    */
public static final DateField<Lead, OffsetDateTime> MOVED_TIME = new DateField<>("MOVED_TIME", DateField.DateLevel.OFFSET_DATE_TIME_LEVEL);
/**
    * Повторный лид
    */
public static final YNField<Lead> IS_RETURN_CUSTOMER = new YNField<>("IS_RETURN_CUSTOMER");
/**
    * Дата завершения
    */
public static final DateField<Lead, OffsetDateTime> DATE_CLOSED = new DateField<>("DATE_CLOSED", DateField.DateLevel.OFFSET_DATE_TIME_LEVEL);
/**
    * Внешний источник
    */
public static final StringField<Lead> ORIGINATOR_ID = new StringField<>("ORIGINATOR_ID");
/**
    * Идентификатор элемента во внешнем источнике
    */
public static final StringField<Lead> ORIGIN_ID = new StringField<>("ORIGIN_ID");
/**
    * Рекламная система
    */
public static final StringField<Lead> UTM_SOURCE = new StringField<>("UTM_SOURCE");
/**
    * Тип трафика
    */
public static final StringField<Lead> UTM_MEDIUM = new StringField<>("UTM_MEDIUM");
/**
    * Обозначение рекламной кампании
    */
public static final StringField<Lead> UTM_CAMPAIGN = new StringField<>("UTM_CAMPAIGN");
/**
    * Содержание кампании
    */
public static final StringField<Lead> UTM_CONTENT = new StringField<>("UTM_CONTENT");
/**
    * Условие поиска кампании
    */
public static final StringField<Lead> UTM_TERM = new StringField<>("UTM_TERM");
/**
    * LAST_ACTIVITY_TIME
    */
public static final DateField<Lead, OffsetDateTime> LAST_ACTIVITY_TIME = new DateField<>("LAST_ACTIVITY_TIME", DateField.DateLevel.OFFSET_DATE_TIME_LEVEL);
/**
    * LAST_ACTIVITY_BY
    */
public static final UserField<Lead> LAST_ACTIVITY_BY = new UserField<>("LAST_ACTIVITY_BY");
}
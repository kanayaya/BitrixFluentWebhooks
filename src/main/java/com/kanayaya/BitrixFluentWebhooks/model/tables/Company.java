package com.kanayaya.BitrixFluentWebhooks.model.tables;

import com.kanayaya.BitrixFluentWebhooks.model.Field;
import com.kanayaya.BitrixFluentWebhooks.model.Table;
import com.kanayaya.BitrixFluentWebhooks.model.bitrixTypes.*;
import com.kanayaya.BitrixFluentWebhooks.model.bitrixTypes.enums.CountryField;
import com.kanayaya.BitrixFluentWebhooks.model.bitrixTypes.enums.YNField;
import com.kanayaya.BitrixFluentWebhooks.model.bitrixTypes.entities.*;

import java.time.OffsetDateTime;

import static com.kanayaya.BitrixFluentWebhooks.model.bitrixTypes.SerializerUtils.*;

public class Company extends Table {
/**
    * ID
    */
public static final Field<Company, Integer> ID = new Field<>("ID", INTEGER_DESERIALIZER);
/**
    * Название компании
    */
public static final StringField<Company> TITLE = new StringField<>("TITLE");
/**
    * Тип компании
    */
public static final StatusField<Company> COMPANY_TYPE = new StatusField<>("COMPANY_TYPE");
/**
    * Фактический адрес
    */
public static final StringField<Company> ADDRESS = new StringField<>("ADDRESS");
/**
    * Адрес (стр. 2)
    */
public static final StringField<Company> ADDRESS_2 = new StringField<>("ADDRESS_2");
/**
    * Город
    */
public static final StringField<Company> ADDRESS_CITY = new StringField<>("ADDRESS_CITY");
/**
    * Почтовый индекс
    */
public static final StringField<Company> ADDRESS_POSTAL_CODE = new StringField<>("ADDRESS_POSTAL_CODE");
/**
    * Район
    */
public static final StringField<Company> ADDRESS_REGION = new StringField<>("ADDRESS_REGION");
/**
    * Область
    */
public static final StringField<Company> ADDRESS_PROVINCE = new StringField<>("ADDRESS_PROVINCE");
/**
    * Страна
    */
public static final StringField<Company> ADDRESS_COUNTRY = new StringField<>("ADDRESS_COUNTRY");
/**
    * Код страны
    */
public static final StringField<Company> ADDRESS_COUNTRY_CODE = new StringField<>("ADDRESS_COUNTRY_CODE");
/**
    * Идентификатор адреса местоположения
    */
public static final Field<Company, Integer> ADDRESS_LOC_ADDR_ID = new Field<>("ADDRESS_LOC_ADDR_ID", INTEGER_DESERIALIZER);
/**
    * Юридический адрес
    */
public static final StringField<Company> ADDRESS_LEGAL = new StringField<>("ADDRESS_LEGAL");
/**
    * Юридический адрес
    */
public static final StringField<Company> REG_ADDRESS = new StringField<>("REG_ADDRESS");
/**
    * Юридический адрес (стр. 2)
    */
public static final StringField<Company> REG_ADDRESS_2 = new StringField<>("REG_ADDRESS_2");
/**
    * Юридический адрес город
    */
public static final StringField<Company> REG_ADDRESS_CITY = new StringField<>("REG_ADDRESS_CITY");
/**
    * Юридический адрес почтовый индекс 
    */
public static final StringField<Company> REG_ADDRESS_POSTAL_CODE = new StringField<>("REG_ADDRESS_POSTAL_CODE");
/**
    * Юридический адрес район
    */
public static final StringField<Company> REG_ADDRESS_REGION = new StringField<>("REG_ADDRESS_REGION");
/**
    * Юридический адрес область
    */
public static final StringField<Company> REG_ADDRESS_PROVINCE = new StringField<>("REG_ADDRESS_PROVINCE");
/**
    * Юридический адрес страна
    */
public static final StringField<Company> REG_ADDRESS_COUNTRY = new StringField<>("REG_ADDRESS_COUNTRY");
/**
    * Юридический адрес код страны
    */
public static final StringField<Company> REG_ADDRESS_COUNTRY_CODE = new StringField<>("REG_ADDRESS_COUNTRY_CODE");
/**
    * Юридический адрес идентификатор адреса местоположения
    */
public static final Field<Company, Integer> REG_ADDRESS_LOC_ADDR_ID = new Field<>("REG_ADDRESS_LOC_ADDR_ID", INTEGER_DESERIALIZER);
/**
    * Банковские реквизиты
    */
public static final StringField<Company> BANKING_DETAILS = new StringField<>("BANKING_DETAILS");
/**
    * Сфера деятельности
    */
public static final StatusField<Company> INDUSTRY = new StatusField<>("INDUSTRY");
/**
    * Кол-во сотрудников
    */
public static final StatusField<Company> EMPLOYEES = new StatusField<>("EMPLOYEES");
/**
    * Годовой оборот
    */
public static final Field<Company, Double> REVENUE = new Field<>("REVENUE", DOUBLE_DESERIALIZER);
/**
    * Доступна для всех
    */
public static final YNField<Company> OPENED = new YNField<>("OPENED");
/**
    * Комментарий
    */
public static final StringField<Company> COMMENTS = new StringField<>("COMMENTS");
/**
    * Задан телефон
    */
public static final YNField<Company> HAS_PHONE = new YNField<>("HAS_PHONE");
/**
    * Задан e-mail
    */
public static final YNField<Company> HAS_EMAIL = new YNField<>("HAS_EMAIL");
/**
    * Задана открытая линия
    */
public static final YNField<Company> HAS_IMOL = new YNField<>("HAS_IMOL");
/**
    * Моя компания
    */
public static final YNField<Company> IS_MY_COMPANY = new YNField<>("IS_MY_COMPANY");
/**
    * Ответственный
    */
public static final UserField<Company> ASSIGNED_BY_ID = new UserField<>("ASSIGNED_BY_ID");
/**
    * Кем создана
    */
public static final UserField<Company> CREATED_BY_ID = new UserField<>("CREATED_BY_ID");
/**
    * Кем изменена
    */
public static final UserField<Company> MODIFY_BY_ID = new UserField<>("MODIFY_BY_ID");
/**
    * Дата создания
    */
public static final DateField<Company, OffsetDateTime> DATE_CREATE = new DateField<>("DATE_CREATE", DateField.DateLevel.OFFSET_DATE_TIME_LEVEL);
/**
    * Дата изменения
    */
public static final DateField<Company, OffsetDateTime> DATE_MODIFY = new DateField<>("DATE_MODIFY", DateField.DateLevel.OFFSET_DATE_TIME_LEVEL);
/**
    * Контакт
    */
public static final ContactField<Company> CONTACT_ID = new ContactField<>("CONTACT_ID");
/**
    * Лид
    */
public static final LeadField<Company> LEAD_ID = new LeadField<>("LEAD_ID");
/**
    * Внешний источник
    */
public static final StringField<Company> ORIGINATOR_ID = new StringField<>("ORIGINATOR_ID");
/**
    * Идентификатор элемента во внешнем источнике
    */
public static final StringField<Company> ORIGIN_ID = new StringField<>("ORIGIN_ID");
/**
    * Версия оригинала
    */
public static final StringField<Company> ORIGIN_VERSION = new StringField<>("ORIGIN_VERSION");
/**
    * Рекламная система
    */
public static final StringField<Company> UTM_SOURCE = new StringField<>("UTM_SOURCE");
/**
    * Тип трафика
    */
public static final StringField<Company> UTM_MEDIUM = new StringField<>("UTM_MEDIUM");
/**
    * Обозначение рекламной кампании
    */
public static final StringField<Company> UTM_CAMPAIGN = new StringField<>("UTM_CAMPAIGN");
/**
    * Содержание кампании
    */
public static final StringField<Company> UTM_CONTENT = new StringField<>("UTM_CONTENT");
/**
    * Условие поиска кампании
    */
public static final StringField<Company> UTM_TERM = new StringField<>("UTM_TERM");
/**
    * Последняя активность
    */
public static final DateField<Company, OffsetDateTime> LAST_ACTIVITY_TIME = new DateField<>("LAST_ACTIVITY_TIME", DateField.DateLevel.OFFSET_DATE_TIME_LEVEL);
/**
    * Кем осуществлена последняя активность в таймлайне
    */
public static final UserField<Company> LAST_ACTIVITY_BY = new UserField<>("LAST_ACTIVITY_BY");
}
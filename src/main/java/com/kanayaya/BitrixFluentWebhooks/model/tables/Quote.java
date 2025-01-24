package com.kanayaya.BitrixFluentWebhooks.model.tables;

import com.kanayaya.BitrixFluentWebhooks.model.Field;
import com.kanayaya.BitrixFluentWebhooks.model.Table;
import com.kanayaya.BitrixFluentWebhooks.model.bitrixTypes.*;
import com.kanayaya.BitrixFluentWebhooks.model.bitrixTypes.enums.CountryField;
import com.kanayaya.BitrixFluentWebhooks.model.bitrixTypes.enums.YNField;
import com.kanayaya.BitrixFluentWebhooks.model.bitrixTypes.entities.*;

import java.time.OffsetDateTime;

import static com.kanayaya.BitrixFluentWebhooks.model.bitrixTypes.SerializerUtils.*;

public class Quote extends Table {
/**
    * ID
    */
public static final Field<Quote, Integer> ID = new Field<>("ID", INTEGER_DESERIALIZER);
/**
    * № предложения
    */
public static final StringField<Quote> QUOTE_NUMBER = new StringField<>("QUOTE_NUMBER");
/**
    * Тема
    */
public static final StringField<Quote> TITLE = new StringField<>("TITLE");
/**
    * Стадия предложения
    */
public static final StatusField<Quote> STATUS_ID = new StatusField<>("STATUS_ID");
/**
    * Сумма
    */
public static final Field<Quote, Double> OPPORTUNITY = new Field<>("OPPORTUNITY", DOUBLE_DESERIALIZER);
/**
    * Ставка налога
    */
public static final Field<Quote, Double> TAX_VALUE = new Field<>("TAX_VALUE", DOUBLE_DESERIALIZER);
/**
    * Компания
    */
public static final CompanyField<Quote> COMPANY_ID = new CompanyField<>("COMPANY_ID");
/**
    * Реквизиты вашей компании
    */
public static final CompanyField<Quote> MYCOMPANY_ID = new CompanyField<>("MYCOMPANY_ID");
/**
    * Контакт
    */
public static final ContactField<Quote> CONTACT_ID = new ContactField<>("CONTACT_ID");
/**
    * CONTACT_IDS
    */
public static final ContactField<Quote> CONTACT_IDS = new ContactField<>("CONTACT_IDS");
/**
    * Дата выставления
    */
public static final DateField<Quote, OffsetDateTime> BEGINDATE = new DateField<>("BEGINDATE", DateField.DateLevel.OFFSET_DATE_TIME_LEVEL);
/**
    * Срок
    */
public static final DateField<Quote, OffsetDateTime> CLOSEDATE = new DateField<>("CLOSEDATE", DateField.DateLevel.OFFSET_DATE_TIME_LEVEL);
/**
    * ACTUAL_DATE
    */
public static final DateField<Quote, OffsetDateTime> ACTUAL_DATE = new DateField<>("ACTUAL_DATE", DateField.DateLevel.OFFSET_DATE_TIME_LEVEL);
/**
    * Доступно для всех
    */
public static final YNField<Quote> OPENED = new YNField<>("OPENED");
/**
    * Закрыто
    */
public static final YNField<Quote> CLOSED = new YNField<>("CLOSED");
/**
    * Комментарий
    */
public static final StringField<Quote> COMMENTS = new StringField<>("COMMENTS");
/**
    * Содержание
    */
public static final StringField<Quote> CONTENT = new StringField<>("CONTENT");
/**
    * Условия
    */
public static final StringField<Quote> TERMS = new StringField<>("TERMS");
/**
    * Клиент
    */
public static final StringField<Quote> CLIENT_TITLE = new StringField<>("CLIENT_TITLE");
/**
    * Адрес
    */
public static final StringField<Quote> CLIENT_ADDR = new StringField<>("CLIENT_ADDR");
/**
    * Контактное лицо
    */
public static final StringField<Quote> CLIENT_CONTACT = new StringField<>("CLIENT_CONTACT");
/**
    * E-mail
    */
public static final StringField<Quote> CLIENT_EMAIL = new StringField<>("CLIENT_EMAIL");
/**
    * Телефон
    */
public static final StringField<Quote> CLIENT_PHONE = new StringField<>("CLIENT_PHONE");
/**
    * ИНН
    */
public static final StringField<Quote> CLIENT_TP_ID = new StringField<>("CLIENT_TP_ID");
/**
    * КПП
    */
public static final StringField<Quote> CLIENT_TPA_ID = new StringField<>("CLIENT_TPA_ID");
/**
    * Ответственный
    */
public static final UserField<Quote> ASSIGNED_BY_ID = new UserField<>("ASSIGNED_BY_ID");
/**
    * Кем создан
    */
public static final UserField<Quote> CREATED_BY_ID = new UserField<>("CREATED_BY_ID");
/**
    * Кем изменён
    */
public static final UserField<Quote> MODIFY_BY_ID = new UserField<>("MODIFY_BY_ID");
/**
    * Дата создания
    */
public static final DateField<Quote, OffsetDateTime> DATE_CREATE = new DateField<>("DATE_CREATE", DateField.DateLevel.OFFSET_DATE_TIME_LEVEL);
/**
    * Дата изменения
    */
public static final DateField<Quote, OffsetDateTime> DATE_MODIFY = new DateField<>("DATE_MODIFY", DateField.DateLevel.OFFSET_DATE_TIME_LEVEL);
/**
    * Лид
    */
public static final LeadField<Quote> LEAD_ID = new LeadField<>("LEAD_ID");
/**
    * Сделка
    */
public static final DealField<Quote> DEAL_ID = new DealField<>("DEAL_ID");
/**
    * Тип клиента
    */
public static final Field<Quote, Integer> PERSON_TYPE_ID = new Field<>("PERSON_TYPE_ID", INTEGER_DESERIALIZER);
/**
    * Рекламная система
    */
public static final StringField<Quote> UTM_SOURCE = new StringField<>("UTM_SOURCE");
/**
    * Тип трафика
    */
public static final StringField<Quote> UTM_MEDIUM = new StringField<>("UTM_MEDIUM");
/**
    * Обозначение рекламной кампании
    */
public static final StringField<Quote> UTM_CAMPAIGN = new StringField<>("UTM_CAMPAIGN");
/**
    * Содержание кампании
    */
public static final StringField<Quote> UTM_CONTENT = new StringField<>("UTM_CONTENT");
/**
    * Условие поиска кампании
    */
public static final StringField<Quote> UTM_TERM = new StringField<>("UTM_TERM");
/**
    * LAST_ACTIVITY_TIME
    */
public static final DateField<Quote, OffsetDateTime> LAST_ACTIVITY_TIME = new DateField<>("LAST_ACTIVITY_TIME", DateField.DateLevel.OFFSET_DATE_TIME_LEVEL);
/**
    * LAST_ACTIVITY_BY
    */
public static final UserField<Quote> LAST_ACTIVITY_BY = new UserField<>("LAST_ACTIVITY_BY");
}
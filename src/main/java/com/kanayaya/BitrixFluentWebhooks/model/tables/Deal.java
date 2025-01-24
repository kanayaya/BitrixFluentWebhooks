package com.kanayaya.BitrixFluentWebhooks.model.tables;

import com.kanayaya.BitrixFluentWebhooks.model.Field;
import com.kanayaya.BitrixFluentWebhooks.model.Table;
import com.kanayaya.BitrixFluentWebhooks.model.bitrixTypes.*;
import com.kanayaya.BitrixFluentWebhooks.model.bitrixTypes.enums.CountryField;
import com.kanayaya.BitrixFluentWebhooks.model.bitrixTypes.enums.YNField;
import com.kanayaya.BitrixFluentWebhooks.model.bitrixTypes.entities.*;

import java.time.OffsetDateTime;

import static com.kanayaya.BitrixFluentWebhooks.model.bitrixTypes.SerializerUtils.*;

public class Deal extends Table {
/**
    * ID
    */
public static final Field<Deal, Integer> ID = new Field<>("ID", INTEGER_DESERIALIZER);
/**
    * Название
    */
public static final StringField<Deal> TITLE = new StringField<>("TITLE");
/**
    * Тип
    */
public static final StatusField<Deal> TYPE_ID = new StatusField<>("TYPE_ID");
/**
    * Стадия сделки
    */
public static final StatusField<Deal> STAGE_ID = new StatusField<>("STAGE_ID");
/**
    * Группа стадии
    */
public static final StringField<Deal> STAGE_SEMANTIC_ID = new StringField<>("STAGE_SEMANTIC_ID");
/**
    * Новая сделка
    */
public static final YNField<Deal> IS_NEW = new YNField<>("IS_NEW");
/**
    * Регулярная сделка
    */
public static final YNField<Deal> IS_RECURRING = new YNField<>("IS_RECURRING");
/**
    * Повторная сделка
    */
public static final YNField<Deal> IS_RETURN_CUSTOMER = new YNField<>("IS_RETURN_CUSTOMER");
/**
    * Повторное обращение
    */
public static final YNField<Deal> IS_REPEATED_APPROACH = new YNField<>("IS_REPEATED_APPROACH");
/**
    * Вероятность
    */
public static final Field<Deal, Integer> PROBABILITY = new Field<>("PROBABILITY", INTEGER_DESERIALIZER);
/**
    * Сумма
    */
public static final Field<Deal, Double> OPPORTUNITY = new Field<>("OPPORTUNITY", DOUBLE_DESERIALIZER);
/**
    * IS_MANUAL_OPPORTUNITY
    */
public static final YNField<Deal> IS_MANUAL_OPPORTUNITY = new YNField<>("IS_MANUAL_OPPORTUNITY");
/**
    * Ставка налога
    */
public static final Field<Deal, Double> TAX_VALUE = new Field<>("TAX_VALUE", DOUBLE_DESERIALIZER);
/**
    * Компания
    */
public static final CompanyField<Deal> COMPANY_ID = new CompanyField<>("COMPANY_ID");
/**
    * Контакт
    */
public static final ContactField<Deal> CONTACT_ID = new ContactField<>("CONTACT_ID");
/**
    * Контакты
    */
public static final ContactField<Deal> CONTACT_IDS = new ContactField<>("CONTACT_IDS");
/**
    * Дата начала
    */
public static final DateField<Deal, OffsetDateTime> BEGINDATE = new DateField<>("BEGINDATE", DateField.DateLevel.OFFSET_DATE_TIME_LEVEL);
/**
    * Дата завершения
    */
public static final DateField<Deal, OffsetDateTime> CLOSEDATE = new DateField<>("CLOSEDATE", DateField.DateLevel.OFFSET_DATE_TIME_LEVEL);
/**
    * Доступна для всех
    */
public static final YNField<Deal> OPENED = new YNField<>("OPENED");
/**
    * Закрыта
    */
public static final YNField<Deal> CLOSED = new YNField<>("CLOSED");
/**
    * Комментарий
    */
public static final StringField<Deal> COMMENTS = new StringField<>("COMMENTS");
/**
    * Ответственный
    */
public static final UserField<Deal> ASSIGNED_BY_ID = new UserField<>("ASSIGNED_BY_ID");
/**
    * Кем создана
    */
public static final UserField<Deal> CREATED_BY_ID = new UserField<>("CREATED_BY_ID");
/**
    * Кем изменена
    */
public static final UserField<Deal> MODIFY_BY_ID = new UserField<>("MODIFY_BY_ID");
/**
    * MOVED_BY_ID
    */
public static final UserField<Deal> MOVED_BY_ID = new UserField<>("MOVED_BY_ID");
/**
    * Дата создания
    */
public static final DateField<Deal, OffsetDateTime> DATE_CREATE = new DateField<>("DATE_CREATE", DateField.DateLevel.OFFSET_DATE_TIME_LEVEL);
/**
    * Дата изменения
    */
public static final DateField<Deal, OffsetDateTime> DATE_MODIFY = new DateField<>("DATE_MODIFY", DateField.DateLevel.OFFSET_DATE_TIME_LEVEL);
/**
    * MOVED_TIME
    */
public static final DateField<Deal, OffsetDateTime> MOVED_TIME = new DateField<>("MOVED_TIME", DateField.DateLevel.OFFSET_DATE_TIME_LEVEL);
/**
    * Источник
    */
public static final StatusField<Deal> SOURCE_ID = new StatusField<>("SOURCE_ID");
/**
    * Дополнительно об источнике
    */
public static final StringField<Deal> SOURCE_DESCRIPTION = new StringField<>("SOURCE_DESCRIPTION");
/**
    * Лид
    */
public static final LeadField<Deal> LEAD_ID = new LeadField<>("LEAD_ID");
/**
    * Дополнительная информация
    */
public static final StringField<Deal> ADDITIONAL_INFO = new StringField<>("ADDITIONAL_INFO");
/**
    * Внешний источник
    */
public static final StringField<Deal> ORIGINATOR_ID = new StringField<>("ORIGINATOR_ID");
/**
    * Идентификатор элемента во внешнем источнике
    */
public static final StringField<Deal> ORIGIN_ID = new StringField<>("ORIGIN_ID");
/**
    * Рекламная система
    */
public static final StringField<Deal> UTM_SOURCE = new StringField<>("UTM_SOURCE");
/**
    * Тип трафика
    */
public static final StringField<Deal> UTM_MEDIUM = new StringField<>("UTM_MEDIUM");
/**
    * Обозначение рекламной кампании
    */
public static final StringField<Deal> UTM_CAMPAIGN = new StringField<>("UTM_CAMPAIGN");
/**
    * Содержание кампании
    */
public static final StringField<Deal> UTM_CONTENT = new StringField<>("UTM_CONTENT");
/**
    * Условие поиска кампании
    */
public static final StringField<Deal> UTM_TERM = new StringField<>("UTM_TERM");
/**
    * LAST_ACTIVITY_TIME
    */
public static final DateField<Deal, OffsetDateTime> LAST_ACTIVITY_TIME = new DateField<>("LAST_ACTIVITY_TIME", DateField.DateLevel.OFFSET_DATE_TIME_LEVEL);
/**
    * LAST_ACTIVITY_BY
    */
public static final UserField<Deal> LAST_ACTIVITY_BY = new UserField<>("LAST_ACTIVITY_BY");
}
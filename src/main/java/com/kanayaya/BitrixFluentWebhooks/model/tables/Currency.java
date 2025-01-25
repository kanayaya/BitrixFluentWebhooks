package com.kanayaya.BitrixFluentWebhooks.model.tables;

import com.kanayaya.BitrixFluentWebhooks.model.Field;
import com.kanayaya.BitrixFluentWebhooks.model.Table;
import com.kanayaya.BitrixFluentWebhooks.model.bitrixTypes.*;
import com.kanayaya.BitrixFluentWebhooks.model.bitrixTypes.enums.CountryField;
import com.kanayaya.BitrixFluentWebhooks.model.bitrixTypes.enums.YNField;
import com.kanayaya.BitrixFluentWebhooks.model.bitrixTypes.entities.*;

import java.time.OffsetDateTime;

import static com.kanayaya.BitrixFluentWebhooks.model.bitrixTypes.SerializerUtils.*;

public class Currency extends Table {
/**
    * Валюта
    */
public static final StringField<Currency> CURRENCY = new StringField<>("CURRENCY");
/**
    * Номинал
    */
public static final Field<Currency, Integer> AMOUNT_CNT = new Field<>("AMOUNT_CNT", INTEGER_DESERIALIZER);
/**
    * Курс обмена
    */
public static final Field<Currency, Double> AMOUNT = new Field<>("AMOUNT", DOUBLE_DESERIALIZER);
/**
    * Базовая валюта
    */
public static final YNField<Currency> BASE = new YNField<>("BASE");
/**
    * Сортировка
    */
public static final Field<Currency, Integer> SORT = new Field<>("SORT", INTEGER_DESERIALIZER);
/**
    * Дата изменения
    */
public static final DateField<Currency, OffsetDateTime> DATE_UPDATE = new DateField<>("DATE_UPDATE", DateField.DateLevel.OFFSET_DATE_TIME_LEVEL);
/**
    * Сайт
    */
public static final StringField<Currency> LID = new StringField<>("LID");
/**
    * Строка формата для вывода валюты
    */
public static final StringField<Currency> FORMAT_STRING = new StringField<>("FORMAT_STRING");
/**
    * Название
    */
public static final StringField<Currency> FULL_NAME = new StringField<>("FULL_NAME");
/**
    * Десятичная точка при выводе
    */
public static final StringField<Currency> DEC_POINT = new StringField<>("DEC_POINT");
/**
    * Свой разделитель тысяч при выводе
    */
public static final StringField<Currency> THOUSANDS_SEP = new StringField<>("THOUSANDS_SEP");
/**
    * Количество десятичных знаков
    */
public static final Field<Currency, Integer> DECIMALS = new Field<>("DECIMALS", INTEGER_DESERIALIZER);
}
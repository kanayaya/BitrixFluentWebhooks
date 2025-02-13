package com.kanayaya.BitrixFluentWebhooks.model.tables;

import com.kanayaya.BitrixFluentWebhooks.model.Field;
import com.kanayaya.BitrixFluentWebhooks.model.Table;
import com.kanayaya.BitrixFluentWebhooks.model.bitrixTypes.*;
import com.kanayaya.BitrixFluentWebhooks.model.bitrixTypes.enums.CountryField;
import com.kanayaya.BitrixFluentWebhooks.model.bitrixTypes.enums.YNField;
import com.kanayaya.BitrixFluentWebhooks.model.bitrixTypes.entities.*;

import java.time.OffsetDateTime;

import static com.kanayaya.BitrixFluentWebhooks.model.bitrixTypes.SerializerUtils.*;

public class Enum extends Table {
/**
    * ID
    */
public static final Field<Enum, Integer> ID = new Field<>("ID", INTEGER_DESERIALIZER);
/**
    * Название
    */
public static final StringField<Enum> NAME = new StringField<>("NAME");
/**
    * Символьный код
    */
public static final StringField<Enum> SYMBOL_CODE = new StringField<>("SYMBOL_CODE");
/**
    * Краткий символьный код
    */
public static final StringField<Enum> SYMBOL_CODE_SHORT = new StringField<>("SYMBOL_CODE_SHORT");
}
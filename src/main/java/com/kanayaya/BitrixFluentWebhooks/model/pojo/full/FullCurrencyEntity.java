package com.kanayaya.BitrixFluentWebhooks.model.pojo.full;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.kanayaya.BitrixFluentWebhooks.BitrixClient;
import com.kanayaya.BitrixFluentWebhooks.model.enums.YN;
import com.kanayaya.BitrixFluentWebhooks.model.pojo.idable.CurrencyEntity;

import java.time.OffsetDateTime;

public class FullCurrencyEntity extends CurrencyEntity {
    /**
    * Валюта
    */
    @JsonProperty("CURRENCY")
    private String currency;
    /**
    * Номинал
    */
    @JsonProperty("AMOUNT_CNT")
    private Integer amountCnt;
    /**
    * Курс обмена
    */
    @JsonProperty("AMOUNT")
    private Double amount;
    /**
    * Базовая валюта
    */
    @JsonProperty("BASE")
    private YN base;
    /**
    * Сортировка
    */
    @JsonProperty("SORT")
    private Integer sort;
    /**
    * Дата изменения
    */
    @JsonProperty("DATE_UPDATE")
    private OffsetDateTime dateUpdate;
    /**
    * Сайт
    */
    @JsonProperty("LID")
    private String lid;
    /**
    * Строка формата для вывода валюты
    */
    @JsonProperty("FORMAT_STRING")
    private String formatString;
    /**
    * Название
    */
    @JsonProperty("FULL_NAME")
    private String fullName;
    /**
    * Десятичная точка при выводе
    */
    @JsonProperty("DEC_POINT")
    private String decPoint;
    /**
    * Свой разделитель тысяч при выводе
    */
    @JsonProperty("THOUSANDS_SEP")
    private String thousandsSep;
    /**
    * Количество десятичных знаков
    */
    @JsonProperty("DECIMALS")
    private Integer decimals;

    @Override
    public FullCurrencyEntity getFull(BitrixClient client) {
        return this;
    }
}
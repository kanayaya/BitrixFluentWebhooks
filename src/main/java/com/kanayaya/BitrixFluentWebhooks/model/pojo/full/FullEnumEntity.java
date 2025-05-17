package com.kanayaya.BitrixFluentWebhooks.model.pojo.full;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.kanayaya.BitrixFluentWebhooks.BitrixRestClient;
import com.kanayaya.BitrixFluentWebhooks.model.pojo.idable.*;

public class FullEnumEntity extends EnumEntity {
    /**
    * ID
    */
    @JsonProperty("ID")
    private Integer id;
    /**
    * Название
    */
    @JsonProperty("NAME")
    private String name;
    /**
    * Символьный код
    */
    @JsonProperty("SYMBOL_CODE")
    private String symbolCode;
    /**
    * Краткий символьный код
    */
    @JsonProperty("SYMBOL_CODE_SHORT")
    private String symbolCodeShort;
}
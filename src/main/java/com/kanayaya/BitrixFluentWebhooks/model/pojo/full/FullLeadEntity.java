package com.kanayaya.BitrixFluentWebhooks.model.pojo.full;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.kanayaya.BitrixFluentWebhooks.BitrixClient;
import com.kanayaya.BitrixFluentWebhooks.model.enums.YN;
import com.kanayaya.BitrixFluentWebhooks.model.pojo.MultifieldItem;
import com.kanayaya.BitrixFluentWebhooks.model.pojo.idable.*;

import java.time.OffsetDateTime;
import java.util.List;

public class FullLeadEntity extends LeadEntity {
    /**
    * ID
    */
    @JsonProperty("ID")
    private Integer id;
    /**
    * Название лида
    */
    @JsonProperty("TITLE")
    private String title;
    /**
    * Обращение
    */
    @JsonProperty("HONORIFIC")
    private StatusEntity honorific;
    /**
    * Имя
    */
    @JsonProperty("NAME")
    private String name;
    /**
    * Отчество
    */
    @JsonProperty("SECOND_NAME")
    private String secondName;
    /**
    * Фамилия
    */
    @JsonProperty("LAST_NAME")
    private String lastName;
    /**
    * Дата рождения
    */
    @JsonProperty("BIRTHDATE")
    private OffsetDateTime birthdate;
    /**
    * Название компании
    */
    @JsonProperty("COMPANY_TITLE")
    private String companyTitle;
    /**
    * Источник
    */
    @JsonProperty("SOURCE_ID")
    private StatusEntity sourceId;
    /**
    * Дополнительно об источнике
    */
    @JsonProperty("SOURCE_DESCRIPTION")
    private String sourceDescription;
    /**
    * Стадия
    */
    @JsonProperty("STATUS_ID")
    private StatusEntity statusId;
    /**
    * Дополнительно о стадии
    */
    @JsonProperty("STATUS_DESCRIPTION")
    private String statusDescription;
    /**
    * Состояние статуса
    */
    @JsonProperty("STATUS_SEMANTIC_ID")
    private String statusSemanticId;
    /**
    * Должность
    */
    @JsonProperty("POST")
    private String post;
    /**
    * Адрес
    */
    @JsonProperty("ADDRESS")
    private String address;
    /**
    * Адрес (стр. 2)
    */
    @JsonProperty("ADDRESS_2")
    private String address2;
    /**
    * Город
    */
    @JsonProperty("ADDRESS_CITY")
    private String addressCity;
    /**
    * Почтовый индекс
    */
    @JsonProperty("ADDRESS_POSTAL_CODE")
    private String addressPostalCode;
    /**
    * Район
    */
    @JsonProperty("ADDRESS_REGION")
    private String addressRegion;
    /**
    * Область
    */
    @JsonProperty("ADDRESS_PROVINCE")
    private String addressProvince;
    /**
    * Страна
    */
    @JsonProperty("ADDRESS_COUNTRY")
    private String addressCountry;
    /**
    * Код страны
    */
    @JsonProperty("ADDRESS_COUNTRY_CODE")
    private String addressCountryCode;
    /**
    * Идентификатор адреса местоположения
    */
    @JsonProperty("ADDRESS_LOC_ADDR_ID")
    private Integer addressLocAddrId;
    /**
    * Валюта
    */
    @JsonProperty("CURRENCY_ID")
    private CurrencyEntity currencyId;
    /**
    * Сумма
    */
    @JsonProperty("OPPORTUNITY")
    private Double opportunity;
    /**
    * IS_MANUAL_OPPORTUNITY
    */
    @JsonProperty("IS_MANUAL_OPPORTUNITY")
    private YN isManualOpportunity;
    /**
    * Доступен для всех
    */
    @JsonProperty("OPENED")
    private YN opened;
    /**
    * Комментарий
    */
    @JsonProperty("COMMENTS")
    private String comments;
    /**
    * Задан телефон
    */
    @JsonProperty("HAS_PHONE")
    private YN hasPhone;
    /**
    * Задан e-mail
    */
    @JsonProperty("HAS_EMAIL")
    private YN hasEmail;
    /**
    * Задана открытая линия
    */
    @JsonProperty("HAS_IMOL")
    private YN hasImol;
    /**
    * Ответственный
    */
    @JsonProperty("ASSIGNED_BY_ID")
    private UserEntity assignedById;
    /**
    * Кем создан
    */
    @JsonProperty("CREATED_BY_ID")
    private UserEntity createdById;
    /**
    * Кем изменен
    */
    @JsonProperty("MODIFY_BY_ID")
    private UserEntity modifyById;
    /**
    * MOVED_BY_ID
    */
    @JsonProperty("MOVED_BY_ID")
    private UserEntity movedById;
    /**
    * Дата создания
    */
    @JsonProperty("DATE_CREATE")
    private OffsetDateTime dateCreate;
    /**
    * Дата изменения
    */
    @JsonProperty("DATE_MODIFY")
    private OffsetDateTime dateModify;
    /**
    * MOVED_TIME
    */
    @JsonProperty("MOVED_TIME")
    private OffsetDateTime movedTime;
    /**
    * Компания
    */
    @JsonProperty("COMPANY_ID")
    private CompanyEntity companyId;
    /**
    * Контакт
    */
    @JsonProperty("CONTACT_ID")
    private ContactEntity contactId;
    /**
    * CONTACT_IDS
    */
    @JsonProperty("CONTACT_IDS")
    private ContactEntity contactIds;
    /**
    * Повторный лид
    */
    @JsonProperty("IS_RETURN_CUSTOMER")
    private YN isReturnCustomer;
    /**
    * Дата завершения
    */
    @JsonProperty("DATE_CLOSED")
    private OffsetDateTime dateClosed;
    /**
    * Внешний источник
    */
    @JsonProperty("ORIGINATOR_ID")
    private String originatorId;
    /**
    * Идентификатор элемента во внешнем источнике
    */
    @JsonProperty("ORIGIN_ID")
    private String originId;
    /**
    * Рекламная система
    */
    @JsonProperty("UTM_SOURCE")
    private String utmSource;
    /**
    * Тип трафика
    */
    @JsonProperty("UTM_MEDIUM")
    private String utmMedium;
    /**
    * Обозначение рекламной кампании
    */
    @JsonProperty("UTM_CAMPAIGN")
    private String utmCampaign;
    /**
    * Содержание кампании
    */
    @JsonProperty("UTM_CONTENT")
    private String utmContent;
    /**
    * Условие поиска кампании
    */
    @JsonProperty("UTM_TERM")
    private String utmTerm;
    /**
    * LAST_ACTIVITY_TIME
    */
    @JsonProperty("LAST_ACTIVITY_TIME")
    private OffsetDateTime lastActivityTime;
    /**
    * LAST_ACTIVITY_BY
    */
    @JsonProperty("LAST_ACTIVITY_BY")
    private UserEntity lastActivityBy;
    /**
    * Телефон
    */
    @JsonProperty("PHONE")
    private List<MultifieldItem<String>> phone;
    /**
    * E-mail
    */
    @JsonProperty("EMAIL")
    private List<MultifieldItem<String>> email;
    /**
    * Сайт
    */
    @JsonProperty("WEB")
    private List<MultifieldItem<String>> web;
    /**
    * Мессенджер
    */
    @JsonProperty("IM")
    private List<MultifieldItem<String>> im;
    /**
    * LINK
    */
    @JsonProperty("LINK")
    private List<MultifieldItem<String>> link;
}
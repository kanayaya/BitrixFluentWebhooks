package com.kanayaya.BitrixFluentWebhooks.model.pojo.full;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.kanayaya.BitrixFluentWebhooks.BitrixClient;
import com.kanayaya.BitrixFluentWebhooks.model.enums.YN;
import com.kanayaya.BitrixFluentWebhooks.model.pojo.idable.CompanyEntity;
import com.kanayaya.BitrixFluentWebhooks.model.pojo.idable.UserEntity;

import java.time.OffsetDateTime;

public class FullCompanyEntity extends CompanyEntity implements FullEntity<FullCompanyEntity> {
    /**
    * ID
    */
    @JsonProperty("ID")
    private Integer id;
    /**
    * Название компании
    */
    @JsonProperty("TITLE")
    private String title;
    /**
    * Фактический адрес
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
    * Юридический адрес
    */
    @JsonProperty("ADDRESS_LEGAL")
    private String addressLegal;
    /**
    * Юридический адрес
    */
    @JsonProperty("REG_ADDRESS")
    private String regAddress;
    /**
    * Юридический адрес (стр. 2)
    */
    @JsonProperty("REG_ADDRESS_2")
    private String regAddress2;
    /**
    * Юридический адрес город
    */
    @JsonProperty("REG_ADDRESS_CITY")
    private String regAddressCity;
    /**
    * Юридический адрес почтовый индекс 
    */
    @JsonProperty("REG_ADDRESS_POSTAL_CODE")
    private String regAddressPostalCode;
    /**
    * Юридический адрес район
    */
    @JsonProperty("REG_ADDRESS_REGION")
    private String regAddressRegion;
    /**
    * Юридический адрес область
    */
    @JsonProperty("REG_ADDRESS_PROVINCE")
    private String regAddressProvince;
    /**
    * Юридический адрес страна
    */
    @JsonProperty("REG_ADDRESS_COUNTRY")
    private String regAddressCountry;
    /**
    * Юридический адрес код страны
    */
    @JsonProperty("REG_ADDRESS_COUNTRY_CODE")
    private String regAddressCountryCode;
    /**
    * Юридический адрес идентификатор адреса местоположения
    */
    @JsonProperty("REG_ADDRESS_LOC_ADDR_ID")
    private Integer regAddressLocAddrId;
    /**
    * Банковские реквизиты
    */
    @JsonProperty("BANKING_DETAILS")
    private String bankingDetails;
    /**
    * Годовой оборот
    */
    @JsonProperty("REVENUE")
    private Double revenue;
    /**
    * Доступна для всех
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
    * Моя компания
    */
    @JsonProperty("IS_MY_COMPANY")
    private YN isMyCompany;
    /**
    * Ответственный
    */
    @JsonProperty("ASSIGNED_BY_ID")
    private UserEntity assignedById;
    /**
    * Кем создана
    */
    @JsonProperty("CREATED_BY_ID")
    private UserEntity createdById;
    /**
    * Кем изменена
    */
    @JsonProperty("MODIFY_BY_ID")
    private UserEntity modifyById;
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
    * Версия оригинала
    */
    @JsonProperty("ORIGIN_VERSION")
    private String originVersion;
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
    * Последняя активность
    */
    @JsonProperty("LAST_ACTIVITY_TIME")
    private OffsetDateTime lastActivityTime;
    /**
    * Кем осуществлена последняя активность в таймлайне
    */
    @JsonProperty("LAST_ACTIVITY_BY")
    private UserEntity lastActivityBy;

    @Override
    public FullCompanyEntity getFull(BitrixClient client) {
        return this;
    }
}
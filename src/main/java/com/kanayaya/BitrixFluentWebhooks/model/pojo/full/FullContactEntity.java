package com.kanayaya.BitrixFluentWebhooks.model.pojo.full;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.kanayaya.BitrixFluentWebhooks.BitrixClient;
import com.kanayaya.BitrixFluentWebhooks.model.enums.YN;
import com.kanayaya.BitrixFluentWebhooks.model.pojo.idable.*;

import java.time.OffsetDateTime;

public class FullContactEntity extends ContactEntity implements FullEntity<FullContactEntity> {
    /**
    * ID
    */
    @JsonProperty("ID")
    private Integer id;
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
    * Тип контакта
    */
    @JsonProperty("TYPE_ID")
    private StatusEntity typeId;
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
    * Комментарий
    */
    @JsonProperty("COMMENTS")
    private String comments;
    /**
    * Доступен для всех
    */
    @JsonProperty("OPENED")
    private YN opened;
    /**
    * Участвует в экспорте контактов
    */
    @JsonProperty("EXPORT")
    private YN export;
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
    * Компания
    */
    @JsonProperty("COMPANY_ID")
    private CompanyEntity companyId;
    /**
    * COMPANY_IDS
    */
    @JsonProperty("COMPANY_IDS")
    private CompanyEntity companyIds;
    /**
    * Лид
    */
    @JsonProperty("LEAD_ID")
    private LeadEntity leadId;
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
    * Привязка к лицам из модуля faceid
    */
    @JsonProperty("FACE_ID")
    private Integer faceId;
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
    public FullContactEntity getFull(BitrixClient client) {
        return this;
    }
}
package com.kanayaya.BitrixFluentWebhooks.model.pojo.full;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.kanayaya.BitrixFluentWebhooks.BitrixRestClient;
import com.kanayaya.BitrixFluentWebhooks.model.enums.YN;
import com.kanayaya.BitrixFluentWebhooks.model.pojo.idable.*;

import java.time.OffsetDateTime;

public class FullQuoteEntity extends QuoteEntity {
    /**
    * ID
    */
    @JsonProperty("ID")
    private Integer id;
    /**
    * № предложения
    */
    @JsonProperty("QUOTE_NUMBER")
    private String quoteNumber;
    /**
    * Тема
    */
    @JsonProperty("TITLE")
    private String title;
    /**
    * Стадия предложения
    */
    @JsonProperty("STATUS_ID")
    private StatusEntity statusId;
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
    * Ставка налога
    */
    @JsonProperty("TAX_VALUE")
    private Double taxValue;
    /**
    * Компания
    */
    @JsonProperty("COMPANY_ID")
    private CompanyEntity companyId;
    /**
    * Реквизиты вашей компании
    */
    @JsonProperty("MYCOMPANY_ID")
    private CompanyEntity mycompanyId;
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
    * Дата выставления
    */
    @JsonProperty("BEGINDATE")
    private OffsetDateTime begindate;
    /**
    * Срок
    */
    @JsonProperty("CLOSEDATE")
    private OffsetDateTime closedate;
    /**
    * ACTUAL_DATE
    */
    @JsonProperty("ACTUAL_DATE")
    private OffsetDateTime actualDate;
    /**
    * Доступно для всех
    */
    @JsonProperty("OPENED")
    private YN opened;
    /**
    * Закрыто
    */
    @JsonProperty("CLOSED")
    private YN closed;
    /**
    * Комментарий
    */
    @JsonProperty("COMMENTS")
    private String comments;
    /**
    * Содержание
    */
    @JsonProperty("CONTENT")
    private String content;
    /**
    * Условия
    */
    @JsonProperty("TERMS")
    private String terms;
    /**
    * Клиент
    */
    @JsonProperty("CLIENT_TITLE")
    private String clientTitle;
    /**
    * Адрес
    */
    @JsonProperty("CLIENT_ADDR")
    private String clientAddr;
    /**
    * Контактное лицо
    */
    @JsonProperty("CLIENT_CONTACT")
    private String clientContact;
    /**
    * E-mail
    */
    @JsonProperty("CLIENT_EMAIL")
    private String clientEmail;
    /**
    * Телефон
    */
    @JsonProperty("CLIENT_PHONE")
    private String clientPhone;
    /**
    * ИНН
    */
    @JsonProperty("CLIENT_TP_ID")
    private String clientTpId;
    /**
    * КПП
    */
    @JsonProperty("CLIENT_TPA_ID")
    private String clientTpaId;
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
    * Кем изменён
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
    * Лид
    */
    @JsonProperty("LEAD_ID")
    private LeadEntity leadId;
    /**
    * Сделка
    */
    @JsonProperty("DEAL_ID")
    private DealEntity dealId;
    /**
    * Тип клиента
    */
    @JsonProperty("PERSON_TYPE_ID")
    private Integer personTypeId;
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

    @Override
    public FullQuoteEntity getFull(BitrixRestClient client) {
        return this;
    }
}
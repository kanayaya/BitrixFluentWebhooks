package com.kanayaya.BitrixFluentWebhooks.model.pojo.full;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.kanayaya.BitrixFluentWebhooks.BitrixClient;
import com.kanayaya.BitrixFluentWebhooks.model.enums.*;
import com.kanayaya.BitrixFluentWebhooks.model.pojo.idable.*;

import java.time.OffsetDateTime;

public class FullDealEntity extends DealEntity {
    /**
    * ID
    */
    @JsonProperty("ID")
    private Integer id;
    /**
    * Название
    */
    @JsonProperty("TITLE")
    private String title;
    /**
    * Тип
    */
    @JsonProperty("TYPE_ID")
    private StatusEntity typeId;
    /**
    * Стадия сделки
    */
    @JsonProperty("STAGE_ID")
    private StatusEntity stageId;
    /**
    * Группа стадии
    */
    @JsonProperty("STAGE_SEMANTIC_ID")
    private String stageSemanticId;
    /**
    * Новая сделка
    */
    @JsonProperty("IS_NEW")
    private YN isNew;
    /**
    * Регулярная сделка
    */
    @JsonProperty("IS_RECURRING")
    private YN isRecurring;
    /**
    * Повторная сделка
    */
    @JsonProperty("IS_RETURN_CUSTOMER")
    private YN isReturnCustomer;
    /**
    * Повторное обращение
    */
    @JsonProperty("IS_REPEATED_APPROACH")
    private YN isRepeatedApproach;
    /**
    * Вероятность
    */
    @JsonProperty("PROBABILITY")
    private Integer probability;
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
    * Контакт
    */
    @JsonProperty("CONTACT_ID")
    private ContactEntity contactId;
    /**
    * Контакты
    */
    @JsonProperty("CONTACT_IDS")
    private ContactEntity contactIds;
    /**
    * Предложение
    */
    @JsonProperty("QUOTE_ID")
    private QuoteEntity quoteId;
    /**
    * Дата начала
    */
    @JsonProperty("BEGINDATE")
    private OffsetDateTime begindate;
    /**
    * Дата завершения
    */
    @JsonProperty("CLOSEDATE")
    private OffsetDateTime closedate;
    /**
    * Доступна для всех
    */
    @JsonProperty("OPENED")
    private YN opened;
    /**
    * Закрыта
    */
    @JsonProperty("CLOSED")
    private YN closed;
    /**
    * Комментарий
    */
    @JsonProperty("COMMENTS")
    private String comments;
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
    * Лид
    */
    @JsonProperty("LEAD_ID")
    private LeadEntity leadId;
    /**
    * Дополнительная информация
    */
    @JsonProperty("ADDITIONAL_INFO")
    private String additionalInfo;
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

    @Override
    public FullDealEntity getFull(BitrixClient client) {
        return this;
    }
}
package com.kanayaya.BitrixFluentWebhooks.model.pojo.full;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.JsonNode;
import com.kanayaya.BitrixFluentWebhooks.BitrixClient;
import com.kanayaya.BitrixFluentWebhooks.model.enums.*;
import com.kanayaya.BitrixFluentWebhooks.model.pojo.BitrixFile;
import com.kanayaya.BitrixFluentWebhooks.model.pojo.idable.*;

import java.time.OffsetDateTime;

public class FullActivityEntity extends ActivityEntity implements FullEntity<FullActivityEntity> {
    /**
    * ID
    */
    @JsonProperty("ID")
    private Integer id;
    /**
    * ID владельца
    */
    @JsonProperty("OWNER_ID")
    private Integer ownerId;
    /**
    * Тип владельца
    */
    @JsonProperty("OWNER_TYPE_ID")
    private Ownertype ownerTypeId;
    /**
    * Тип
    */
    @JsonProperty("TYPE_ID")
    private Activitytype typeId;
    /**
    * ID провайдера
    */
    @JsonProperty("PROVIDER_ID")
    private String providerId;
    /**
    * Тип провайдера
    */
    @JsonProperty("PROVIDER_TYPE_ID")
    private String providerTypeId;
    /**
    * Тип коннектора
    */
    @JsonProperty("PROVIDER_GROUP_ID")
    private String providerGroupId;
    /**
    * ID связанной с делом сущности
    */
    @JsonProperty("ASSOCIATED_ENTITY_ID")
    private Integer associatedEntityId;
    /**
    * Тема
    */
    @JsonProperty("SUBJECT")
    private String subject;
    /**
    * Начало
    */
    @JsonProperty("START_TIME")
    private OffsetDateTime startTime;
    /**
    * Срок
    */
    @JsonProperty("END_TIME")
    private OffsetDateTime endTime;
    /**
    * Срок исполнения
    */
    @JsonProperty("DEADLINE")
    private OffsetDateTime deadline;
    /**
    * Выполнено
    */
    @JsonProperty("COMPLETED")
    private YN completed;
    /**
    * Статус
    */
    @JsonProperty("STATUS")
    private Activitystatus status;
    /**
    * Ответственный
    */
    @JsonProperty("RESPONSIBLE_ID")
    private UserEntity responsibleId;
    /**
    * Важность
    */
    @JsonProperty("PRIORITY")
    private Activitypriority priority;
    /**
    * Тип уведомлений
    */
    @JsonProperty("NOTIFY_TYPE")
    private Activitynotifytype notifyType;
    /**
    * Параметр уведомления
    */
    @JsonProperty("NOTIFY_VALUE")
    private Integer notifyValue;
    /**
    * Описание
    */
    @JsonProperty("DESCRIPTION")
    private String description;
    /**
    * Тип описания
    */
    @JsonProperty("DESCRIPTION_TYPE")
    private Contenttype descriptionType;
    /**
    * Направление
    */
    @JsonProperty("DIRECTION")
    private Activitydirection direction;
    /**
    * Место
    */
    @JsonProperty("LOCATION")
    private String location;
    /**
    * Дата создания
    */
    @JsonProperty("CREATED")
    private OffsetDateTime created;
    /**
    * Создал
    */
    @JsonProperty("AUTHOR_ID")
    private UserEntity authorId;
    /**
    * Дата изменения
    */
    @JsonProperty("LAST_UPDATED")
    private OffsetDateTime lastUpdated;
    /**
    * Изменил
    */
    @JsonProperty("EDITOR_ID")
    private UserEntity editorId;
    /**
    * Настройки
    */
    @JsonProperty("SETTINGS")
    private JsonNode settings;
    /**
    * Внешний код
    */
    @JsonProperty("ORIGIN_ID")
    private String originId;
    /**
    * Внешний источник
    */
    @JsonProperty("ORIGINATOR_ID")
    private String originatorId;
    /**
    * RESULT_STATUS
    */
    @JsonProperty("RESULT_STATUS")
    private Integer resultStatus;
    /**
    * RESULT_STREAM
    */
    @JsonProperty("RESULT_STREAM")
    private Integer resultStream;
    /**
    * RESULT_SOURCE_ID
    */
    @JsonProperty("RESULT_SOURCE_ID")
    private String resultSourceId;
    /**
    * Параметры провайдера
    */
    @JsonProperty("PROVIDER_PARAMS")
    private JsonNode providerParams;
    /**
    * Данные провайдера
    */
    @JsonProperty("PROVIDER_DATA")
    private String providerData;
    /**
    * RESULT_MARK
    */
    @JsonProperty("RESULT_MARK")
    private Integer resultMark;
    /**
    * RESULT_VALUE
    */
    @JsonProperty("RESULT_VALUE")
    private Double resultValue;
    /**
    * RESULT_SUM
    */
    @JsonProperty("RESULT_SUM")
    private Double resultSum;
    /**
    * RESULT_CURRENCY_ID
    */
    @JsonProperty("RESULT_CURRENCY_ID")
    private String resultCurrencyId;
    /**
    * Автозаполнение
    */
    @JsonProperty("AUTOCOMPLETE_RULE")
    private Integer autocompleteRule;
    /**
    * Канал коммуникации
    */
    @JsonProperty("COMMUNICATIONS")
    private ActivityCommunicationEntity communications;
    /**
    * Файлы
    */
    @JsonProperty("FILES")
    private BitrixFile files;
    /**
    * Добавленные файлы
    */
    @JsonProperty("WEBDAV_ELEMENTS")
    private BitrixFile webdavElements;
    /**
    * IS_INCOMING_CHANNEL
    */
    @JsonProperty("IS_INCOMING_CHANNEL")
    private YN isIncomingChannel;

    @Override
    public FullActivityEntity getFull(BitrixClient client) {
        return this;
    }
}
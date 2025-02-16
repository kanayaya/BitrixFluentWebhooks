package com.kanayaya.BitrixFluentWebhooks.model.pojo.full;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.kanayaya.BitrixFluentWebhooks.BitrixRestClient;
import com.kanayaya.BitrixFluentWebhooks.model.bitrixTypes.enums.Timeman;
import com.kanayaya.BitrixFluentWebhooks.model.enums.Country;
import com.kanayaya.BitrixFluentWebhooks.model.enums.YN;
import com.kanayaya.BitrixFluentWebhooks.model.pojo.idable.UserEntity;

import java.time.OffsetDateTime;
import java.util.List;

public class FullUserEntity extends UserEntity {
    @JsonProperty("ACTIVE")
    private boolean isActive;
    @JsonProperty("NAME")
    private String name;
    @JsonProperty("LAST_NAME")
    private String lastName;
    @JsonProperty("XML_ID")
    private String xmlId;
    @JsonProperty("SECOND_NAME")
    private String secondName;
    @JsonProperty("TITLE")
    private String title;
    @JsonProperty("EMAIL")
    private String email;
    @JsonProperty("LAST_LOGIN")
    private OffsetDateTime last_login;
    @JsonProperty("LAST_ACTIVITY_DATE")
    private OffsetDateTime lastActivityDate;
    @JsonProperty("DATE_REGISTER")
    private OffsetDateTime date_register;
    @JsonProperty("TIME_ZONE")
    private String time_zone;
    @JsonProperty("TIME_ZONE_OFFSET")
    private Integer timeZoneOffset;
    @JsonProperty("IS_ONLINE")
    private YN is_online;
    @JsonProperty("TIMESTAMP_X")
    private OffsetDateTime timestampX;
    @JsonProperty("PERSONAL_GENDER")
    private String personal_gender;
    @JsonProperty("PERSONAL_PROFESSION")
    private String personal_profession;
    @JsonProperty("PERSONAL_WWW")
    private String personal_www;
    @JsonProperty("PERSONAL_BIRTHDAY")
    private OffsetDateTime personal_birthday;
    @JsonProperty("PERSONAL_ICQ")
    private String personal_icq;
    @JsonProperty("PERSONAL_PHONE")
    private String personal_phone;
    @JsonProperty("PERSONAL_FAX")
    private String personal_fax;
    @JsonProperty("PERSONAL_MOBILE")
    private String personal_mobile;
    @JsonProperty("PERSONAL_PAGER")
    private String personal_pager;
    @JsonProperty("PERSONAL_STREET")
    private String personal_street;
    @JsonProperty("PERSONAL_CITY")
    private String personal_city;
    @JsonProperty("PERSONAL_STATE")
    private String personal_state;
    @JsonProperty("PERSONAL_ZIP")
    private String personal_zip;
    @JsonProperty("PERSONAL_COUNTRY")
    private Country personal_country;
    @JsonProperty("PERSONAL_MAILBOX")
    private String personal_mailbox;
    @JsonProperty("PERSONAL_NOTES")
    private String personal_notes;
    @JsonProperty("WORK_PHONE")
    private String work_phone;
    @JsonProperty("WORK_COMPANY")
    private String work_company;
    @JsonProperty("WORK_POSITION")
    private String work_position;
    @JsonProperty("WORK_DEPARTMENT")
    private String work_department;
    @JsonProperty("WORK_WWW")
    private String work_www;
    @JsonProperty("WORK_FAX")
    private String work_fax;
    @JsonProperty("WORK_PAGER")
    private String work_pager;
    @JsonProperty("WORK_STREET")
    private String work_street;
    @JsonProperty("WORK_MAILBOX")
    private String work_mailbox;
    @JsonProperty("WORK_CITY")
    private String work_city;
    @JsonProperty("WORK_STATE")
    private String work_state;
    @JsonProperty("WORK_ZIP")
    private String work_zip;
    @JsonProperty("WORK_COUNTRY")
    private Country work_country;
    @JsonProperty("WORK_PROFILE")
    private String work_profile;
    @JsonProperty("WORK_NOTES")
    private String work_notes;
    @JsonProperty("UF_EMPLOYMENT_DATE")
    private OffsetDateTime uf_employment_date;
    @JsonProperty("UF_TIMEMAN")
    private Timeman uf_timeman;
    @JsonProperty("UF_DEPARTMENT")
    private List<Integer> ufDepartment;
    @JsonProperty("UF_SKYPE")
    private String uf_skype;
    @JsonProperty("UF_DISTRICT")
    private String uf_district;
    @JsonProperty("UF_PHONE_INNER")
    private String uf_phone_inner;
    @JsonProperty("USER_TYPE")
    private String user_type;
    @Override
    public FullUserEntity getFull(BitrixRestClient client) {
        return this;
    }

    @Override
    public String toString() {
        return "FullUserEntity{" +
                "isActive=" + isActive +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", xmlId='" + xmlId + '\'' +
                ", secondName='" + secondName + '\'' +
                ", title='" + title + '\'' +
                ", email='" + email + '\'' +
                ", last_login=" + last_login +
                ", date_register=" + date_register +
                ", time_zone='" + time_zone + '\'' +
                ", is_online=" + is_online +
                ", timestampX=" + timestampX +
                ", personal_gender='" + personal_gender + '\'' +
                ", personal_profession='" + personal_profession + '\'' +
                ", personal_www='" + personal_www + '\'' +
                ", personal_birthday=" + personal_birthday +
                ", personal_icq='" + personal_icq + '\'' +
                ", personal_phone='" + personal_phone + '\'' +
                ", personal_fax='" + personal_fax + '\'' +
                ", personal_mobile='" + personal_mobile + '\'' +
                ", personal_pager='" + personal_pager + '\'' +
                ", personal_street='" + personal_street + '\'' +
                ", personal_city='" + personal_city + '\'' +
                ", personal_state='" + personal_state + '\'' +
                ", personal_zip='" + personal_zip + '\'' +
                ", personal_country=" + personal_country +
                ", personal_mailbox='" + personal_mailbox + '\'' +
                ", personal_notes='" + personal_notes + '\'' +
                ", work_phone='" + work_phone + '\'' +
                ", work_company='" + work_company + '\'' +
                ", work_position='" + work_position + '\'' +
                ", work_department='" + work_department + '\'' +
                ", work_www='" + work_www + '\'' +
                ", work_fax='" + work_fax + '\'' +
                ", work_pager='" + work_pager + '\'' +
                ", work_street='" + work_street + '\'' +
                ", work_mailbox='" + work_mailbox + '\'' +
                ", work_city='" + work_city + '\'' +
                ", work_state='" + work_state + '\'' +
                ", work_zip='" + work_zip + '\'' +
                ", work_country=" + work_country +
                ", work_profile='" + work_profile + '\'' +
                ", work_notes='" + work_notes + '\'' +
                ", uf_employment_date=" + uf_employment_date +
                ", uf_timeman='" + uf_timeman + '\'' +
                ", ufDepartment=" + ufDepartment +
                ", uf_skype='" + uf_skype + '\'' +
                ", uf_district='" + uf_district + '\'' +
                ", uf_phone_inner='" + uf_phone_inner + '\'' +
                ", user_type='" + user_type + '\'' +
                '}';
    }
}

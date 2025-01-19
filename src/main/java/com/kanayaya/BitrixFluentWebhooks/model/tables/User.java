package com.kanayaya.BitrixFluentWebhooks.model.tables;

import com.kanayaya.BitrixFluentWebhooks.model.Field;
import com.kanayaya.BitrixFluentWebhooks.model.Table;
import com.kanayaya.BitrixFluentWebhooks.model.bitrixTypes.*;

import java.time.OffsetDateTime;

import static com.kanayaya.BitrixFluentWebhooks.model.bitrixTypes.SerializerUtils.*;

public class User extends Table {
    public static final Field<User, Integer> ID = new Field<>("ID", INTEGER_DESERIALIZER);
    public static final StringField<User> XML_ID = new StringField<>("XML_ID");
    public static final BooleanField<User> ACTIVE = new BooleanField<>("ACTIVE");
    public static final StringField<User> NAME = new StringField<>("NAME");
    public static final StringField<User> LAST_NAME = new StringField<>("LAST_NAME");
    public static final StringField<User> SECOND_NAME = new StringField<>("SECOND_NAME");
    public static final StringField<User> TITLE = new StringField<>("TITLE");
    public static final StringField<User> EMAIL = new StringField<>("EMAIL");
//    public static final Field<User, > PERSONAL_PHONE;
//    public static final Field<User, > WORK_PHONE;
//    public static final Field<User, > WORK_POSITION;
//    public static final Field<User, > WORK_COMPANY;
    public static final YNField<User> IS_ONLINE = new YNField<>("IS_ONLINE");
//    public static final Field<User, > TIME_ZONE;
//    public static final Field<User, > TIMESTAMP_X;
//    public static final Field<User, > IME_ZONE_OFFSET;
    public static final DateField<User, OffsetDateTime> DATE_REGISTER = new DateField<>("DATE_REGISTER", DateField.DateLevel.OFFSET_DATE_TIME_LEVEL);
    public static final Field<User, OffsetDateTime> LAST_ACTIVITY_DATE = new DateField<>("LAST_ACTIVITY_DATE", DateField.DateLevel.OFFSET_DATE_TIME_LEVEL);
//    public static final Field<User, > PERSONAL_PROFESSION;
//    public static final Field<User, > PERSONAL_GENDER;
//    public static final Field<User, > PERSONAL_BIRTHDAY;
//    public static final Field<User, > PERSONAL_PHOTO;
//    public static final Field<User, > PERSONAL_FAX;
//    public static final Field<User, > PERSONAL_MOBILE;
//    public static final Field<User, > PERSONAL_PAGER;
//    public static final Field<User, > PERSONAL_STREET;
//    public static final Field<User, > PERSONAL_MAILBOX;
//    public static final Field<User, > PERSONAL_CITY;
//    public static final Field<User, > PERSONAL_STATE;
//    public static final Field<User, > PERSONAL_ZIP;
    public static final CountryField<User> PERSONAL_COUNTRY = new CountryField<>("PERSONAL_COUNTRY");
//    public static final Field<User, > PERSONAL_NOTES;
//    public static final Field<User, > WORK_DEPARTMENT;
//    public static final Field<User, > WORK_WWW;
//    public static final Field<User, > WORK_FAX;
//    public static final Field<User, > WORK_PAGER;
//    public static final Field<User, > WORK_STREET;
//    public static final Field<User, > WORK_MAILBOX;
//    public static final Field<User, > WORK_CITY;
//    public static final Field<User, > WORK_STATE;
//    public static final Field<User, > WORK_ZIP;
    public static final CountryField<User> WORK_COUNTRY = new CountryField<>("WORK_COUNTRY");
//    public static final Field<User, > WORK_PROFILE;
//    public static final Field<User, > WORK_LOGO;
//    public static final Field<User, > WORK_NOTES;
    public static final MultipleField<User, Integer, Field<User, Integer>> UF_DEPARTMENT =
        new MultipleField<>("UF_DEPARTMENT", new Field<>("UF_DEPARTMENT", INTEGER_DESERIALIZER));
//    public static final Field<User, > UF_PHONE_INNER;
//    public static final Field<User, > NAME_SEARCH;
//    public static final Field<User, > USER_TYPE;
}

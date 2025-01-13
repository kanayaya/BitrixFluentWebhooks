package com.kanayaya.BitrixFluentWebhooks;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.kanayaya.BitrixFluentWebhooks.api.Method;
import com.kanayaya.BitrixFluentWebhooks.api.request.MutableFilter;
import com.kanayaya.BitrixFluentWebhooks.model.tables.User;
import org.jetbrains.annotations.NotNull;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;
import static com.kanayaya.BitrixFluentWebhooks.BitrixWebhookClientTest.TEST_CLIENT;

public class FieldsParser {
    private static final ObjectMapper mapper = new ObjectMapper();
    private static final List<Method> simpleMethods = List.of(
            Method.USER_FIELDS
    );
    private static final List<Method> crmMethods = List.of(
            Method.CRM_ACTIVITY_FIELDS,
            Method.CRM_ADDRESS_FIELDS,
            Method.CRM_CATALOG_FIELDS,
            Method.CRM_CONTACT_FIELDS,
            Method.CRM_COMPANY_FIELDS,
            Method.CRM_DEAL_FIELDS,
            Method.CRM_CURRENCY_FIELDS,
            Method.CRM_ENUM_FIELDS,
            Method.CRM_CURRENCY_FIELDS

    );
    public static void main(String[] args) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        BitrixWebhookClient testClient = BitrixWebhookClientTest.TEST_CLIENT;
//        for (Method m :
//                crmMethods) {
//            String result = mapper.readTree(testClient.invoke(m)).get("result").toPrettyString();
//            System.out.println(result);
//        }
        System.out.println(mapper.readTree(TEST_CLIENT.invoke(Method.CRM_DEAL_FIELDS)).toPrettyString());
        System.out.println(mapper.readTree(testClient.invoke(Method.CRM_DEAL_GET, new MutableFilter<User>().field(User.ID).eq(4).getParams())).toPrettyString());
    }

    @NotNull
    private static Map.Entry<String, String> newEntry(String key, String value) {
        return new Map.Entry<>() {
            @Override
            public String getKey() {
                return key;
            }

            @Override
            public String getValue() {
                return value;
            }

            @Override
            public String setValue(String value) {
                return null;
            }
        };
    }

    public static class CRMField {
        public String type;
        public boolean isRequired;
        public boolean isReadOnly;
        public boolean isImmutable;
        public boolean isMultiple;
        public boolean isDynamic;
        public String title;
        public boolean isDeprecated;
        public JsonNode settings;
    }

    @Test
    public void userFields() throws JsonProcessingException {
        String fields = mapper.readTree(TEST_CLIENT.invoke(Method.USER_FIELDS)).toPrettyString();
        String user = mapper.readTree(TEST_CLIENT.invoke(Method.USER_GET, new MutableFilter<User>().field(User.ID).eq(4).getParams())).toPrettyString();



        System.out.println(fields);
        System.out.println(user);
    }
}

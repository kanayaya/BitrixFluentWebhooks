package com.kanayaya.BitrixFluentWebhooks;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.kanayaya.BitrixFluentWebhooks.api.Method;
import com.kanayaya.BitrixFluentWebhooks.api.request.filter.MutableFilter;
import com.kanayaya.BitrixFluentWebhooks.model.tables.User;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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
    public static void main(String[] args) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        BitrixWebhookClient testClient = BitrixWebhookClientTest.TEST_CLIENT;
        for (Method m :
                crmMethods) {
            String result = testClient.invoke(m).get("result").toString();
            JavaType type = mapper.getTypeFactory().constructMapType(Map.class, String.class, CRMField.class);
            Map<String, CRMField> fields = mapper.readValue(result, type);
            File file = new File(m.jsonName());
            if ( ! file.exists()) file.createNewFile();

            fields.forEach((k,v) -> {
                if (types.containsKey(v.type)) {
                    try {
                        write("public static final " + String.format(types.get(v.type), m.jsonName(), k, k) + "\n", m.jsonName());
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                } else System.out.println(m.jsonName() + ": Unknown type: " + v.type);

            });
        }

    }
    private static void write(String s, String path) throws IOException {
        Files.write(
                Paths.get(path),
                s.getBytes(),
                StandardOpenOption.APPEND);
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
        public String statusType;
    }
    private static final Map<String, String> types = Map.of(
            "integer", "Field<%s, Integer> %s = new Field<>(\"%s\", INTEGER_DESERIALIZER);",
            "string", "StringField<%s> %s = new StringField<>(\"%s\");",
            "char", "YNField<%s> %s = new YNField<>(\"%s\");",
            "double", "Field<%s, Double> %s = new Field<>(\"%s\", DOUBLE_DESERIALIZER);",
            "date", "DateField<%s, OffsetDateTime> %s = new DateField<>(\"%s\", DateField.DateLevel.OFFSET_DATE_TIME_LEVEL);",
            "datetime", "DateField<%s, OffsetDateTime> %s = new DateField<>(\"%s\", DateField.DateLevel.OFFSET_DATE_TIME_LEVEL);",
            "user", "UserField<%s> %s = new UserField<>(\"%s\");",
            "int", "Field<%s, Integer> %s = new Field<>(\"%s\", INTEGER_DESERIALIZER);"
    );

    @Test
    public void userFields() throws JsonProcessingException {
        String fields = TEST_CLIENT.invoke(Method.CRM_DEAL_FIELDS, Map.of("TASK_ID", 1)).toPrettyString();
        String user = TEST_CLIENT.invoke(Method.USER_GET, Map.of("FILTER", new MutableFilter<User>().field(User.ID).eq(1).getParams(), "ADMIN_MODE", true)).toPrettyString();



        System.out.println(fields);
        System.out.println(user);
    }
    @Test
    public void printEnums() throws IOException {
        final List<Method> enumFields = List.of(
                Method.CRM_ENUM_OWNERTYPE,
                Method.CRM_ENUM_ADDRESSTYPE,
                Method.CRM_ENUM_ACTIVITYTYPE,
                Method.CRM_ENUM_ACTIVITYNOTIFYTYPE,
                Method.CRM_ENUM_CONTENTTYPE,
                Method.CRM_ENUM_SETTINGS_MODE,
                Method.CRM_ENUM_ACTIVITYDIRECTION,
                Method.CRM_ENUM_ACTIVITYPRIORITY,
                Method.CRM_ENUM_ACTIVITYSTATUS
        );
        for (Method m: enumFields) {
            String className = Stream.of(m.getName().split("\\.")).map(FieldsParser::capitate).collect(Collectors.joining("", "", ".java")).substring(7);
            System.out.println(className);
            File file = new File(className);
            if ( ! file.exists()) file.createNewFile();
            ArrayNode result = TEST_CLIENT.invoke(m).withArray("result");
            System.out.println(result.toPrettyString());
            for (JsonNode node: result) {
                write((node.get("SYMBOL_CODE").isNull()? className.substring(0, className.length() - 5).toUpperCase() + "_" + node.get("ID") : node.get("SYMBOL_CODE"))
                        + "(" + node.get("ID") + ", " + node.get("NAME") +
                        (node.get("SYMBOL_CODE").isNull()? "" : ", " + node.get("SYMBOL_CODE"))
                        + (node.get("SYMBOL_CODE_SHORT").isNull()? "),\n" : ", " + node.get("SYMBOL_CODE_SHORT") + "),\n")
                        , className);
            }
        }
    }

    private static String capitate(String s) {
        return s.substring(0,1).toUpperCase() + s.substring(1);
    }
}

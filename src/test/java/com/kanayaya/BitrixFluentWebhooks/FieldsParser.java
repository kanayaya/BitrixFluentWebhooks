package com.kanayaya.BitrixFluentWebhooks;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.kanayaya.BitrixFluentWebhooks.api.Method;
import com.kanayaya.BitrixFluentWebhooks.exceptions.BitrixException;
import com.kanayaya.BitrixFluentWebhooks.model.enums.*;
import com.kanayaya.BitrixFluentWebhooks.model.pojo.BitrixFile;
import com.kanayaya.BitrixFluentWebhooks.model.pojo.MultifieldItem;
import com.kanayaya.BitrixFluentWebhooks.model.pojo.full.FullUserEntity;
import com.kanayaya.BitrixFluentWebhooks.model.pojo.idable.*;
import com.kanayaya.BitrixFluentWebhooks.model.tables.User;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static com.kanayaya.BitrixFluentWebhooks.BitrixWebhookClientTest.TEST_CLIENT;

public class FieldsParser {
    private static final String FULL_POJOS_PATH = "z_generated/pojos/full/";
    private static final String IDABLE_POJOS_PATH = "z_generated/pojos/idable/";
    private static final String TABLES_PATH = "z_generated/tables/";
    private static final String ENTITY_TEMPLATE = new Scanner(FieldsParser.class.getClassLoader().getResourceAsStream("templates/entityTemplate.txt")).useDelimiter("\\Z").next();
    private static final String FULL_ENTITY_TEMPLATE = new Scanner(FieldsParser.class.getClassLoader().getResourceAsStream("templates/fullEntityTemplate.txt")).useDelimiter("\\Z").next();
    private static final String FIELD_TEMPLATE = new Scanner(FieldsParser.class.getClassLoader().getResourceAsStream("templates/fieldTemplate.txt")).useDelimiter("\\Z").next();
    private static final ObjectMapper mapper = TEST_CLIENT.getMapper();
    private static final List<Method> simpleMethods = List.of(
            Method.USER_FIELDS
    );
    private static final List<Method> crmMethods = List.of(
            Method.CRM_ACTIVITY_COMMUNICATION_FIELDS,
            Method.CRM_ACTIVITY_FIELDS,
            Method.CRM_ADDRESS_FIELDS,
            Method.CRM_CATALOG_FIELDS,
            Method.CRM_CONTACT_FIELDS,
            Method.CRM_COMPANY_FIELDS,
            Method.CRM_CURRENCY_FIELDS,
            Method.CRM_DEAL_FIELDS,
            Method.CRM_ENUM_FIELDS,
            Method.CRM_LEAD_FIELDS,
            Method.CRM_STATUS_FIELDS,
            Method.CRM_QUOTE_FIELDS
    );
    public static void main(String[] args) throws IOException {
        mkdirs();
        ObjectMapper mapper = new ObjectMapper();
        BitrixWebhookClient testClient = BitrixWebhookClientTest.TEST_CLIENT;
        for (Method m :
                crmMethods) {
            String result = testClient.invoke(m).toString();
            JavaType type = mapper.getTypeFactory().constructMapType(Map.class, String.class, CRMField.class);
            Map<String, CRMField> fields = mapper.readValue(result, type);
            String className = Stream.of(m.getName().substring(4, m.getName().length() - 7).split("\\.")).map(FieldsParser::capitate).collect(Collectors.joining());
            File table = new File(TABLES_PATH + className + ".java");
            if ( ! table.exists()) table.createNewFile();

            StringBuilder formattedFiedls = new StringBuilder();

            write("package com.kanayaya.BitrixFluentWebhooks.model.tables;\n" +
                    "\n" +
                    "import com.kanayaya.BitrixFluentWebhooks.model.Field;\n" +
                    "import com.kanayaya.BitrixFluentWebhooks.model.Table;\n" +
                    "import com.kanayaya.BitrixFluentWebhooks.model.bitrixTypes.*;\n" +
                    "import com.kanayaya.BitrixFluentWebhooks.model.bitrixTypes.enums.CountryField;\n" +
                    "import com.kanayaya.BitrixFluentWebhooks.model.bitrixTypes.enums.YNField;\n" +
                    "import com.kanayaya.BitrixFluentWebhooks.model.bitrixTypes.entities.*;\n" +
                    "\n" +
                    "import java.time.OffsetDateTime;\n" +
                    "\n" +
                    "import static com.kanayaya.BitrixFluentWebhooks.model.bitrixTypes.SerializerUtils.*;\n" +
                    "\n" +
                    "public class " + className + " extends Table {\n", table.getPath());
            fields.forEach((k,v) -> {
                if (types.containsKey(v.type)) {
                    try {
                        write("/**\n" +
                                "    * " + v.title + '\n' +
                                "    */\npublic static final " + String.format(types.get(v.type), className, k, k) + "\n", table.getPath());
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                    formattedFiedls.append(String.format(FIELD_TEMPLATE, v.title, k, javaTypes.get(v.type), toCamelCase(k))).append("\n");
                } else System.out.println(className + ':' + k + ": Unknown type: " + v.type);

            });
            write("}", table.getPath());

            File pojo = new File(IDABLE_POJOS_PATH + className + "Entity.java");
            if ( ! pojo.exists()) pojo.createNewFile();

            write(String.format(ENTITY_TEMPLATE, Stream.generate(() -> className).limit(7).toArray()), pojo.getPath());

            File fullPojo = new File(FULL_POJOS_PATH + "Full" + className + "Entity.java");
            if ( ! fullPojo.exists()) fullPojo.createNewFile();

            write(String.format(FULL_ENTITY_TEMPLATE, className, className, className, formattedFiedls, className), fullPojo.getPath());

        }
    }
    private static void mkdirs() {
        new File(FULL_POJOS_PATH).mkdirs();
        new File(IDABLE_POJOS_PATH).mkdirs();
        new File(TABLES_PATH).mkdirs();
    }
    private static void write(String s, String path) throws IOException {
        Files.write(
                Paths.get(path),
                s.getBytes(),
                StandardOpenOption.APPEND);
    }
    private static String toCamelCase(String from) {
        String[] tokens = from.split("_");
        StringBuilder sb = new StringBuilder(tokens[0].toLowerCase());
        for (int i = 1; i < tokens.length; i++) {
            sb.append(capitate(tokens[i].toLowerCase()));
        }
        return sb.toString();
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
    private static final Map<String, String> types = new HashMap<>();
    static {
        types.put("integer", "Field<%s, Integer> %s = new Field<>(\"%s\", INTEGER_DESERIALIZER);");
        types.put("string", "StringField<%s> %s = new StringField<>(\"%s\");");
        types.put("char", "YNField<%s> %s = new YNField<>(\"%s\");");
        types.put("double", "Field<%s, Double> %s = new Field<>(\"%s\", DOUBLE_DESERIALIZER);");
        types.put("date", "DateField<%s, OffsetDateTime> %s = new DateField<>(\"%s\", DateField.DateLevel.OFFSET_DATE_TIME_LEVEL);");
        types.put("datetime", "DateField<%s, OffsetDateTime> %s = new DateField<>(\"%s\", DateField.DateLevel.OFFSET_DATE_TIME_LEVEL);");
        types.put("user", "UserField<%s> %s = new UserField<>(\"%s\");");
        types.put("int", "Field<%s, Integer> %s = new Field<>(\"%s\", INTEGER_DESERIALIZER);");
        types.put("crm_enum_ownertype", "OwnertypeField<%s> %s = new OwnertypeField(\"%s\");");
        types.put("crm_enum_activitytype", "ActivitytypeField<%s> %s = new ActivitytypeField(\"%s\");");
        types.put("crm_enum_activitystatus", "ActivitystatusField<%s> %s = new ActivitystatusField(\"%s\");");
        types.put("crm_enum_activitypriority", "ActivitypriorityField<%s> %s = new ActivitypriorityField(\"%s\");");
        types.put("crm_enum_activitynotifytype", "ActivitynotifytypeField<%s> %s = new ActivitynotifytypeField(\"%s\");");
        types.put("crm_enum_contenttype", "ContenttypeField<%s> %s = new ContenttypeField(\"%s\");");
        types.put("crm_enum_activitydirection", "ActivitydirectionField<%s> %s = new ActivitydirectionField(\"%s\");");
        types.put("object", "JsonField<%s> %s = new JsonField<>(\"%s\");");
        types.put("crm_activity_communication", "ActivityCommunicationField<%s> %s = new ActivityCommunicationField<>(\"%s\");");
        types.put("crm_status", "StatusField<%s> %s = new StatusField<>(\"%s\");");
        types.put("crm_company", "CompanyField<%s> %s = new CompanyField<>(\"%s\");");
        types.put("crm_lead", "LeadField<%s> %s = new LeadField<>(\"%s\");");
        types.put("crm_contact", "ContactField<%s> %s = new ContactField<>(\"%s\");");
        types.put("crm_deal", "DealField<%s> %s = new DealField<>(\"%s\");");
        types.put("crm_currency", "CurrencyField<%s> %s = new CurrencyField<>(\"%s\")");
        types.put("crm_quote", "QuoteField<%s> %s = new QuoteField<>(\"%s\")");
        types.put("file", "// field %s %s %s");
        types.put("diskfile", "// field %s %s %s");
        types.put("crm_multifield", "MultipleField<%s, MultifieldItem, StringField<123>> %s = new MultipleField<>(\"%s\", new StringField<>(123));");
    }
    private static final Map<String, String> javaTypes = new HashMap<>();
    static {
        javaTypes.put("integer", Integer.class.getSimpleName());
        javaTypes.put("string", String.class.getSimpleName());
        javaTypes.put("char", YN.class.getSimpleName());
        javaTypes.put("double", Double.class.getSimpleName());
        javaTypes.put("date", OffsetDateTime.class.getSimpleName());
        javaTypes.put("datetime", OffsetDateTime.class.getSimpleName());
        javaTypes.put("user", UserEntity.class.getSimpleName());
        javaTypes.put("int", Integer.class.getSimpleName());
        javaTypes.put("crm_enum_ownertype", Ownertype.class.getSimpleName());
        javaTypes.put("crm_enum_activitytype", Activitytype.class.getSimpleName());
        javaTypes.put("crm_enum_activitystatus", Activitystatus.class.getSimpleName());
        javaTypes.put("crm_enum_activitypriority", Activitypriority.class.getSimpleName());
        javaTypes.put("crm_enum_activitynotifytype", Activitynotifytype.class.getSimpleName());
        javaTypes.put("crm_enum_contenttype", Contenttype.class.getSimpleName());
        javaTypes.put("crm_enum_activitydirection", Activitydirection.class.getSimpleName());
        javaTypes.put("object", JsonNode.class.getSimpleName());
        javaTypes.put("crm_activity_communication", ActivityCommunicationEntity.class.getSimpleName());
        javaTypes.put("crm_status", StatusEntity.class.getSimpleName());
        javaTypes.put("crm_company", CompanyEntity.class.getSimpleName());
        javaTypes.put("crm_lead", LeadEntity.class.getSimpleName());
        javaTypes.put("crm_contact", ContactEntity.class.getSimpleName());
        javaTypes.put("crm_deal", DealEntity.class.getSimpleName());
        javaTypes.put("crm_currency", CurrencyEntity.class.getSimpleName());
        javaTypes.put("crm_quote", QuoteEntity.class.getSimpleName());
        javaTypes.put("file", BitrixFile.class.getSimpleName());
        javaTypes.put("diskfile", BitrixFile.class.getSimpleName());
        javaTypes.put("crm_multifield", "List<" + MultifieldItem.class.getSimpleName() + ">");
    }

    @Test
    public void userFields() {
        FullUserEntity userEntity = TEST_CLIENT.user().get(User.ID.eq(4)).send().get(0);
        System.out.println(userEntity);
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

    @Test
    public void printDeals() {
        JsonNode activities = TEST_CLIENT.invoke(Method.CRM_ACTIVITY_LIST);
        System.out.println(activities);
        JsonNode binds = TEST_CLIENT.invoke(Method.CRM_ACTIVITY_BINDING_LIST, Map.of("activityId", 1));
        System.out.println(binds);
        //http://localhost/bitrix/tools/crm_show_file.php?fileId=49&ownerTypeId=6&ownerId=2&auth=
    }
    @Test
    public void printCategories() {
        for (Ownertype etId :
                Ownertype.values()) {
            try {
                System.out.println(etId.getName() + ": " + TEST_CLIENT.invoke(Method.CRM_CATEGORY_FIELDS, Map.of("entityTypeId", etId.getId())).toPrettyString());
            } catch (BitrixException e) {
                System.out.println(etId.getName() + " не поддерживает категории или требует что-то ещё: " + e);
            }
        }
    }

    private static String capitate(String s) {
        return s.substring(0,1).toUpperCase() + s.substring(1);
    }
}

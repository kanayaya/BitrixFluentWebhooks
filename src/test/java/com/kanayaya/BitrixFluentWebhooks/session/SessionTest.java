package com.kanayaya.BitrixFluentWebhooks.session;

import com.kanayaya.BitrixFluentWebhooks.BitrixAjaxClient;
import com.kanayaya.BitrixFluentWebhooks.BitrixSessionClient;
import com.kanayaya.BitrixFluentWebhooks.BitrixWebhookClient;
import com.kanayaya.BitrixFluentWebhooks.api.Method;
import com.kanayaya.BitrixFluentWebhooks.model.tables.User;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

import static java.lang.Thread.sleep;

public class SessionTest {
    private static final Properties properties = new Properties();
    static {
        try {
            properties.load(BitrixWebhookClient.class.getClassLoader().getResourceAsStream("passes.properties"));
        } catch (IOException e) {
            throw new RuntimeException("No properties file found", e);
        }
    }
    public static BitrixSessionClient admin = new BitrixSessionClient() {
        private final SessionManager manager = new SessionManager("http://localhost", properties.getProperty("admin_login"), properties.getProperty("admin_password"), () -> properties.getProperty("admin_password"), false);
        @Override
        public SessionManager getSessionManager() {
            return manager;
        }
    };
    public static BitrixSessionClient test = new BitrixSessionClient() {
        private final SessionManager manager = new SessionManager("http://localhost", properties.getProperty("admin_login"),  properties.getProperty("admin_password"), () -> properties.getProperty("test_password"), false);
        @Override
        public SessionManager getSessionManager() {
            return manager;
        }
    };
    @Test
    public void printCookies() {
        System.out.println(admin.user().fields().toPrettyString());
        System.out.println(test.user().fields().toPrettyString());

        System.out.println(admin.user().current());
        System.out.println(test.user().current());


        System.out.println(admin.user().get()
                .withFilter(User.NAME.contains("ст"), User.ID.notIn(100))
                .withSort(User.NAME).asc()
                .get());
        System.out.println(test.user().get().withFilter(User.NAME.contains("ст")).get());
    }
    @Test
    public void bruteForce() throws URISyntaxException, IOException, InterruptedException {
        HttpResponse<String> r = admin.invokeAjax(
                "bitrix", "crm.activity.list",
                BitrixAjaxClient.Mode.AJAX, "getList",
                Map.of("fieldId", "ID"));
        System.out.println(r.body());
        HttpResponse<String> re = admin.client().send(HttpRequest.newBuilder().uri(new URI("http://localhost/bitrix/tools/crm_show_file.php?fileId=43&ownerTypeId=6&ownerId=1")).build(), HttpResponse.BodyHandlers.ofString());
        System.out.println(re.headers());
    }
    @Test
    public void waiting() throws InterruptedException {
        System.out.println("waiting for 30 minutes straight for session to expire");
        AtomicInteger counter = new AtomicInteger(30);
        new Thread(() -> {
            while (counter.get() > 0) {
                System.out.println(counter.get() + " minutes left");
                counter.decrementAndGet();
                try {
                    wait(60000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }).start();
        admin.invoke(Method.CRM_DEAL_LIST);
        sleep(1000 * 60 * 30);
        admin.invoke(Method.CRM_DEAL_LIST);
    }
    @Test
    public void usersTest() {
        System.out.println(admin.invoke(Method.USER_GET, Map.of("filter", Map.of("UF_FROM_AMO", "N"), "select", "ID")));
    }
    @Test
    public void activitiesTest() {
        System.out.println(admin.invoke(Method.CRM_ACTIVITY_LIST, Map.of("select", "BINDINGS")).toPrettyString());
        System.out.println(admin.invoke(Method.SERVER_TIME));
    }
    @Test
    public void currenciesTest() {
        //System.out.println(admin.invoke(Method.CRM_CURRENCY_LOCALIZATIONS_FIELDS).toPrettyString());
        System.out.println(admin.invoke(Method.CRM_CURRENCY_LOCALIZATIONS_GET, Map.of("id", "UAH")).toPrettyString());
        System.out.println(admin.invoke(Method.CRM_CURRENCY_LIST, Map.of("select", List.of("LANG"))).toPrettyString());
    }
    @Test
    public void dealsTest() {
        System.out.println(admin.invoke(Method.CRM_DEAL_LIST).toPrettyString());
    }
    @Test
    public void productsTest() {
        System.out.println(admin.invoke(Method.CRM_PRODUCT_LIST, Map.of("select", List.of("*", "PROPERTY_61"))).toPrettyString());
        System.out.println(admin.invoke(Method.DISK_FILE_GET, Map.of("id", 127)).toPrettyString());
    }
}

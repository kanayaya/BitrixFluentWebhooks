package com.kanayaya.BitrixFluentWebhooks.session;

import com.kanayaya.BitrixFluentWebhooks.BitrixSessionClient;
import com.kanayaya.BitrixFluentWebhooks.BitrixWebhookClient;
import com.kanayaya.BitrixFluentWebhooks.api.Method;
import com.kanayaya.BitrixFluentWebhooks.model.tables.User;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.Properties;
import java.util.Random;
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
        private final SessionManager manager = new SessionManager("http://localhost", "test", properties.getProperty("test_password"), () -> properties.getProperty("test_password"), false);
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


        System.out.println(admin.user().get(filter -> filter.field(User.NAME).contains("ст")).send());
        System.out.println(test.user().get(filter -> filter.field(User.NAME).contains("ст")).send());
    }
    @Test
    public void bruteForce() throws InterruptedException {
        Random random = new Random();
        int count = 0;
        while (true) {
            admin.invoke(Method.CRM_DEAL_LIST);
            System.out.print(++count + (count % 50 == 0? "\n" : " "));
            sleep(random.nextInt(9000) + 1000);
        }
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
}

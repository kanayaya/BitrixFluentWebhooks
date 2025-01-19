package com.kanayaya.BitrixFluentWebhooks.session;

import com.kanayaya.BitrixFluentWebhooks.BitrixSessionClient;
import com.kanayaya.BitrixFluentWebhooks.BitrixWebhookClient;
import com.kanayaya.BitrixFluentWebhooks.api.request.MutableFilter;
import com.kanayaya.BitrixFluentWebhooks.model.tables.User;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.Properties;

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


        System.out.println(admin.user().get(new MutableFilter<User>().field(User.NAME).contains("ст")).send());
        System.out.println(test.user().get(new MutableFilter<User>().field(User.NAME).contains("ст")).send());
    }
}

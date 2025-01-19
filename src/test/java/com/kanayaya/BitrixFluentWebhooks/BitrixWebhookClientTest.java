package com.kanayaya.BitrixFluentWebhooks;

import org.junit.jupiter.api.Test;

import java.io.*;

import static org.junit.jupiter.api.Assertions.*;

public class BitrixWebhookClientTest {
    public static final BitrixWebhookClient TEST_CLIENT = new BitrixWebhookClient() {
        private final String token;

        {
            try { // watching for pass.txt in test resources
                token = new BufferedReader(new InputStreamReader(BitrixWebhookClient.class.getClassLoader().getResourceAsStream("pass.txt"))).readLine();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        @Override
        public String host() {
            return "http://localhost";
        }

        @Override
        public TokenSecret token() {
            return new TokenSecret(token);
        }
        @Override
        public Long userId() {
            return 1L;
        }
    };

    @Test
    public void testCreation() {
        assertEquals(TEST_CLIENT.host(), "localhost");
        assertNotNull(TEST_CLIENT.token());
    }
    @Test
    public void testGet() {
        System.out.println(TEST_CLIENT.getUsersString("мин").toPrettyString());
        System.out.println(TEST_CLIENT.user().current());
    }

}
package com.kanayaya.BitrixFluentWebhooks;

import org.junit.jupiter.api.Test;

import java.io.*;

import static org.junit.jupiter.api.Assertions.*;

class BitrixWebhookClientTest {
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
            return "localhost";
        }

        @Override
        protected String token() {
            return token;
        }
    };

    @Test
    public void testCreation() {
        assertEquals(TEST_CLIENT.host(), "localhost");
        assertNotNull(TEST_CLIENT.token());
    }

}
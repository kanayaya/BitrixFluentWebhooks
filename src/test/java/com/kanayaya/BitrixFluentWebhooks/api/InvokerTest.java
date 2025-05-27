package com.kanayaya.BitrixFluentWebhooks.api;

import com.kanayaya.BitrixFluentWebhooks.BitrixRestClient;
import com.kanayaya.BitrixFluentWebhooks.session.SessionTest;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class InvokerTest {
    Invoker invoker = new Invoker(SessionTest.admin);
    @Test
    public void testMethods() {
        Arrays.stream(Method.values()).forEach(m -> {
            if (m.getName().endsWith("*")) System.out.println(m.getName());
        }
        );
        System.out.println(invoker.methods());
    }

}
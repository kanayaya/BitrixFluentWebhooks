package com.kanayaya.BitrixFluentWebhooks;

/**
 * Единственная задача класса -- выводить строку токена в protected скоуп.
 * Хотите делиться токеном в клиентском коде -- наследуйте секрет и клиент
 */
public class TokenSecret {
    private final String token;

    public TokenSecret(String token) {
        this.token = token;
    }
    protected String token() {
        return token;
    }
}

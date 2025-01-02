package com.kanayaya.BitrixFluentWebhooks.api.response;

import java.util.Optional;

public interface BitrixResponse<T> {
    Optional<T> get();
    int status();

}

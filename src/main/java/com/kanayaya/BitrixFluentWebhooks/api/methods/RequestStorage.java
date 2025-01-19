package com.kanayaya.BitrixFluentWebhooks.api.methods;

import com.kanayaya.BitrixFluentWebhooks.api.Method;

import java.util.Map;

abstract class RequestStorage {
    abstract Map<String, Object> getParams();
    abstract Method getMethod();
    abstract void addParam(String key, Object value);
    abstract void addAll(Map<String, Object> values);
}

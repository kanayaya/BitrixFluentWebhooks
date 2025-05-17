package com.kanayaya.BitrixFluentWebhooks.api.methods.im;

import com.kanayaya.BitrixFluentWebhooks.BitrixRestClient;
import com.kanayaya.BitrixFluentWebhooks.api.methods.im.department.Colleagues;
import com.kanayaya.BitrixFluentWebhooks.api.methods.im.department.Employees;
import com.kanayaya.BitrixFluentWebhooks.api.methods.im.department.Managers;

public class Department {
    public final Colleagues colleagues;
    public final Employees employees;
    public final Managers managers;
    private final BitrixRestClient client;

    public Department(BitrixRestClient client) {
        this.client = client;
        colleagues = new Colleagues(client);
        employees = new Employees(client);
        managers = new Managers(client);
    }

    // public void get() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#IM_DEPARTMENT_GET
}
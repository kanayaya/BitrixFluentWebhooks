package com.kanayaya.BitrixFluentWebhooks.api.methods.humanresources;

import com.kanayaya.BitrixFluentWebhooks.BitrixRestClient;
import com.kanayaya.BitrixFluentWebhooks.api.methods.humanresources.hcmlink.Company;
import com.kanayaya.BitrixFluentWebhooks.api.methods.humanresources.hcmlink.Employee;
import com.kanayaya.BitrixFluentWebhooks.api.methods.humanresources.hcmlink.Field;
import com.kanayaya.BitrixFluentWebhooks.api.methods.humanresources.hcmlink.Job;

public class Hcmlink {
    public final Field field;
    public final Company company;
    public final Job job;
    public final Employee employee;
    private final BitrixRestClient client;

    public Hcmlink(BitrixRestClient client) {
        this.client = client;
        field = new Field(client);
        company = new Company(client);
        job = new Job(client);
        employee = new Employee(client);
    }


}
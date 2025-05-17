package com.kanayaya.BitrixFluentWebhooks.api.methods;

import com.kanayaya.BitrixFluentWebhooks.BitrixRestClient;
import com.kanayaya.BitrixFluentWebhooks.api.methods.crm.Documentgenerator;
import com.kanayaya.BitrixFluentWebhooks.api.methods.crm.Enum;
import com.kanayaya.BitrixFluentWebhooks.api.methods.crm.*;

public class Crm {
    public final Livefeedmessage livefeedmessage;
    public final Deal deal;
    public final Externalchannel externalchannel;
    public final Activity activity;
    public final Catalog catalog;
    public final Type type;
    public final Documentgenerator documentgenerator;
    public final Automatedsolution automatedsolution;
    public final Automation automation;
    public final Quote quote;
    public final Userfield userfield;
    public final Contact contact;
    public final Currency currency;
    public final Company company;
    public final Product product;
    public final Item item;
    public final Address address;
    public final Orderentity orderentity;
    public final Vat vat;
    public final Productsection productsection;
    public final Requisite requisite;
    public final Lead lead;
    public final Enum anEnum;
    public final Measure measure;
    public final Timeline timeline;
    public final Invoice invoice;
    public final Category category;
    public final Status status;
    private final BitrixRestClient client;

    public Crm(BitrixRestClient client) {
        this.client = client;
        livefeedmessage = new Livefeedmessage(client);
        deal = new Deal(client);
        externalchannel = new Externalchannel(client);
        activity = new Activity(client);
        catalog = new Catalog(client);
        type = new Type(client);
        documentgenerator = new Documentgenerator(client);
        automatedsolution = new Automatedsolution(client);
        automation = new Automation(client);
        quote = new Quote(client);
        userfield = new Userfield(client);
        contact = new Contact(client);
        currency = new Currency(client);
        company = new Company(client);
        product = new Product(client);
        item = new Item(client);
        address = new Address(client);
        orderentity = new Orderentity(client);
        vat = new Vat(client);
        productsection = new Productsection(client);
        requisite = new Requisite(client);
        anEnum =new Enum(client);
        lead = new Lead(client);
        measure = new Measure(client);
        timeline = new Timeline(client);
        invoice = new Invoice(client);
        category = new Category(client);
        status = new Status(client);
    }


}
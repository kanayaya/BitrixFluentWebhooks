package com.kanayaya.BitrixFluentWebhooks.api.methods;

import com.kanayaya.BitrixFluentWebhooks.BitrixRestClient;
import com.kanayaya.BitrixFluentWebhooks.api.methods.sale.*;

public class Sale {
    public final TradeBinding tradeBinding;
    public final BasketItem basketitem;
    public final StatusLang statusLang;
    public final Propertyvalue propertyvalue;
    public final Persontype persontype;
    public final PropertyVariant propertyVariant;
    public final Property property;
    public final Payment payment;
    public final TradePlatform tradePlatform;
    public final BasketProperties basketproperties;
    public final Shipmentproperty shipmentproperty;
    public final PaymentItemShipment paymentItemShipment;
    public final Order order;
    public final Delivery delivery;
    public final BusinessValuePersonDomain businessValuePersonDomain;
    public final Shipment shipment;
    public final Paysystem paysystem;
    public final Propertygroup propertygroup;
    public final Shipmentitem shipmentitem;
    public final Cashbox cashbox;
    public final PropertyRelation propertyRelation;
    public final BasketProperties basketProperties;
    public final BasketItem basketItem;
    public final Status status;
    public final PaymentItemBasket paymentItemBasket;
    private final BitrixRestClient client;

    public Sale(BitrixRestClient client) {
        this.client = client;
        tradeBinding = new TradeBinding(client);
        basketitem = new BasketItem(client);
        statusLang = new StatusLang(client);
        propertyvalue = new Propertyvalue(client);
        persontype = new Persontype(client);
        propertyVariant = new PropertyVariant(client);
        property = new Property(client);
        payment = new Payment(client);
        tradePlatform = new TradePlatform(client);
        basketproperties = new BasketProperties(client);
        shipmentproperty = new Shipmentproperty(client);
        paymentItemShipment = new PaymentItemShipment(client);
        order = new Order(client);
        delivery = new Delivery(client);
        businessValuePersonDomain = new BusinessValuePersonDomain(client);
        shipment = new Shipment(client);
        paysystem = new Paysystem(client);
        propertygroup = new Propertygroup(client);
        shipmentitem = new Shipmentitem(client);
        cashbox = new Cashbox(client);
        propertyRelation = new PropertyRelation(client);
        basketProperties = new BasketProperties(client);
        basketItem = new BasketItem(client);
        status = new Status(client);
        paymentItemBasket = new PaymentItemBasket(client);
    }


}
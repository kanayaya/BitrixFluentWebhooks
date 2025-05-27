package com.kanayaya.BitrixFluentWebhooks.api.methods;

import com.kanayaya.BitrixFluentWebhooks.BitrixRestClient;
import com.kanayaya.BitrixFluentWebhooks.api.methods.task.*;

public class Task {
    public final Item item;
    public final Ctasklogitem ctasklogitem;
    public final Checklistitem checklistitem;
    public final Ctasks ctasks;
    public final Ctaskchecklistitem ctaskchecklistitem;
    public final Ctaskcommentitem ctaskcommentitem;
    public final Elapseditem elapseditem;
    public final Logitem logitem;
    public final Ctaskitem ctaskitem;
    public final Ctaskplannermaintance ctaskplannermaintance;
    public final Stages stages;
    public final Dependence dependence;
    public final Commentitem commentitem;
    public final Comment comment;
    public final Ctaskelapseditem ctaskelapseditem;
    public final Items items;
    public final Planner planner;
    public final Ctaskcomments ctaskcomments;
    private final BitrixRestClient client;

    public Task(BitrixRestClient client) {
        this.client = client;
        item = new Item(client);
        ctasklogitem = new Ctasklogitem(client);
        checklistitem = new Checklistitem(client);
        ctasks = new Ctasks(client);
        ctaskchecklistitem = new Ctaskchecklistitem(client);
        ctaskcommentitem = new Ctaskcommentitem(client);
        elapseditem = new Elapseditem(client);
        logitem = new Logitem(client);
        ctaskitem = new Ctaskitem(client);
        ctaskplannermaintance = new Ctaskplannermaintance(client);
        stages = new Stages(client);
        dependence = new Dependence(client);
        commentitem = new Commentitem(client);
        comment = new Comment(client);
        ctaskelapseditem = new Ctaskelapseditem(client);
        items = new Items(client);
        planner = new Planner(client);
        ctaskcomments = new Ctaskcomments(client);
    }


}
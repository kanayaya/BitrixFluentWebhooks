package com.kanayaya.BitrixFluentWebhooks.api.methods;

import com.kanayaya.BitrixFluentWebhooks.BitrixRestClient;
import com.kanayaya.BitrixFluentWebhooks.api.methods.lists.Element;
import com.kanayaya.BitrixFluentWebhooks.api.methods.lists.Field;
import com.kanayaya.BitrixFluentWebhooks.api.methods.lists.Get;
import com.kanayaya.BitrixFluentWebhooks.api.methods.lists.Section;

public class Lists {
    public final Field field;
    public final Get get;
    public final Section section;
    public final Element element;
    private final BitrixRestClient client;

    public Lists(BitrixRestClient client) {
        this.client = client;
        field = new Field(client);
        get = new Get(client);
        section = new Section(client);
        element = new Element(client);
    }

    // public void add() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#LISTS_ADD
    // public void get() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#LISTS_GET_IBLOCK_TYPE_ID
    // public void update() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#LISTS_UPDATE
    // public void delete() {}  com.kanayaya.BitrixFluentWebhooks.api.Method#LISTS_DELETE
}
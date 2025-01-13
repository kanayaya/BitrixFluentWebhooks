package com.kanayaya.BitrixFluentWebhooks.model.bitrixTypes;

import com.kanayaya.BitrixFluentWebhooks.model.Field;
import com.kanayaya.BitrixFluentWebhooks.model.Table;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static com.kanayaya.BitrixFluentWebhooks.model.bitrixTypes.SerializerUtils.ARRAY_DESERIALIZER;

public class MultipleField<TABLE extends Table, VALUE, ITEM extends Field<TABLE, VALUE>> extends Field<TABLE, List<VALUE>> {
    public MultipleField(String name, ITEM of) {

        super(name,
                list->list.stream().map(of::serialize).collect(Collectors.toList()),
                s-> Stream.of(ARRAY_DESERIALIZER.apply(s)).map(of::deserialize).collect(Collectors.toList()));
    }
}

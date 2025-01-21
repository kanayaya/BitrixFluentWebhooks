package com.kanayaya.BitrixFluentWebhooks.model.bitrixTypes.enums;

import com.kanayaya.BitrixFluentWebhooks.model.Field;
import com.kanayaya.BitrixFluentWebhooks.model.Table;
import com.kanayaya.BitrixFluentWebhooks.model.enums.YN;

public class YNField<TABLE extends Table> extends Field<TABLE, YN> {
    public YNField(String name) {
        super(name, s -> s.equals("Y")? YN.Y : s.equals("N")? YN.N : YN.EMPTY);
    }
}

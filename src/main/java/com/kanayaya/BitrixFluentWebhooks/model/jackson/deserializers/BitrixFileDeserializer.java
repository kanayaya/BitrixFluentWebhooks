package com.kanayaya.BitrixFluentWebhooks.model.jackson.deserializers;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.kanayaya.BitrixFluentWebhooks.exceptions.BitrixException;
import com.kanayaya.BitrixFluentWebhooks.model.pojo.ActivityFile;
import com.kanayaya.BitrixFluentWebhooks.model.pojo.BitrixFile;
import com.kanayaya.BitrixFluentWebhooks.model.pojo.BitrixCRMFile;

import java.io.IOException;

public class BitrixFileDeserializer extends StdDeserializer<BitrixFile> {
    public BitrixFileDeserializer() {
        this(null);
    }
    protected BitrixFileDeserializer(Class<?> vc) {
        super(vc);
    }

    @Override
    public BitrixFile deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
        JsonNode node = p.getCodec().readTree(p);
        if (! node.has("id")) return null;
        if (node.has("url")) {
            return new ActivityFile(node.get("id").asInt(), node.get("url").asText());
        }
        if (node.has("showUrl") && node.has("downloadUrl")) {
            return new BitrixCRMFile(node.get("id").asInt(), node.get("showUrl").asText(), node.get("downloadUrl").asText());
        }
        throw new BitrixException("no representation for file node " + node);
    }
}

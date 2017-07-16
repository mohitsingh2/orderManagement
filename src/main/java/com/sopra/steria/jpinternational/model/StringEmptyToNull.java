package com.sopra.steria.jpinternational.model;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;

class StringEmptyToNull extends JsonDeserializer<String> {

    @Override
    public String deserialize(JsonParser jsonParser, DeserializationContext context) throws IOException {
        String node = jsonParser.readValueAs(String.class);
        if (node.isEmpty()) {
            return null;
        }
        return node;
    }

}

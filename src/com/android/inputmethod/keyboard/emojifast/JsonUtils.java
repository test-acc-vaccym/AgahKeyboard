package com.android.inputmethod.keyboard.emojifast;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by sepehr on 2/2/17.
 */

public class JsonUtils {

    private static final ObjectMapper objectMapper = new ObjectMapper();

    static {
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
    }

    public static <T> T fromJson(String serialized, Class<T> clazz) throws IOException {
        return objectMapper.readValue(serialized, clazz);
    }

    public static <T> T fromJson(InputStreamReader serialized, Class<T> clazz) throws IOException {
        return objectMapper.readValue(serialized, clazz);
    }

    public static String toJson(Object object) throws IOException {
        return objectMapper.writeValueAsString(object);
    }

    public static ObjectMapper getMapper() {
        return objectMapper;
    }
}

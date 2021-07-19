/*
 * FispanComLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package cloud.fispan.dev1.models;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

/**
 * GrantTypeEnum to be used.
 */
public enum GrantTypeEnum {
    CLIENT_CREDENTIALS,

    PASSWORD;


    private static TreeMap<String, GrantTypeEnum> valueMap = new TreeMap<>();
    private String value;

    static {
        CLIENT_CREDENTIALS.value = "client_credentials";
        PASSWORD.value = "password";

        valueMap.put("client_credentials", CLIENT_CREDENTIALS);
        valueMap.put("password", PASSWORD);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     */
    @com.fasterxml.jackson.annotation.JsonCreator
    public static GrantTypeEnum fromString(String toConvert) {
        return valueMap.get(toConvert);
    }

    /**
     * Returns the string value associated with the enum member.
     * @return The string value against enum member.
     */
    @com.fasterxml.jackson.annotation.JsonValue
    public String value() {
        return value;
    }
        
    /**
     * Get string representation of this enum.
     */
    @Override
    public String toString() {
        return value.toString();
    }

    /**
     * Convert list of GrantTypeEnum values to list of string values.
     * @param toConvert The list of GrantTypeEnum values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<GrantTypeEnum> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (GrantTypeEnum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 
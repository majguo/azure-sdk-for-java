// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.textanalytics.implementation.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/** Defines values for ErrorCodeValue. */
public enum ErrorCodeValue {
    /** Enum value invalidRequest. */
    INVALID_REQUEST("invalidRequest"),

    /** Enum value invalidArgument. */
    INVALID_ARGUMENT("invalidArgument"),

    /** Enum value internalServerError. */
    INTERNAL_SERVER_ERROR("internalServerError"),

    /** Enum value serviceUnavailable. */
    SERVICE_UNAVAILABLE("serviceUnavailable");

    /** The actual serialized value for a ErrorCodeValue instance. */
    private final String value;

    ErrorCodeValue(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a ErrorCodeValue instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed ErrorCodeValue object, or null if unable to parse.
     */
    @JsonCreator
    public static ErrorCodeValue fromString(String value) {
        ErrorCodeValue[] items = ErrorCodeValue.values();
        for (ErrorCodeValue item : items) {
            if (item.toString().equalsIgnoreCase(value)) {
                return item;
            }
        }
        return null;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}

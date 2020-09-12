package com.af.msd.common.response.code;

import com.af.msd.common.response.Response;

public enum AddressResponse implements Response {

    RETRIEVE_PIN_CODES_FOR_CITY_SUCCESS(6001, "Pin codes for given city retrieved"),
    RETRIEVE_PIN_CODES_FOR_CITY_FAILURE( -6001, "Pin codes for given city are not available!"),

    ADDRESS_SAVED_SUCCESS(6002, "Address saved successfully"),
    ADDRESS_SAVED_FAILURE(-6002, "Somehow we are unable to save address! Please contact to our support team!");

    private int code;
    private String message;

    AddressResponse(int code, String message) { this.code = code;  this.message = message;}
    public int getCode() { return code; }
    public String getMessage() { return message; }
}

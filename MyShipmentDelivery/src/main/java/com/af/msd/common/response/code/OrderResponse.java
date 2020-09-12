package com.af.msd.common.response.code;

import com.af.msd.common.response.Response;

public enum OrderResponse implements Response {

    ORDER_TRACKING_PARAM_SUCCESS(5001, "Valid user"),
    ORDER_TRACKING_PARAM_FAILURE(-5001, "Please enter valid username and transaction pin"),

    PICKUP_ADDRESS_SUCCESS(5002, "Data for place order successfully retrieved"),
    PICKUP_ADDRESS_NOT_FOUND(-5002, "Invalid pickup address! Please select correct one!"),

    ORDER_PLACED_SUCCESS(5003, "Your order has been placed successfully"),
    ORDER_PLACED_FAILURE(-5003, "Error while placing an order! Please contact to our support team!"),

    ORDER_CANCELED_SUCCESS(5004,"Your order has been canceled successfully"),
    ORDER_CANCELED_FAILURE(-5004,"Error while canceling an order! Please contact to our support team!");

    private int code;
    private String message;

    OrderResponse(int code, String message) { this.code = code;  this.message = message;}
    public int getCode() { return code; }
    public String getMessage() { return message; }
}

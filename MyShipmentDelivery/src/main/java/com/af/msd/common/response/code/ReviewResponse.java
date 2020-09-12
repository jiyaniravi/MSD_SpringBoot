package com.af.msd.common.response.code;

import com.af.msd.common.response.Response;

public enum ReviewResponse implements Response {

    REVIEW_SAVED_SUCCESS(7001,"Review for this order saved successfully"),
    REVIEW_SAVED_FAILURE(-7001,"Review for this order does not saved");

    private int code;
    private String message;

    ReviewResponse(int code, String message) { this.code = code;  this.message = message;}
    public int getCode() { return code; }
    public String getMessage() { return message; }
}

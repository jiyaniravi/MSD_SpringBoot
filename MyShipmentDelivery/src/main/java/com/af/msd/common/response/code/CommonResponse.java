package com.af.msd.common.response.code;

import com.af.msd.common.response.Response;

public enum CommonResponse implements Response {

    SUCCESS(1,"success"),
    FAILURE(-1, "failure");

    private int code;
    private String message;

    CommonResponse(int code, String message) { this.code = code;  this.message = message;}
    public int getCode() { return code; }
    public String getMessage() { return message; }
}

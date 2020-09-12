package com.af.msd.common.response.code;

import com.af.msd.common.response.Response;

public enum DBResponse implements Response {

    RECORDS_FOUND(200, "Records found for given criteria"),
    RECORDS_NOT_FOUND(-200, "No records found for given criteria");

    private int code;
    private String message;

    DBResponse(int code, String message) { this.code = code;  this.message = message;}
    public int getCode() { return code; }
    public String getMessage() { return message; }
}

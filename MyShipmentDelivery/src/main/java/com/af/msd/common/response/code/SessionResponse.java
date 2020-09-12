package com.af.msd.common.response.code;

import com.af.msd.common.response.Response;

public enum SessionResponse implements Response {

    SESSION_VALID(300, "Valid Session Found"),
    SESSION_INVALID(-300, "Invalid session, Please login again to use service"),

    INIT_SESSION_SUCCESS(301, "Session initiated successfully"),
    INIT_SESSION_FAILURE(-301, "Error while initiating session! Please contact to system admin!"),

    CLEAR_SESSION_SUCCESS(302, "Session cleared successfully"),
    CLEAR_SESSION_FAILURE(-302, "Error while clearing session! Please contact to system admin!");

    private int code;
    private String message;

    SessionResponse(int code, String message) { this.code = code;  this.message = message;}
    public int getCode() { return code; }
    public String getMessage() { return message; }
}

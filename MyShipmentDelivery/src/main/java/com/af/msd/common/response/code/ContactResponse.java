package com.af.msd.common.response.code;

import com.af.msd.common.response.Response;

public enum ContactResponse implements Response {

    CONTACT_US_SUCCESS(4001,"Your query has been submitted successfully"),
    CONTACT_US_FAILURE(-4001,"Sorry! We are unable to contact you right now"),

    BRANCH_ADMIN_ONLINE(4002,"Branch admin is online"),
    BRANCH_ADMIN_OFFLINE(-4002, "Branch admin is offline! Please contact after few time!"),
    BRANCH_ADMIN_NOT_REACHABLE(-4002, "Error while contacting to branch admin! Please contact after few time!");

    private int code;
    private String message;

    ContactResponse(int code, String message) { this.code = code;  this.message = message;}
    public int getCode() { return code; }
    public String getMessage() { return message; }
}

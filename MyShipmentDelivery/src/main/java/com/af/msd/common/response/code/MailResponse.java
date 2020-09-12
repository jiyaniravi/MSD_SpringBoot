package com.af.msd.common.response.code;

import com.af.msd.common.response.Response;

public enum MailResponse implements Response {

    MAIL_SENT_SUCCESS(400, "Email sent successfully"),
    MAIL_SENT__FAILURE(-400, "Error while sending an email! Please contact to system admin!");

    private int code;
    private String message;

    MailResponse(int code, String message) { this.code = code;  this.message = message;}
    public int getCode() { return code; }
    public String getMessage() { return message; }
}

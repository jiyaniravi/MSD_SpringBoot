package com.af.msd.common.response.code;

import com.af.msd.common.response.Response;

public enum ModeratorResponse implements Response {

    MODERATOR_APPROVED_SUCCESS(2001, "Moderator approved successfully"),
    MODERATOR_APPROVED_FAILURE(-2001, "Error while approving moderator! Please contact to support team!"),

    MODERATOR_EDITED_SUCCESS(2002, "Moderator edited successfully"),
    MODERATOR_EDITED_FAILURE(-2002, "Error while editing moderator! Please contact to support team!"),

    MODERATOR_REMOVED_SUCCESS(2003, "Moderator removed successfully"),
    MODERATOR_REMOVED_FAILURE(-2003, "Error while removing moderator! Please contact to support team!");

    private int code;
    private String message;

    ModeratorResponse(int code, String message) { this.code = code;  this.message = message;}
    public int getCode() { return code; }
    public String getMessage() { return message; }
}

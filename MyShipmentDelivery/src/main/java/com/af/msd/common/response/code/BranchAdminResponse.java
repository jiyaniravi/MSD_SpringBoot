package com.af.msd.common.response.code;

import com.af.msd.common.response.Response;

public enum BranchAdminResponse implements Response {

    BRANCH_ADMIN_EDITED_SUCCESS(3001, "Branch Admin edited successfully"),
    BRANCH_ADMIN_EDITED_FAILURE(-3001, "Error while editing Branch Admin! Please contact to support team!"),

    BRANCH_ADMIN_REMOVED_SUCCESS(3002, "Branch Admin removed successfully"),
    BRANCH_ADMIN_REMOVED_FAILURE(-3002, "Error while removing Branch Admin! Please contact to support team!");

    private int code;
    private String message;

    BranchAdminResponse(int code, String message) { this.code = code;  this.message = message;}
    public int getCode() { return code; }
    public String getMessage() { return message; }
}

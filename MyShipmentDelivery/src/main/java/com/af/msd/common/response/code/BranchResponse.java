package com.af.msd.common.response.code;

import com.af.msd.common.response.Response;

public enum BranchResponse implements Response {

    BRANCH_CREATED_SUCCESS(8001,"Branch created successfully"),
    BRANCH_CREATED_FAILURE(-8001,"Error while creating branch! Please contact to our support team!"),

    BRANCH_DELETED_SUCCESS(8002,"Branch deleted successfully"),
    BRANCH_DELETED_FAILURE(-8002,"Error while deleting branch! Please contact to our support team!"),

    BRANCH_EDITED_SUCCESS(8003,"Branch edited successfully"),
    BRANCH_EDITED_FAILURE(-8003,"Error while editing branch! Please contact to our support team!");

    private int code;
    private String message;

    BranchResponse(int code, String message) { this.code = code;  this.message = message;}
    public int getCode() { return code; }
    public String getMessage() { return message; }
}

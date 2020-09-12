package com.af.msd.common.response.code;

import com.af.msd.common.response.Response;

public enum UserResponse implements Response {

    USER_REGISTERED(1001, "Your registration done successfully"),
    USER_ALREADY_EXIST(-1001, "User already exists! Please enter another user name!"),
    EMAIL_ID_ALREADY_EXIST(-1001, "Email Id is already registered! Please enter new email id!"),

    LOGIN_SUCCESS(1002, "Login success"),
    LOGIN_FAILURE(-1002, "Please enter correct username and password!"),

    FORGOT_PASSWORD_SUCCESS(1003,"An e-mail has been sent to you with new password"),
    FORGOT_PASSWORD_FAILURE(-1003, "Please enter valid user name or email id!"),

    RESET_PASSWORD_LINK_SUCCESS(1004, "An e-mail has been sent to you to reset your password"),
    RESET_PASSWORD_LINK_FAILURE(-1004, "Sorry, We are unable to proceed your request right now"),

    RESET_PASSWORD_SUCCESS(1005, "Your password has been updated successfully"),
    RESET_PASSWORD_FAILURE(1005, "Sorry, We are unable to unable your password"),
    RESET_PASSWORD_LINK_EXPIRED(-1005, "Link has been expired!"),
    RESET_PASSWORD_INVALID_PARAM(-1005, "Invalid User Name and Token!"),

    VALID_USER_PROFILE(1006, "Valid user profile found"),
    INVALID_USER_PROFILE(-1006, "Error while retrieving user profile"),

    USER_PROFILE_SAVED(1007, "User profile saved successfully"),
    USER_PROFILE_SAVE_FAILURE(-1007, "Error while saving user profile!"),

    USER_EDITED_SUCCESS(1008, "User edited successfully"),
    USER_EDITED_FAILURE(-1008, "Error while editing user! Please contact to support team!"),

    USER_REMOVED_SUCCESS(1009, "User removed successfully"),
    USER_REMOVED_FAILURE(-1009, "Error while removing user! Please contact to support team!");

    private int code;
    private String message;

    UserResponse(int code, String message) { this.code  = code;  this.message = message;}
    public int getCode() { return code; }
    public String getMessage() { return message; }
}

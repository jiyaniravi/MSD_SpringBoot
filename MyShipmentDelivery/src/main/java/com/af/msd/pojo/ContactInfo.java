package com.af.msd.pojo;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Objects;
import java.util.StringJoiner;

public class ContactInfo implements Serializable {

    protected static final long serialVersionUID = 90130107005L;

    private int contactId;
    private String name;
    private String emailId;
    private String phoneNumber;
    private String message;
    private int userId;
    private byte isSubscribed;
    private Timestamp contactDate;

    public int getContactId() {
        return contactId;
    }

    public String getName() {
        return name;
    }

    public String getEmailId() {
        return emailId;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getMessage() {
        return message;
    }

    public int getUserId() {
        return userId;
    }

    public byte getIsSubscribed() {
        return isSubscribed;
    }

    public Timestamp getContactDate() {
        return contactDate;
    }

    public ContactInfo withContactId(int contactId) {
        this.contactId = contactId;
        return this;
    }

    public ContactInfo withName(String name) {
        this.name = name;
        return this;
    }

    public ContactInfo withEmailId(String emailId) {
        this.emailId = emailId;
        return this;
    }

    public ContactInfo withPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public ContactInfo withMessage(String message) {
        this.message = message;
        return this;
    }

    public ContactInfo withUserId(int userId) {
        this.userId = userId;
        return this;
    }

    public ContactInfo withIsSubscribed(byte isSubscribed) {
        this.isSubscribed = isSubscribed;
        return this;
    }

    public ContactInfo withContactDate(Timestamp contactDate) {
        this.contactDate = contactDate;
        return this;
    }

    public ContactInfo build(){
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ContactInfo)) return false;
        ContactInfo that = (ContactInfo) o;
        return getContactId() == that.getContactId() &&
                getUserId() == that.getUserId() &&
                getEmailId().equals(that.getEmailId()) &&
                Objects.equals(getPhoneNumber(), that.getPhoneNumber()) &&
                getMessage().equals(that.getMessage());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getContactId(), getEmailId(), getPhoneNumber(), getMessage(), getUserId());
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", ContactInfo.class.getSimpleName() + "[", "]")
                .add("contactId=" + contactId)
                .add("name='" + name + "'")
                .add("emailId='" + emailId + "'")
                .add("phoneNumber='" + phoneNumber + "'")
                .add("message='" + message + "'")
                .add("userId=" + userId)
                .add("isSubscribed=" + isSubscribed)
                .add("contactDate=" + contactDate)
                .toString();
    }
}

package com.af.msd.pojo;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Objects;
import java.util.StringJoiner;

public class User implements Serializable {

    protected static final long serialVersionUID = 90130107005L;

    private int userId;
    private int roleId;
    private String userName;
    private String password;
    private String mobileNumber;
    private String emailId;
    private char gender;
    private Timestamp dateOfBirth;
    private String imageURL;
    private String firstName;
    private String lastName;
    private byte userStatus;
    private Timestamp creationDate;
    private Timestamp updationDate;
    private int createdBy;
    private int updatedBy;
    private String forgotPasswordLink;
    private Timestamp fpLinkUpdationTime;

    public int getUserId() {
        return userId;
    }

    public int getRoleId() {
        return roleId;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public String getEmailId() {
        return emailId;
    }

    public char getGender() {
        return gender;
    }

    public Timestamp getDateOfBirth() {
        return dateOfBirth;
    }

    public String getImageURL() {
        return imageURL;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public byte getUserStatus() {
        return userStatus;
    }

    public Timestamp getCreationDate() {
        return creationDate;
    }

    public Timestamp getUpdationDate() {
        return updationDate;
    }

    public int getCreatedBy() {
        return createdBy;
    }

    public int getUpdatedBy() {
        return updatedBy;
    }

    public String getForgotPasswordLink() {
        return forgotPasswordLink;
    }

    public Timestamp getFpLinkUpdationTime() {
        return fpLinkUpdationTime;
    }

    public User withUserId(int userId) {
        this.userId = userId;
        return this;
    }

    public User withRoleId(int roleId) {
        this.roleId = roleId;
        return this;
    }

    public User withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    public User withPassword(String password) {
        this.password = password;
        return this;
    }

    public User withMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
        return this;
    }

    public User withEmailId(String emailId) {
        this.emailId = emailId;
        return this;
    }

    public User withGender(char gender) {
        this.gender = gender;
        return this;
    }

    public User withDateOfBirth(Timestamp dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
        return this;
    }

    public User withImageURL(String imageURL) {
        this.imageURL = imageURL;
        return this;
    }

    public User withFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public User withLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public User withUserStatus(byte userStatus) {
        this.userStatus = userStatus;
        return this;
    }

    public User withCreationDate(Timestamp creationDate) {
        this.creationDate = creationDate;
        return this;
    }

    public User withUpdationDate(Timestamp updationDate) {
        this.updationDate = updationDate;
        return this;
    }

    public User withCreatedBy(int createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    public User withUpdatedBy(int updatedBy) {
        this.updatedBy = updatedBy;
        return this;
    }

    public User withForgotPasswordLink(String forgotPasswordLink) {
        this.forgotPasswordLink = forgotPasswordLink;
        return this;
    }

    public User withFpLinkUpdationTime(Timestamp fpLinkUpdationTime) {
        this.fpLinkUpdationTime = fpLinkUpdationTime;
        return this;
    }

    public User build(){
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        User user = (User) o;
        return getUserId() == user.getUserId() &&
                getRoleId() == user.getRoleId() &&
                getGender() == user.getGender() &&
                getUserStatus() == user.getUserStatus() &&
                getUserName().equals(user.getUserName()) &&
                getEmailId().equals(user.getEmailId()) &&
                getDateOfBirth().equals(user.getDateOfBirth());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getUserId(), getRoleId(), getUserName(), getEmailId(), getGender(), getDateOfBirth(), getUserStatus());
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", User.class.getSimpleName() + "[", "]")
                .add("userId=" + userId)
                .add("roleId=" + roleId)
                .add("userName='" + userName + "'")
                .add("mobileNumber='" + mobileNumber + "'")
                .add("emailId='" + emailId + "'")
                .add("gender=" + gender)
                .add("dateOfBirth=" + dateOfBirth)
                .add("firstName='" + firstName + "'")
                .add("lastName='" + lastName + "'")
                .add("userStatus=" + userStatus)
                .add("creationDate=" + creationDate)
                .add("updationDate=" + updationDate)
                .add("createdBy=" + createdBy)
                .add("updatedBy=" + updatedBy)
                .toString();
    }
}

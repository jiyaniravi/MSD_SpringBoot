package com.af.msd.pojo;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Objects;
import java.util.StringJoiner;

public class Address implements Serializable {

    protected static final long serialVersionUID = 90130107005L;

    private int addressId;
    private int userId;
    private int orderId;
    private String addressLine1;
    private String addressLine2;
    private int pinCode;
    private String city;
    private String state;
    private String country;
    private int addressType;
    private float latitude;
    private float longitude;
    private byte currentAddress;
    private Timestamp creationDate;
    private Timestamp updationDate;
    private int createdBy;
    private int updatedBy;

    public int getAddressId() {
        return addressId;
    }

    public int getUserId() {
        return userId;
    }

    public int getOrderId() {
        return orderId;
    }

    public String getAddressLine1() {
        return addressLine1;
    }

    public String getAddressLine2() {
        return addressLine2;
    }

    public int getPinCode() {
        return pinCode;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getCountry() {
        return country;
    }

    public int getAddressType() {
        return addressType;
    }

    public float getLatitude() {
        return latitude;
    }

    public float getLongitude() {
        return longitude;
    }

    public byte getCurrentAddress() {
        return currentAddress;
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

    public Address withAddressId(int addressId){
        this.addressId = addressId;
        return this;
    }

    public Address withUserId(int userId){
        this.userId = userId;
        return this;
    }

    public Address withOrderId(int orderId){
        this.orderId = orderId;
        return this;
    }

    public Address withAddressLine1(String addressLine1){
        this.addressLine1 = addressLine1;
        return this;
    }

    public Address withAddressLine2(String addressLine2){
        this.addressLine2 = addressLine2;
        return this;
    }

    public Address withPinCode(int pinCode){
        this.pinCode = pinCode;
        return this;
    }

    public Address withCity(String city){
        this.city = city;
        return this;
    }

    public Address withState(String state){
        this.state = state;
        return this;
    }

    public Address withCountry(String country){
        this.country = country;
        return this;
    }

    public Address withAddressType(int addressType){
        this.addressType = addressType;
        return this;
    }

    public Address withLatitude(float latitude){
        this.latitude = latitude;
        return this;
    }

    public Address withLongitude(float longitude){
        this.longitude = longitude;
        return this;
    }

    public Address withCurrentAddress(byte currentAddress){
        this.currentAddress = currentAddress;
        return this;
    }

    public Address withCreationDate(Timestamp creationDate){
        this.creationDate = creationDate;
        return this;
    }

    public Address withUpdationDate(Timestamp updationDate){
        this.updationDate = updationDate;
        return this;
    }

    public Address withCreatedBy(int createdBy){
        this.createdBy = createdBy;
        return this;
    }

    public Address withUpdatedBy(int updatedBy){
        this.updatedBy = updatedBy;
        return this;
    }

    public Address build(){
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Address)) return false;
        Address address = (Address) o;
        return getAddressId() == address.getAddressId() &&
                getUserId() == address.getUserId() &&
                getPinCode() == address.getPinCode() &&
                Float.compare(address.getLatitude(), getLatitude()) == 0 &&
                Float.compare(address.getLongitude(), getLongitude()) == 0 &&
                getCurrentAddress() == address.getCurrentAddress() &&
                getAddressLine1().equals(address.getAddressLine1()) &&
                Objects.equals(getAddressLine2(), address.getAddressLine2()) &&
                getCity().equals(address.getCity()) &&
                getState().equals(address.getState()) &&
                getCountry().equals(address.getCountry());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getAddressId(), getUserId(), getAddressLine1(), getAddressLine2(), getPinCode(), getCity(), getState(), getCountry(), getLatitude(), getLongitude(), getCurrentAddress());
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Address.class.getSimpleName() + "[", "]")
                .add("addressId=" + addressId)
                .add("userId=" + userId)
                .add("orderId=" + orderId)
                .add("addressLine1='" + addressLine1 + "'")
                .add("addressLine2='" + addressLine2 + "'")
                .add("pinCode=" + pinCode)
                .add("city='" + city + "'")
                .add("state='" + state + "'")
                .add("country='" + country + "'")
                .add("addressType=" + addressType)
                .add("latitude=" + latitude)
                .add("longitude=" + longitude)
                .add("currentAddress=" + currentAddress)
                .add("creationDate=" + creationDate)
                .add("updationDate=" + updationDate)
                .add("createdBy=" + createdBy)
                .add("updatedBy=" + updatedBy)
                .toString();
    }
}

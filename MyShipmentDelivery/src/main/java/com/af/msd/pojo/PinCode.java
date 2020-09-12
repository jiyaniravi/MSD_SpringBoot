package com.af.msd.pojo;

import java.io.Serializable;
import java.util.Objects;
import java.util.StringJoiner;

public class PinCode implements Serializable {

    protected static final long serialVersionUID = 90130107005L;

    private int pinCodeId;
    private int cityId;
    private int pinCode;
    private String area;

    public int getPinCodeId() {
        return pinCodeId;
    }

    public int getCityId() {
        return cityId;
    }

    public int getPinCode() {
        return pinCode;
    }

    public String getArea() {
        return area;
    }

    public PinCode withPinCodeId(int pinCodeId) {
        this.pinCodeId = pinCodeId;
        return this;
    }

    public PinCode withCityId(int cityId) {
        this.cityId = cityId;
        return this;
    }

    public PinCode withPinCode(int pinCode) {
        this.pinCode = pinCode;
        return this;
    }

    public PinCode withArea(String area) {
        this.area = area;
        return this;
    }

    public PinCode build(){
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PinCode)) return false;
        PinCode pinCode1 = (PinCode) o;
        return getPinCodeId() == pinCode1.getPinCodeId() &&
                getCityId() == pinCode1.getCityId() &&
                getPinCode() == pinCode1.getPinCode() &&
                getArea().equals(pinCode1.getArea());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPinCodeId(), getCityId(), getPinCode(), getArea());
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", PinCode.class.getSimpleName() + "[", "]")
                .add("pinCodeId=" + pinCodeId)
                .add("cityId=" + cityId)
                .add("pinCode=" + pinCode)
                .add("area='" + area + "'")
                .toString();
    }
}

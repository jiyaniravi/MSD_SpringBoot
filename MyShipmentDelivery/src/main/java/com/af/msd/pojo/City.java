package com.af.msd.pojo;

import java.io.Serializable;
import java.util.Objects;
import java.util.StringJoiner;

public class City implements Serializable {

    protected static final long serialVersionUID = 90130107005L;

    private int cityId;
    private int stateId;
    private String cityName;

    public int getCityId() {
        return cityId;
    }

    public int getStateId() {
        return stateId;
    }

    public String getCityName() {
        return cityName;
    }

    public City withCityId(int cityId) {
        this.cityId = cityId;
        return this;
    }

    public City withStateId(int stateId) {
        this.stateId = stateId;
        return this;
    }

    public City withCityName(String cityName) {
        this.cityName = cityName;
        return this;
    }

    public City build(){
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof City)) return false;
        City city = (City) o;
        return getCityId() == city.getCityId() &&
                getStateId() == city.getStateId() &&
                getCityName().equals(city.getCityName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCityId(), getStateId(), getCityName());
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", City.class.getSimpleName() + "[", "]")
                .add("cityId=" + cityId)
                .add("stateId=" + stateId)
                .add("cityName='" + cityName + "'")
                .toString();
    }
}

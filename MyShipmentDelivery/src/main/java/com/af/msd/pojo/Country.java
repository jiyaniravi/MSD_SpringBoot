package com.af.msd.pojo;

import java.io.Serializable;
import java.util.Objects;
import java.util.StringJoiner;

public class Country implements Serializable {

    protected static final long serialVersionUID = 90130107005L;

    private int countryId;
    private String countryName;

    public int getCountryId() {
        return countryId;
    }

    public String getCountryName() {
        return countryName;
    }

    public Country withCountryId(int countryId) {
        this.countryId = countryId;
        return this;
    }

    public Country withCountryName(String countryName) {
        this.countryName = countryName;
        return this;
    }

    public Country build(){
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Country)) return false;
        Country country = (Country) o;
        return getCountryId() == country.getCountryId() &&
                getCountryName().equals(country.getCountryName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCountryId(), getCountryName());
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Country.class.getSimpleName() + "[", "]")
                .add("countryId=" + countryId)
                .add("countryName='" + countryName + "'")
                .toString();
    }
}

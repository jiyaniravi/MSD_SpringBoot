package com.af.msd.pojo;

import java.io.Serializable;
import java.util.Objects;
import java.util.StringJoiner;

public class State implements Serializable {

    protected static final long serialVersionUID = 90130107005L;

    private int stateId;
    private int countryId;
    private String stateName;

    public int getStateId() {
        return stateId;
    }

    public int getCountryId() {
        return countryId;
    }

    public String getStateName() {
        return stateName;
    }

    public State withStateId(int stateId) {
        this.stateId = stateId;
        return this;
    }

    public State withCountryId(int countryId) {
        this.countryId = countryId;
        return this;
    }

    public State withStateName(String stateName) {
        this.stateName = stateName;
        return this;
    }

    public State build(){
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof State)) return false;
        State state = (State) o;
        return getStateId() == state.getStateId() &&
                getCountryId() == state.getCountryId() &&
                getStateName().equals(state.getStateName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getStateId(), getCountryId(), getStateName());
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", State.class.getSimpleName() + "[", "]")
                .add("stateId=" + stateId)
                .add("countryId=" + countryId)
                .add("stateName='" + stateName + "'")
                .toString();
    }
}

package com.af.msd.pojo;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Objects;
import java.util.StringJoiner;

public class Branch implements Serializable {

    protected static final long serialVersionUID = 90130107005L;

    private int branchId;
    private int branchAdminId;
    private int addressId;
    private String branchName;
    private byte branchStatus;
    private Timestamp creationDate;
    private Timestamp updationDate;
    private int createdBy;
    private int updatedBy;

    public int getBranchId() {
        return branchId;
    }

    public int getBranchAdminId() {
        return branchAdminId;
    }

    public int getAddressId() {
        return addressId;
    }

    public String getBranchName() {
        return branchName;
    }

    public byte getBranchStatus() {
        return branchStatus;
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

    public Branch withBranchId(int branchId) {
        this.branchId = branchId;
        return this;
    }

    public Branch withBranchAdminId(int branchAdminId) {
        this.branchAdminId = branchAdminId;
        return this;
    }

    public Branch withAddressId(int addressId) {
        this.addressId = addressId;
        return this;
    }

    public Branch withBranchName(String branchName) {
        this.branchName = branchName;
        return this;
    }

    public Branch withBranchStatus(byte branchStatus) {
        this.branchStatus = branchStatus;
        return this;
    }

    public Branch withCreationDate(Timestamp creationDate) {
        this.creationDate = creationDate;
        return this;
    }

    public Branch withUpdationDate(Timestamp updationDate) {
        this.updationDate = updationDate;
        return this;
    }

    public Branch withCreatedBy(int createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    public Branch withUpdatedBy(int updatedBy) {
        this.updatedBy = updatedBy;
        return this;
    }

    public Branch build(){
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Branch)) return false;
        Branch branch = (Branch) o;
        return getBranchId() == branch.getBranchId() &&
                getAddressId() == branch.getAddressId() &&
                getBranchStatus() == branch.getBranchStatus() &&
                getBranchName().equals(branch.getBranchName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getBranchId(), getAddressId(), getBranchName(), getBranchStatus());
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Branch.class.getSimpleName() + "[", "]")
                .add("branchId=" + branchId)
                .add("branchAdminId=" + branchAdminId)
                .add("addressId=" + addressId)
                .add("branchName='" + branchName + "'")
                .add("branchStatus=" + branchStatus)
                .add("creationDate=" + creationDate)
                .add("updationDate=" + updationDate)
                .add("createdBy=" + createdBy)
                .add("updatedBy=" + updatedBy)
                .toString();
    }
}

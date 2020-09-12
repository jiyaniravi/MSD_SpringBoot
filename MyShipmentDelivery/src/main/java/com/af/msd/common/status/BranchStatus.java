package com.af.msd.common.status;

public enum BranchStatus {
    INACTIVE(0),
    ACTIVE(1),
    REMOVED(2);

    private int status;

    BranchStatus(int status) {
        this.status = status;
    }

    public int getStatus() {
        return status;
    }
}

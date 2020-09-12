package com.af.msd.common.status;

import java.util.Arrays;

public enum UserStatus {
    UNKNOWN(-1),
    ACTIVE(0),
    PENDING(1),
    INACTIVE(2),
    REMOVED(4);

    private byte status;

    UserStatus(int status) {
        this.status = (byte)status;
    }

    public String getBy(int status){
        return Arrays.stream(UserStatus.values())
                                    .filter(x -> x.status == status)
                                        .findFirst()
                                            .map(x -> x.name()).get();
    }
}

package com.af.msd.common.status;

import java.util.Arrays;

public enum OrderStatus {
    UNKNOWN(-1),
    INITIATED(0),
    PENDING(1),
    DELIVERED(2),
    CANCELED(3);

    private byte status;

    OrderStatus(int status) {
        this.status = (byte)status;
    }

    public String getBy(int status){
        return Arrays.stream(OrderStatus.values())
                    .filter(x -> x.status == status)
                        .findFirst()
                            .map(x -> x.name()).get();
    }
}

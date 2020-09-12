package com.af.msd.common.type;

import java.util.Arrays;

public enum AddressType {
    UNKNOWN(-1),
    HOME(0),
    OFFICE(1),
    BRANCH(2),
    PICKUP(3),
    MEDIATOR(4),
    DELIVERY(5);

    private byte type;

    AddressType(int type) {
        this.type = (byte)type;
    }

    public String get(){
        return this.name()+"_ADDRESS";
    }

    public String getBy(int type){
        return Arrays.stream(AddressType.values())
                    .filter(x -> x.type == type)
                        .findFirst()
                            .map(x -> x.name()+"_ADDRESS").get();
    }

    public int getType() {
        return type;
    }
}

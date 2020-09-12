package com.af.msd.common.type;

import java.util.Arrays;

public enum ChatWith {
    UNKNOWN(-1),
    ADMIN(0),
    BRANCH_ADMIN(1),
    MODERATOR(2),
    USER(3),
    ANONYMOUS(4);

    private byte type;

    ChatWith(int type) {
        this.type = (byte)type;
    }

    public String get(){
        return "TO_"+this.name();
    }

    public String getBy(int type){
        return Arrays.stream(ChatWith.values())
                                    .filter(x -> x.type==type)
                                        .findFirst()
                                            .map(x -> "TO_"+x.name()).get();
    }
}

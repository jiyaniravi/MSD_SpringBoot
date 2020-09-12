package com.af.msd.common.type;

import java.util.Arrays;

public enum Gender {
    MALE('M'),
    FEMALE('F'),
    OTHER('O');

    private char type;

    Gender(char type) {
        this.type = type;
    }

    public String getBy(char type){
        return Arrays.stream(Gender.values())
                        .filter(x -> x.type == type)
                            .findFirst()
                                .map(x -> x.name()).get();
    }
}

package com.af.msd.common.response;

import java.io.Serializable;

public interface Response extends Serializable {

    long serialVersionUID = 90130107005L;

    int getCode();
    String getMessage();
}

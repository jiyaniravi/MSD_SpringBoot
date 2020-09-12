package com.af.msd.common.response;

import java.util.List;

public class MSDResponse {
    private int code;
    private String message;
    private Object response;
    private List<MSDResponse> responseList;

    public MSDResponse() {}

    public MSDResponse(Response response) {
        this.code = response.getCode();
        this.message = response.getMessage();
    }

    public int getCode() {
        return code;
    }

    public MSDResponse withCode(int code) {
        this.code = code;
        return this;
    }

     public String getMessage() {
        return message;
    }

    public MSDResponse withMessage(String message) {
        this.message = message;
        return this;
    }

    public Object getResponse() {
        return response;
    }

    public MSDResponse withResponse(Object response) {
        this.response = response;
        return this;
    }

    public List<MSDResponse> getResponseList() {
        return responseList;
    }

    public MSDResponse withResponseList(List<MSDResponse> responseList) {
        this.responseList = responseList;
        return this;
    }

    public MSDResponse build(){
        return this;
    }
}

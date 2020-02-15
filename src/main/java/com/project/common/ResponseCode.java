package com.project.common;

public enum ResponseCode {
    SUCCESS(0, "success"),
    ERROR(-1, "error"),
    NEED_LOGIN(1, "access defined"),
    BAD_REQUEST(2, "illegal arguments");


    private final Integer code;
    private final String message;

    ResponseCode(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}

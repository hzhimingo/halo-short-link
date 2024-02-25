package com.hzhimingo.halo.common.enums;

/**
 * 统一业务异常枚举类
 */
public enum BizCode {
    ;

    private final String code;

    private final String msg;

    BizCode(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}

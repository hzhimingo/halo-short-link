package com.hzhimingo.halo.common.exception;

import com.hzhimingo.halo.common.enums.BizCode;

/**
 * 统一业务异常
 */
public class BizException extends RuntimeException {

    private final String code;

    private final String msg;

    public BizException(String code, String msg) {
        super(msg);
        this.code = code;
        this.msg = msg;
    }

    public BizException(BizCode bizCode) {
        super(bizCode.getMsg());
        this.code = bizCode.getCode();
        this.msg = bizCode.getMsg();
    }

    public String getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}

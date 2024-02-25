package com.hzhimingo.halo.common.valueobject;

import com.hzhimingo.halo.common.enums.BizCode;

public class JSONResult<T> {

    public static final String SUCCESS_CODE = "0";

    public static final String SUCCESS_MSG = "OK";

    public static final String SYSTEM_ERROR_CODE = "-1";

    public static final String SYSTEM_ERROR_MSG = "系统异常，请联系管理员";

    /**
     * 业务是否成功
     */
    private boolean success;

    /**
     * 业务响应码
     */
    private String code;

    /**
     * 业务错误信息
     */
    private String msg;

    /**
     * 业务数据
     */
    private T data;

    public JSONResult(Boolean success, String code, String msg, T data) {
        this.success = success;
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public static <T> JSONResult<T> success() {
        return new JSONResult<>(true, SUCCESS_CODE, SUCCESS_MSG, null);
    }

    public static <T> JSONResult<T> success(T data) {
        return new JSONResult<>(true, SUCCESS_CODE, SUCCESS_MSG, data);
    }

    public static <T> JSONResult<T> success(String code, String msg, T data) {
        return new JSONResult<>(true, code, msg, data);
    }

    public static <T> JSONResult<T> bizFail(String code, String msg) {
        return new JSONResult<>(false, code, msg, null);
    }

    public static <T> JSONResult<T> bizFail(BizCode bizCode) {
        return new JSONResult<>(false, bizCode.getCode(), bizCode.getMsg(), null);
    }

    public static <T> JSONResult<T> systemFail() {
        return new JSONResult<>(false, SYSTEM_ERROR_CODE, SYSTEM_ERROR_MSG, null);
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}

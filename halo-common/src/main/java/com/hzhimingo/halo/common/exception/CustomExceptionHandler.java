package com.hzhimingo.halo.common.exception;

import com.hzhimingo.halo.common.valueobject.JSONResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class CustomExceptionHandler {

    private static final Logger log = LoggerFactory.getLogger(CustomExceptionHandler.class);

    @ExceptionHandler(BizException.class)
    public JSONResult<?> handleBizException(BizException e) {
        log.info("业务异常, 错误码: {}, 错误信息: {}", e.getCode(), e.getMsg());
        return JSONResult.bizFail(e.getCode(), e.getMsg());
    }

    @ExceptionHandler(Exception.class)
    public JSONResult<?> handleException(Exception e) {
        log.error("系统异常: {}", e.getLocalizedMessage(), e);
        return JSONResult.systemFail();
    }

}
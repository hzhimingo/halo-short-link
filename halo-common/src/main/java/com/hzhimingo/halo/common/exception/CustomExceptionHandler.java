package com.hzhimingo.halo.common.exception;

import com.hzhimingo.halo.common.valueobject.JSONResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@Slf4j
@RestControllerAdvice
public class CustomExceptionHandler {

    @ExceptionHandler(BizException.class)
    public JSONResult<?> handleBizException(BizException e) {
        log.info("[业务异常, 错误码: {}, 错误信息: {}", e.getCode(), e.getMsg());
        return JSONResult.bizFail(e.getCode(), e.getMsg());
    }

    @ExceptionHandler(Exception.class)
    public JSONResult<?> handleException(Exception e) {
        log.error("[]");
        return JSONResult.systemFail();
    }

}

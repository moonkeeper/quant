/*
 * Copyright 2024  megance-quant , Inc. All rights reserved.
 */

package com.megance.quant.app.common.component.api;

import com.megance.quant.common.api.ApiResult;
import com.megance.quant.domain.common.errorcode.SystemErrorCode;
import org.springframework.http.HttpStatus;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.validation.ConstraintViolationException;

/**
 * @program: quant
 * @classname: WebApiParamExceptionHandler
 * @package: com.megance.quant.common.api
 * @description: web api param exception advice handler
 * @author: linus
 * @create: 2024-06-26 00:38
 **/
@RestControllerAdvice
public class WebApiParamExceptionHandler {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ApiResult handleMethodArgumentNotValidException(MethodArgumentNotValidException ex) {
        BindingResult bindingResult = ex.getBindingResult();
        StringBuilder sb = new StringBuilder("校验失败:");
        for (FieldError fieldError : bindingResult.getFieldErrors()) {
            sb.append(fieldError.getField()).append("：").append(fieldError.getDefaultMessage()).append(", ");
        }
        String msg = sb.toString();
        return ApiResult.fail(SystemErrorCode.PARAM_ILLEGAL.getCode(),msg);
    }

    @ExceptionHandler({ConstraintViolationException.class})
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ApiResult handleConstraintViolationException(ConstraintViolationException ex) {
        return ApiResult.fail(SystemErrorCode.PARAM_ILLEGAL.getCode(), ex.getMessage());
    }
}

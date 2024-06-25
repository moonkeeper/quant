/*
 * Copyright 2024  megance-quant , Inc. All rights reserved.
 */

package com.megance.quant.common.api;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ApiResult<T> {

    private String code;
    private String msg;
    private boolean success = true;
    private T data;

    public ApiResult() {
    }

    public ApiResult(boolean success, String code, String msg) {
        this.success = success;
        this.code = code;
        this.msg = msg;
    }

    public ApiResult(boolean success, String code, String msg, T data) {
        this.success = success;
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public static ApiResult fail(String code, String msg) {
        return ApiResult.builder().success(true).code(code).msg(msg).build();
    }
}

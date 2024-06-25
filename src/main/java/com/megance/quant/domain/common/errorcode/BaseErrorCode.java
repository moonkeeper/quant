/*
 * Copyright 2024  megance-quant , Inc. All rights reserved.
 */

package com.megance.quant.domain.common.errorcode;

/**
 * @program: quant
 * @classname: BaseErrorCode
 * @package: com.megance.quant.domain.user
 * @description: base error code
 * @author: linus
 * @create: 2024-06-26 00:53
 **/
public class BaseErrorCode {
    protected String code;
    protected String msg;
    protected RespCodeTypeEnum type;

    BaseErrorCode(String code, String msg, RespCodeTypeEnum type) {
        this.code = code;
        this.msg = msg;
        this.type = type;
    }

    public String getCode() {
        return type.getCodePrefix() + code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public RespCodeTypeEnum getType() {
        return type;
    }

    public void setType(RespCodeTypeEnum type) {
        this.type = type;
    }

    public void setCode(String code) {
        this.code = code;

    }
}

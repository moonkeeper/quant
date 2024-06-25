/*
 * Copyright 2024  megance-quant , Inc. All rights reserved.
 */

package com.megance.quant.domain.common.errorcode;

/**
 * @program: quant
 * @classname: SystemErrorCode
 * @package: com.megance.quant.domain.common.errorcode
 * @description: system error code
 * @author: linus
 * @create: 2024-06-26 00:57
 **/
public class SystemErrorCode extends BaseErrorCode {
    SystemErrorCode(String code, String msg) {
        super(code, msg, RespCodeTypeEnum.SYSTEM);
    }

    public static SystemErrorCode PARAM_ILLEGAL = new SystemErrorCode("00001", "参数非法");
    public static SystemErrorCode SYSTEM_ERR = new SystemErrorCode("00002", "系统异常");
    public static SystemErrorCode ACCESS_FORBIDDEN = new SystemErrorCode("00003", "访问受限");
}

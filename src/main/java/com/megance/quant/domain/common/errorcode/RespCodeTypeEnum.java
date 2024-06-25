/*
 * Copyright 2024  megance-quant , Inc. All rights reserved.
 */

package com.megance.quant.domain.common.errorcode;

/**
 * @program: quant
 * @classname: RespCodeTypeEnum
 * @package: com.megance.quant.domain.common.errorcode
 * @description:
 * @author: linus
 * @create: 2024-06-26 00:55
 **/
public enum RespCodeTypeEnum {
    SYSTEM("00"),
    USER("01"),
    AD("02"),
    ORDER("03"),
    FUND("04"),
    DEPOSIT("05"),
    WITHDRAW("06"),
    AUTHCODE("07"),
    UPLOAD("08");
    private String codePrefix;

    RespCodeTypeEnum(String codePrefix) {
        this.codePrefix = codePrefix;
    }
    public String getCodePrefix() {
        return codePrefix;
    }
    public void setCodePrefix(String codePrefix) {
        this.codePrefix = codePrefix;
    }
}

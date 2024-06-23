/*
 * Copyright 2024  megance-quant , Inc. All rights reserved.
 */

package com.megance.quant.domain.user.enums;

/**
 * @program: quant
 * @classname: UserTokenConstant
 * @package: com.megance.quant.domain.user.enums
 * @description: user token constant
 * @author: linus
 * @create: 2024-06-20 22:59
 **/
public class UserTokenConstant {
    //Authorization名称
    public final static String REQ_HEADER_AUTHORIZATION = "Authorization";
    //Authorization值的前缀名称
    public final static String REQ_HEADER_AUTH_BEARER = "Bearer";
    //一个空格
    public final static String BLANK = " ";
    //Authorization值的前缀
    public final static String REQ_HEADER_AUTH_BEARER_BLANK = REQ_HEADER_AUTH_BEARER + BLANK;
}

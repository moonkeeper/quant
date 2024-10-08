/*
 * Copyright 2024  megance-quant , Inc. All rights reserved.
 */

package com.megance.quant.application.user.processor;

import com.megance.quant.application.user.request.RegisterReq;
import com.megance.quant.common.api.ApiResult;
import com.megance.quant.domain.user.service.UserDomainService;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @program: quant
 * @classname: UserProcessor
 * @package: com.megance.quant.application.user.processor
 * @description: 用户 processor
 * @author: linus
 * @create: 2024-06-25 23:54
 **/
@Component
public class UserProcessor {
    @Resource
    private UserDomainService userDomainService;
    public ApiResult<?> register(RegisterReq registerReq) {
        registerReq.paramValidation();
        /*
        1. 创建系统C端用户账号
        2. 异步创建tron usdt 地址 并创建账户钱包信息
        3. 生成 并缓存 jwt token
         */
        return null;
    }
}

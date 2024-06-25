/*
 * Copyright 2024  megance-quant , Inc. All rights reserved.
 */

package com.megance.quant.app.client.controller;

import com.megance.quant.application.user.processor.UserProcessor;
import com.megance.quant.application.user.request.RegisterReq;
import com.megance.quant.common.api.ApiResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @program: quant
 * @classname: UserController
 * @package: com.megance.quant.app.client.controller
 * @description: 用户 web api
 * @author: linus
 * @create: 2024-06-25 23:41
 **/
@Api(tags = "C端 - 用户管理")
@RestController
public class UserController {
    @Resource
    private UserProcessor userProcessor;
    /**
     * 用户注册
     * @param registerReq
     * @return
     */
    @ApiOperation("用户注册")
    @PostMapping("/user/register")
    @ResponseBody
    public ApiResult<?> register(@RequestBody @Validated RegisterReq registerReq) {
        return null;
    }
}

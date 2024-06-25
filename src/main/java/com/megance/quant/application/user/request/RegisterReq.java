/*
 * Copyright 2024  megance-quant , Inc. All rights reserved.
 */

package com.megance.quant.application.user.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import java.io.Serializable;

/**
 * @program: quant
 * @classname: RegisterReq
 * @package: com.megance.quant.application.user.request
 * @description: 注册req
 * @author: linus
 * @create: 2024-06-25 23:47
 **/
@Data
@ApiModel("用户注册请求参数")
public class RegisterReq implements Serializable {
    @ApiModelProperty("用户账户")
    @NotBlank(message = "用户账号不能为空")
    private String username;

    @ApiModelProperty("用户邮箱")
    @NotBlank(message = "用户邮箱不能为空")
    @Email(message = "邮箱格式错误")
    private String email;

    @ApiModelProperty("用户登录密码")
    @NotBlank(message = "用户登录密码不能为空")
    private String password;

    @ApiModelProperty("用户手机号")
    @NotBlank(message = "用户手机号不能为空")
    private String phone;
}

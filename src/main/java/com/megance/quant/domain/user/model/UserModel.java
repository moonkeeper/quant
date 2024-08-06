/*
 * Copyright 2024  megance-quant , Inc. All rights reserved.
 */

package com.megance.quant.domain.user.model;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @program: quant
 * @classname: UserModel
 * @package: com.megance.quant.domain.user.model
 * @description: 用户模型
 * @author: linus
 * @create: 2024-06-25 23:40
 **/
@Data
public class UserModel implements Serializable {
    /**
     * 用户id 生成的唯一id
     */
    private String uid;
    /**
     * 邮箱
     */
    private String email;
    /**
     * 用户层级
     */
    private Integer userLayer;
    /**
     * 上次登录ip
     */
    private String lastLoginIp;
    /**
     * 用户状态
     */
    private Integer status;
    /**
     * 邀请人id
     */
    private Long inviteUserId;
    /**
     * 量化类型
     */
    private Integer quantType;
    /**
     * 是否会员
     */
    private boolean ifMember;
    /**
     * 登录密码
     */
    private String loginPassword;
    /**
     * 交易密码
     */
    private String tradePassword;
    /**
     * 返佣比例
     */
    private BigDecimal commissionPercent;
    /**
     * 用户邀请码
     */
    private String inviteCode;

}

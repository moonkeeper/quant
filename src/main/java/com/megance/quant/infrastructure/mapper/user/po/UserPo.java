/*
 * Copyright 2024  megance-quant , Inc. All rights reserved.
 */

package com.megance.quant.infrastructure.mapper.user.po;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.megance.quant.infrastructure.mapper.base.po.BasePo;
import lombok.Data;

import java.math.BigDecimal;

@Data

@TableName("t_use_info")
public class UserPo extends BasePo {
    /**
     * 用户id 生成的唯一id
     */
    @TableField("uid")
    private String uid;
    /**
     * 用户名称
     */
    @TableField("user_name")
    private String userName;
    /**
     * 昵称
     */
    @TableField("nick_name")
    private String nickName;
    /**
     * 邮箱
     */
    @TableField("email")
    private String email;
    /**
     * 用户层级
     */
    @TableField("user_layer")
    private Integer userLayer;
    /**
     * 上次登录ip
     */
    @TableField("last_login_ip")
    private String lastLoginIp;
    /**
     * 用户状态
     */
    @TableField("status")
    private Integer status;
    /**
     * 邀请人id
     */
    @TableField("invite_user_id")
    private Long inviteUserId;
    /**
     * 量化类型
     */
    @TableField("quant_type")
    private Integer quantType;
    /**
     * 是否会员
     */
    @TableField("if_member")
    private boolean ifMember;
    /**
     * 登录密码
     */
    @TableField("login_password")
    private String loginPassword;
    /**
     * 交易密码
     */
    @TableField("trade_password")
    private String tradePassword;
    /**
     * 翻涌比例
     */
    @TableField("commission_percent")
    private BigDecimal commissionPercent;
    /**
     * 用户邀请码
     */
    @TableField("invite_code")
    private String inviteCode;

}

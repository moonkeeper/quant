package com.megance.quant.infrastructure.mapper.po;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
@TableName("t_use_info")
public class UserPo extends BasePo{
    /**
     * 用户id 生成的唯一id
     */
    private String userId;
    /**
     * 用户名称
     */
    private String userName;
    /**
     * 昵称
     */
    private String nickName;
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
     * 翻涌比例
     */
    private BigDecimal commissionPercent;
    /**
     * 用户邀请码
     */
    private String inviteCode;

}

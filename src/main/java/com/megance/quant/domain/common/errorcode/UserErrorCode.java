/*
 * Copyright 2024  megance-quant , Inc. All rights reserved.
 */

package com.megance.quant.domain.common.errorcode;

/**
 * @program: quant
 * @classname: UserErrorCode
 * @package: com.megance.quant.domain.common.errorcode
 * @description: 用户相关错误码
 * @author: linus
 * @create: 2024-07-10 10:06
 **/
public class UserErrorCode extends BaseErrorCode{
    UserErrorCode(String code, String msg) {
        super(code, msg, RespCodeTypeEnum.USER);
    }

    public static UserErrorCode LOGIN_FAIL = new UserErrorCode("00001", "登陆失败");//
    public static UserErrorCode REGISTER_FAIL = new UserErrorCode("00002", "注册失败");//
    public static UserErrorCode WALLET_ADDRESS_BUILD_FAIL = new UserErrorCode("00003", "钱包地址获取失败");
    public static UserErrorCode WALLET_CREATE_FAIL = new UserErrorCode("00004", "钱包创建失败");//
    public static UserErrorCode WALLET_CRYPTO_NULL = new UserErrorCode("00005", "钱包无对应币种");
    public static UserErrorCode WALLET_AVAILABLE_NOT_ENOUGH = new UserErrorCode("00006", "可冻结余额不足");
    public static UserErrorCode WALLET_FROZEN_NOT_ENOUGH = new UserErrorCode("00007", "冻结余额不足");
    public static UserErrorCode USER_NOT_EXSIT = new UserErrorCode("00008", "账号信息不存在");
    public static UserErrorCode USER_EMAIL_NOT_EXSIT = new UserErrorCode("00009", "邮箱账号不存在");
    public static UserErrorCode MONEY_PASSWORD_VALIDATE_FAIL = new UserErrorCode("00010", "资金密码校验失败");
    public static UserErrorCode LOGIN_PASSWORD_VALIDATE_FAIL = new UserErrorCode("00011", "原始密码校验失败");
    public static UserErrorCode LOGIN_PASSWORD_UPDATE_FAIL = new UserErrorCode("00012", "密码修改失败");
    public static UserErrorCode PAYMENT_ADD_FAIL = new UserErrorCode("00013", "支付方式添加失败");
    public static UserErrorCode PAYMENT_MOD_FAIL = new UserErrorCode("00014", "支付方式修改失败");
    public static UserErrorCode PAYMENT_GET_FAIL = new UserErrorCode("00015", "支付方式获取失败");
    public static UserErrorCode CODE_VALIDATE_FAIL = new UserErrorCode("00016", "验证码校验失败");
    public static UserErrorCode LOGINNAME_EXIST = new UserErrorCode("00017", "用户名或邮箱已存在");
    public static UserErrorCode USER_NOT_EXIST = new UserErrorCode("00018", "当前用户不存在");//
    public static UserErrorCode USER_ACCOUNT_FROZEN = new UserErrorCode("00019", "当前用户账号被冻结");
    public static UserErrorCode MONEY_PASSWORD_MOD_FAIL = new UserErrorCode("00020", "资金密码保存失败");
    public static UserErrorCode PHONE_NOT_EXIST = new UserErrorCode("00021", "未绑定手机号");
    public static UserErrorCode EMAIL_MOD_FAIL = new UserErrorCode("00022", "邮箱修改失败");
    public static UserErrorCode PHONE_MOD_FAIL = new UserErrorCode("00023", "手机修改失败");
    public static UserErrorCode REAL_NAME_MOD_FAIL = new UserErrorCode("00024", "实名认证失败");
    public static UserErrorCode WALLET_GET_FAIL = new UserErrorCode("00025", "资产详情获取失败");//
    public static UserErrorCode USER_NO_EMAIL = new UserErrorCode("00026", "无可用邮箱");
    public static UserErrorCode USER_NO_PHONE = new UserErrorCode("00027", "无可用手机号");
    public static UserErrorCode USER_PHONE_EXIST = new UserErrorCode("00028", "手机号已存在");
    public static UserErrorCode USER_EMAIL_EXIST = new UserErrorCode("00029", "邮箱已存在");
    public static UserErrorCode USER_PHONE_NOT_EXSIT = new UserErrorCode("00030", "手机账号不存在");
    public static UserErrorCode USER_FUNDS_PASSWORD_NOT_SET = new UserErrorCode("00031", "未设置资金密码");
    public static UserErrorCode PAYMENT_DEL_FAIL = new UserErrorCode("00032", "支付方式删除失败");
    public static UserErrorCode USERNAME_INVALID = new UserErrorCode("00033", "用户名不符合规则");
    public static UserErrorCode EMAIL_INVALID = new UserErrorCode("00034", "邮箱不符合规则");
    public static UserErrorCode PASSWORD_INVALID = new UserErrorCode("00035", "密码不符合规则");
    public static UserErrorCode USERNAME_PASSWORD_INVALID = new UserErrorCode("00036", "用户名或密码错误");
    public static UserErrorCode USER_CRYPTO_INFO_NOT_EXIST = new UserErrorCode("00037", "资产货币信息获取失败");
    public static UserErrorCode LIMIT_WITHDRAW_SELF = new UserErrorCode("00038", "提现地址不能和当前账户充值地址相同");
    public static UserErrorCode INVITE_CODE_EMPTY = new UserErrorCode("00039", "邀请码为空");
    public static UserErrorCode REAL_NAME_NOT_EXIST = new UserErrorCode("00040", "当前账户未实名, 请在个人中心完成实名认证。");

    public static UserErrorCode PASSWORD_NOT_MATCH_REPASSWORD_FOR_REGISTER = new UserErrorCode("00041", "登录密码和登录确认密码不一致");
}

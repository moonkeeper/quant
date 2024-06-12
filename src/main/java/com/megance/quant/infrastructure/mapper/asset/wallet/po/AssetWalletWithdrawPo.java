/*
 * Copyright 2024  megance-quant , Inc. All rights reserved.
 */

package com.megance.quant.infrastructure.mapper.asset.wallet.po;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.megance.quant.infrastructure.mapper.base.po.BasePo;
import lombok.Data;

import java.math.BigDecimal;

/**
 * @program: quant
 * @classname: AssetWalletWithdrawPo
 * @package: com.megance.quant.infrastructure.mapper.asset.wallet.po
 * @description: 钱包提现po
 * @author: linus
 * @create: 2024-06-12 23:21
 **/
@Data
@TableName("t_asset_wallet_withdraw_record")
public class AssetWalletWithdrawPo extends BasePo {
    /**
     * 提现来源chain地址
     */
    @TableField("from_addr")
    private String fromAddr;
    /**
     * 提现用户id
     */
    @TableField("from_user_id")
    private Long fromUserId;
    /**
     * 提现目的chain地址
     */
    @TableField("to_addr")
    private String toAAddr;
    /**
     * 提现数量
     */
    @TableField("withdraw_nums")
    private BigDecimal withdrawNums;
    /**
     * 手续费数量
     */
    @TableField("fee_nums")
    private BigDecimal feeNums;
    /**
     * chain txId
     */
    @TableField("tx_id")
    private String txId;
    /**
     * 提现状态
     */
    @TableField("status")
    private Integer status;
    /**
     * 提现币种
     */
    @TableField("crypto")
    private String crypto;
    /**
     * 手续费币种
     */
    @TableField("fee_crypto")
    private String feeCrypto;
}

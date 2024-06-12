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
 * @classname: AssetWalletDepositPo
 * @package: com.megance.quant.infrastructure.mapper.asset.wallet.po
 * @description: 钱包充值记录
 * @author: linus
 * @create: 2024-06-12 23:15
 **/
@Data
@TableName("t_asset_wallet_deposit_record")
public class AssetWalletDepositPo extends BasePo {
    /**
     * 充值来源chain地址
     */
    @TableField("from_addr")
    private String fromAddr;
    /**
     * 充值目的chain地址
     */
    @TableField("to_addr")
    private String toAddr;
    /**
     * 币种
     */
    @TableField("crypto")
    private String crypto;
    /**
     * chain txId
     */
    @TableField("tx_id")
    private String txId;
    /**
     * 充值数量
     */
    @TableField("deposit_nums")
    private BigDecimal depositNums;
    /**
     * 充值手续费数量
     */
    @TableField("fee_nums")
    private BigDecimal feeNums;
    /**
     * 充值手续费币种
     */
    @TableField("fee_crypto")
    private String feeCrypto;
    /**
     * 充值状态
     */
    @TableField("status")
    private Integer status;
    /**
     * 目的地址 用户id
     */
    @TableField("to_user_id")
    private Long toUserId;
}

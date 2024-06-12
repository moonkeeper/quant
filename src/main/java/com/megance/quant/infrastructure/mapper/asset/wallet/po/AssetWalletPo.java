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
 * @classname: AssetWalletPo
 * @package: com.megance.quant.infrastructure.mapper.po
 * @description: 钱包po
 * @author: linus
 * @create: 2024-06-12 00:31
 **/
@Data
@TableName("t_asset_wallet")
public class AssetWalletPo extends BasePo {
    /**
     * 用户id
     */
    @TableField("user_id")
    private Long userId;
    /**
     * 币种
     */
    @TableField("crypto")
    private String crypto;
    /**
     * chain 地址
     */
    @TableField("address")
    private String address;
    /**
     * 总数量
     */
    @TableField("total_nums")
    private BigDecimal totalNums;
    /**
     * 冻结数量
     */
    @TableField("frozen_nums")
    private BigDecimal frozenNums;
    /**
     * 可用数量
     */
    @TableField("available_nums")
    private BigDecimal availableNums;
}

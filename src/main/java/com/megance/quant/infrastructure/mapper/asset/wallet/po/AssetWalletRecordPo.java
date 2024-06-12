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
 * @classname: AssetWalletRecordPo
 * @package: com.megance.quant.infrastructure.mapper.asset.wallet.po
 * @description: 钱包流水记录
 * @author: linus
 * @create: 2024-06-13 00:02
 **/
@Data
@TableName("t_asset_wallet_record")
public class AssetWalletRecordPo extends BasePo {
    /**
     * 用户id
     */
    @TableField("user_id")
    private Long userId;
    /**
     * 钱包事件类型
     */
    @TableField("wallet_event_type")
    private Integer walletEventType;
    /**
     * 出入方向
     */
    @TableField("direct")
    private Integer direct;
    /**
     * 币种
     */
    @TableField("crypto")
    private String crypto;
    /**
     * 数量
     */
    @TableField("nums")
    private BigDecimal nums;
    /**
     * 源数量
     */
    @TableField("origin_nums")
    private BigDecimal originNums;
    /**
     * 可用数量
     */
    @TableField("available_nums")
    private BigDecimal availableNums;
    /**
     * 备注
     */
    @TableField("remark")
    private String remark;
    /**
     * 关联业务id
     */
    @TableField("biz_id")
    private String bizId;
}

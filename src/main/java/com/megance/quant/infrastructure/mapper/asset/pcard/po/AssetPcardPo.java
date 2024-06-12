/*
 * Copyright 2024  megance-quant , Inc. All rights reserved.
 */

package com.megance.quant.infrastructure.mapper.asset.pcard.po;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.megance.quant.infrastructure.mapper.base.po.BasePo;
import lombok.Data;

import java.math.BigDecimal;

/**
 * @program: quant
 * @classname: AssetPcardPo
 * @package: com.megance.quant.infrastructure.mapper.asset.pcard.po
 * @description: 点卡信息
 * @author: linus
 * @create: 2024-06-12 23:37
 **/
@Data
@TableName("t_asset_pcard")
public class AssetPcardPo extends BasePo {
    /**
     * 用户id
     */
    @TableField("user_id")
    private Long userId;
    /**
     * 点卡数量
     */
    @TableField("total_nums")
    private BigDecimal totalNums;
}

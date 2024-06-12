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
 * @description:
 * @author: linus
 * @create: 2024-06-12 23:30
 **/
@Data
@TableName("t_asset_pcard_record")
public class AssetPcardRecordPo extends BasePo {
    /**
     * 用户id
     */
    @TableField("user_id")
    private Long userId;
    /**
     * 点卡数量
     */
    @TableField("pcard_nums")
    private BigDecimal pcardNums;
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
     * 点卡事件类型
     */
    @TableField("pcard_event_type")
    private Integer pcardEventType;
}

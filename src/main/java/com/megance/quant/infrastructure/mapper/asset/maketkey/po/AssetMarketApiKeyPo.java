/*
 * Copyright 2024  megance-quant , Inc. All rights reserved.
 */

package com.megance.quant.infrastructure.mapper.asset.maketkey.po;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.megance.quant.infrastructure.mapper.base.po.BasePo;
import lombok.Data;

/**
 * @program: quant
 * @classname: AssetMarketApiKeyPo
 * @package: com.megance.quant.infrastructure.mapper.asset.maketkey.po
 * @description: 交易所apikey
 * @author: linus
 * @create: 2024-06-13 00:12
 **/
@Data
@TableName("t_asset_market_api_key")
public class AssetMarketApiKeyPo extends BasePo {
    /**
     * 用户id
     */
    @TableField("user_id")
    private Long userId;
    /**
     * 交易所
     */
    @TableField("market")
    private String market;
    /**
     * uid
     */
    @TableField("market_uid")
    private String marketUid;
    /**
     * apikey
     */
    @TableField("api_key")
    private String apiKey;
    /**
     * secretKey
     */
    @TableField("secret_key")
    private String secretKey;
    /**
     * passphrase
     */
    @TableField("pass_phrase")
    private String passphrase;
    /**
     * 用户 api key 状态
     */
    @TableField("status")
    private Integer status;
}

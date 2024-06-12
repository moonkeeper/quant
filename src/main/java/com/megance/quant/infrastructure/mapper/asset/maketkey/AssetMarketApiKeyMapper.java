/*
 * Copyright 2024  megance-quant , Inc. All rights reserved.
 */

package com.megance.quant.infrastructure.mapper.asset.maketkey;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.megance.quant.infrastructure.mapper.asset.maketkey.po.AssetMarketApiKeyPo;
import org.apache.ibatis.annotations.Mapper;

/**
 * @program: quant
 * @classname: AssetMarketKeyMapper
 * @package: com.megance.quant.infrastructure.mapper.asset.maketkey
 * @description: 交易所apikey
 * @author: linus
 * @create: 2024-06-13 00:11
 **/
@Mapper
public interface AssetMarketApiKeyMapper extends BaseMapper<AssetMarketApiKeyPo> {
}

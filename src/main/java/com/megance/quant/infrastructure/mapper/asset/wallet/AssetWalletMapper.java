/*
 * Copyright 2024  megance-quant , Inc. All rights reserved.
 */

package com.megance.quant.infrastructure.mapper.asset.wallet;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.megance.quant.infrastructure.mapper.asset.wallet.po.AssetWalletPo;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AssetWalletMapper extends BaseMapper<AssetWalletPo> {
}



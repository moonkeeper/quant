/*
 * Copyright 2024  megance-quant , Inc. All rights reserved.
 */

package com.megance.quant.infrastructure.mapper.asset.wallet;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.megance.quant.infrastructure.mapper.asset.wallet.po.AssetWalletWithdrawPo;
import org.apache.ibatis.annotations.Mapper;

/**
 * @program: quant
 * @classname: AssetWalletWithdrawMapper
 * @package: com.megance.quant.infrastructure.mapper.asset.wallet
 * @description: 提现记录Mapper
 * @author: linus
 * @create: 2024-06-12 23:28
 **/
@Mapper
public interface AssetWalletWithdrawMapper extends BaseMapper<AssetWalletWithdrawPo> {
}

/*
 * Copyright 2024  megance-quant , Inc. All rights reserved.
 */

package com.megance.quant.infrastructure.mapper.asset.pcard;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.megance.quant.infrastructure.mapper.asset.pcard.po.AssetPcardPo;
import org.apache.ibatis.annotations.Mapper;

/**
 * @program: quant
 * @classname: AssetPcardMapper
 * @package: com.megance.quant.infrastructure.mapper.asset.pcard.po
 * @description: 点卡信息mapper
 * @author: linus
 * @create: 2024-06-12 23:40
 **/
@Mapper
public interface AssetPcardMapper extends BaseMapper<AssetPcardPo> {
}

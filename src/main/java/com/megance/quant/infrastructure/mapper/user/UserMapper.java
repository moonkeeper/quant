/*
 * Copyright 2024  megance-quant , Inc. All rights reserved.
 */

package com.megance.quant.infrastructure.mapper.user;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.megance.quant.infrastructure.mapper.user.po.UserPo;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends BaseMapper<UserPo> {
}

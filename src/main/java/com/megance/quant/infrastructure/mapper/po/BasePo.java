package com.megance.quant.infrastructure.mapper.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class BasePo implements Serializable {
    /**
     * 主见id
     */
    @TableId(type = IdType.AUTO)
    public Long id;
    /**
     * 创建时间
     */
    @TableField(value = "create_time")
    public Date createTime;
    /**
     * 更新时间
     */
    @TableField(value = "update_time")
    public Date updateTime;
}

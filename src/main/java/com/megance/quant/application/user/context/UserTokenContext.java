/*
 * Copyright 2024  megance-quant , Inc. All rights reserved.
 */

package com.megance.quant.application.user.context;

import com.megance.quant.application.user.dto.ManagerDto;
import com.megance.quant.application.user.dto.UserDto;

/**
 * @program: quant
 * @classname: UserTokenContext
 * @package: com.megance.quant.application.user.context
 * @description: user token context
 * @author: linus
 * @create: 2024-06-20 23:10
 **/
public class UserTokenContext {
    /**
     * 保存用户对象的ThreadLocal  C 用户
     */
    private static final ThreadLocal<UserDto> userThreadLocal = new ThreadLocal<UserDto>();
    /**
     * 添加当前登录用户方法  在拦截器方法执行前调用设置获取用户
     * @param user
     */
    public static void addCurrentUser(UserDto user){
        userThreadLocal.set(user);
    }

    /**
     * 获取当前登录用户方法
     */
    public static UserDto getCurrentUser(){
        return userThreadLocal.get();
    }


    /**
     * 删除当前登录用户方法  在拦截器方法执行后 移除当前用户对象
     */
    public static void remove(){
        userThreadLocal.remove();
    }
}

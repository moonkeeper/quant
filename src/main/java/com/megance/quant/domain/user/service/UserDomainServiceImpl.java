/*
 * Copyright 2024  megance-quant , Inc. All rights reserved.
 */

package com.megance.quant.domain.user.service;

import com.megance.quant.domain.user.model.UserModel;
import com.megance.quant.domain.user.model.UserQueryModel;
import com.megance.quant.infrastructure.mapper.user.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collections;
import java.util.List;

/**
 * @program: quant
 * @classname: UserDomainServiceImpl
 * @package: com.megance.quant.domain.user.service
 * @description: user domain service impl
 * @author: linus
 * @create: 2024-07-10 10:22
 **/
@Service
public class UserDomainServiceImpl implements UserDomainService{

    @Autowired
    private UserMapper userMapper;

    @Transactional(rollbackFor = Exception.class)
    @Override
    public UserModel createUser(UserModel user) {
        /*
           1. 邀请人账户是否存在 invitecode 唯一 , 状态是否正常
           2. 创建账户是否存在 email 唯一
           3. 构建当前注册人信息 包括邀请码
         */

        return userMapper.insert(null) > 0 ? user : null;
    }

    @Override
    public UserModel updateUser(UserModel user) {
        return null;
    }

    @Override
    public UserModel getUserById(String id) {
        return null;
    }

    @Override
    public UserModel getUserByEmail(String email) {
        return null;
    }

    @Override
    public UserModel getUserByUsername(String username) {
        return null;
    }

    @Override
    public UserModel getUserByEmailAndPassword(String email, String password) {
        return null;
    }

    @Override
    public UserModel getUserByUsernameAndPassword(String username, String password) {
        return null;
    }

    @Override
    public List<UserModel> getUsersByQueryCondition(UserQueryModel query) {
        return Collections.emptyList();
    }
}

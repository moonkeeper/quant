/*
 * Copyright 2024  megance-quant , Inc. All rights reserved.
 */

package com.megance.quant.domain.user.service;

import com.megance.quant.domain.user.model.UserModel;
import com.megance.quant.infrastructure.mapper.user.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

    @Override
    public UserModel createUser(UserModel user) {
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
}

/*
 * Copyright 2024  megance-quant , Inc. All rights reserved.
 */

package com.megance.quant.domain.user.service;

import com.megance.quant.domain.user.model.UserModel;
import com.megance.quant.domain.user.model.UserQueryModel;

import java.util.List;

/**
 * @program: quant
 * @classname: UserDomainService
 * @package: com.megance.quant.domain.user.service
 * @description: user domain service
 * @author: linus
 * @create: 2024-06-26 00:20
 **/
public interface UserDomainService {
    public UserModel createUser(UserModel user);
    public UserModel updateUser(UserModel user);
    public UserModel getUserById(String id);
    public UserModel getUserByEmail(String email);
    public UserModel getUserByUsername(String username);
    public UserModel getUserByEmailAndPassword(String email, String password);
    public UserModel getUserByUsernameAndPassword(String username, String password);

    public List<UserModel> getUsersByQueryCondition(UserQueryModel query);
}

/*
 * Copyright 2024  megance-quant , Inc. All rights reserved.
 */

package com.megance.quant.application.user.request;

import lombok.Data;

import java.io.Serializable;

/**
 * @program: quant
 * @classname: UserReq
 * @package: com.megance.quant.application.user.request
 * @description:
 * @author: linus
 * @create: 2024-06-23 23:22
 **/
@Data
public class UserReq implements Serializable {
    private String username;
    private String password;
}

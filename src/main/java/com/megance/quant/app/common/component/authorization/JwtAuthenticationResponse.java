/*
 * Copyright 2024  megance-quant , Inc. All rights reserved.
 */

package com.megance.quant.app.common.component.authorization;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Map;

/**
 * @program: quant
 * @classname: JwtAuthenticationResponse
 * @package: com.megance.quant.app.common.component.authorization
 * @description: jwt auth response
 * @author: linus
 * @create: 2024-06-23 23:19
 **/
@Data
public class JwtAuthenticationResponse {
    private String token;
    private Map<String, Object> additionalInfo;

    public JwtAuthenticationResponse(String jwt) {
        this.token = jwt;
    }
}

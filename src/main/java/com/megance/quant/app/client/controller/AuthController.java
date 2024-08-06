/*
 * Copyright 2024  megance-quant , Inc. All rights reserved.
 */

package com.megance.quant.app.client.controller;

import com.megance.quant.app.common.component.authorization.JwtAuthenticationResponse;
import com.megance.quant.application.user.request.UserReq;
import com.megance.quant.infrastructure.component.jwt.JwtTokenProvider;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/** emacs
 * @program: quant
 * @classname: AuthController
 * @package: com.megance.quant.app.client.controller
 * @description: web auth controller
 * @author: linus
 * @create: 2024-06-23 23:20
 **/
@Api(tags = "鉴权校验")
@RestController
public class AuthController {
    @Autowired
    private JwtTokenProvider jwtTokenProvider;
    @Resource
    private AuthenticationManager authenticationManager;

    @ApiOperation("登录校验")
    @PostMapping("/auth/login")
    public ResponseEntity<?> login(@RequestBody UserReq userReq) {
        Authentication authentication = authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(userReq.getUsername(), userReq.getPassword()));
        SecurityContextHolder.getContext().setAuthentication(authentication);
        String jwt = jwtTokenProvider.generateToken(authentication);
        return ResponseEntity.ok(new JwtAuthenticationResponse(jwt));
    }
}

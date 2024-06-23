/*
 * Copyright 2024  megance-quant , Inc. All rights reserved.
 */

package com.megance.quant.app.client.controller;

import com.megance.quant.app.common.component.authorization.JwtAuthenticationResponse;
import com.megance.quant.app.common.component.authorization.JwtTokenProvider;
import com.megance.quant.application.user.request.UserReq;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: quant
 * @classname: AuthController
 * @package: com.megance.quant.app.client.controller
 * @description: web auth controller
 * @author: linus
 * @create: 2024-06-23 23:20
 **/
@RestController
public class AuthController {
    @Autowired
    private JwtTokenProvider jwtTokenProvider;
    @Autowired
    private AuthenticationManager authenticationManager;

    @PostMapping("/auth/login")
    public ResponseEntity<?> login(@RequestBody UserReq userReq) {
        Authentication authentication = authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(userReq.getUsername(), userReq.getPassword()));
        SecurityContextHolder.getContext().setAuthentication(authentication);
        String jwt = jwtTokenProvider.generateToken(authentication);
        return ResponseEntity.ok(new JwtAuthenticationResponse(jwt));
    }
}

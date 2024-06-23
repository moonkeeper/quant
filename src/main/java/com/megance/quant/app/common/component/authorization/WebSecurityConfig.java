/*
 * Copyright 2024  megance-quant , Inc. All rights reserved.
 */

package com.megance.quant.app.common.component.authorization;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * @program: quant
 * @classname: WebSecurityConfig
 * @package: com.megance.quant.app.common.config
 * @description: http token 认证s
 * @author: linus
 * @create: 2024-06-23 21:58
 **/
@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
    @Autowired
    private JwtTokenProvider jwtTokenProvider;

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .csrf()
                .disable()
                .authorizeRequests()
                .antMatchers("/auth/**")
                .permitAll()
                .anyRequest()
                .authenticated()
                .and()
                .apply(new JwtTokenFilterConfigurer(jwtTokenProvider));
    }
}

/*
 * Copyright 2024  megance-quant , Inc. All rights reserved.
 */

package com.megance.quant.app.client.interceptor;

import com.megance.quant.application.user.annotation.NoLoginRequired;
import com.megance.quant.domain.user.enums.UserTokenConstant;
import com.megance.quant.infrastructure.component.jwt.JwtService;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.ExpiredJwtException;
import io.jsonwebtoken.JwtException;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.lang.reflect.Method;
import java.util.Objects;

/**
 * @program: quant
 * @classname: LoginInterceptor
 * @package: com.megance.quant.app.client.interceptor
 * @description: C 端登录拦截器
 * @author: linus
 * @create: 2024-06-20 22:48
 **/
@Configuration
public class LoginInterceptor implements HandlerInterceptor {

    @Autowired
    private JwtService jwtService;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
            throws Exception {

        if (handler instanceof HandlerMethod) {
            HandlerMethod handlerMethod = (HandlerMethod) handler;
            Method method = handlerMethod.getMethod();
            // 判断接口是否需要登录
            NoLoginRequired methodAnnotation = method.getAnnotation(NoLoginRequired.class);
            if (Objects.nonNull(methodAnnotation)) {
                return true;
            }

            String authorization = request.getHeader(UserTokenConstant.REQ_HEADER_AUTHORIZATION);
            if (StringUtils.isEmpty(authorization)) {
                //返回401
                response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
                return false;
            }

            String token = authorization.substring(UserTokenConstant.REQ_HEADER_AUTH_BEARER_BLANK.length());
            if (StringUtils.isEmpty(token)) {
                //返回401
                response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
                return false;
            }

            Claims jwtClaims = null;
            try {
                jwtClaims = jwtService.getJwtBody(token);
            } catch (ExpiredJwtException e) {
                response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
                throw new RuntimeException("Token expired");
            } catch (Exception e) {
                response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
                throw e;
            }

//            if(Objects.nonNull(jwtClaims)) {
//                jwtClaims.getExpiration()
//                jwtClaims.setExpiration()
//            }

        }
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
                           ModelAndView modelAndView) throws Exception {
        // TODO Auto-generated method stub
        HandlerInterceptor.super.postHandle(request, response, handler, modelAndView);
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
            throws Exception {
        // TODO Auto-generated method stub
        HandlerInterceptor.super.afterCompletion(request, response, handler, ex);
    }
}

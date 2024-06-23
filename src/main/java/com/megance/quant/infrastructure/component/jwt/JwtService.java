/*
 * Copyright 2024  megance-quant , Inc. All rights reserved.
 */

package com.megance.quant.infrastructure.component.jwt;

import io.jsonwebtoken.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.LinkedHashMap;

/**
 * @program: quant
 * @classname: JwtService
 * @package: com.megance.quant.infrastructure.component.jwt
 * @description: jwt token
 * @author: linus
 * @create: 2024-06-20 22:28
 **/
@Service
public class JwtService {
    /**
     * jwt key
     */
    @Value("jwt.secure-key")
    private String secretKey;
    /**
     * token 过期时间 一天
     */
    private static final Long EXPIRATION_TIME = 60 * 60 * 24 * 1000L;

    /**
     * 创建jwt token
     * @param srcMap LinkedHashMap 保证payload的顺序
     * @return
     */
    public String createToken(LinkedHashMap<String, String> srcMap) throws Exception {
        // 生成JWT
        return Jwts.builder()
                .setClaims(srcMap)
                .setExpiration(new Date(System.currentTimeMillis() + EXPIRATION_TIME))
                .signWith(SignatureAlgorithm.HS256, secretKey)
                .compact();
    }

    /**
     * 根据token 获取 body 信息
     * @param token
     * @return
     */
    public Claims getJwtBody(String token) throws ExpiredJwtException {
        try {
            // 解析JWT
            Jws<Claims> claimsJws = Jwts.parser()
                    .setSigningKey(secretKey)
                    .parseClaimsJws(token);
            return claimsJws.getBody();
        } catch (UnsupportedJwtException e) {
            // 不支持的JWT
            throw new RuntimeException("Unsupported JWT");
        } catch (MalformedJwtException e) {
            // JWT格式错误
            throw new RuntimeException("Invalid JWT");
        } catch (SignatureException e) {
            // JWT签名错误
            throw new RuntimeException("JWT signature verification failed");
        } catch (IllegalArgumentException e) {
            // JWT为空
            throw new RuntimeException("JWT string must not be empty");
        }
    }
}

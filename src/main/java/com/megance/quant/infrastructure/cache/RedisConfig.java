/*
 * Copyright 2024  megance-quant , Inc. All rights reserved.
 */

package com.megance.quant.infrastructure.cache;

import io.lettuce.core.ReadFrom;
import org.springframework.boot.autoconfigure.data.redis.LettuceClientConfigurationBuilderCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.Duration;

/**
 * @program: quant
 * @classname: RedisConfig
 * @package: com.megance.quant.infrastructure.cache
 * @description: redis config
 * @author: linus
 * @create: 2024-06-20 22:55
 **/
@Configuration
public class RedisConfig {

    @Bean
    public LettuceClientConfigurationBuilderCustomizer customizer() {
        return clientConfigBuilder ->
                clientConfigBuilder.readFrom(ReadFrom.MASTER_PREFERRED)
                        .commandTimeout(Duration.ofMillis(100))
                        .shutdownTimeout(Duration.ZERO);
    }
}

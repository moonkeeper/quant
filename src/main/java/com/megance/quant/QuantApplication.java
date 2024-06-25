package com.megance.quant;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.oas.annotations.EnableOpenApi;

@EnableOpenApi
@SpringBootApplication
@MapperScan("com.megance.quant.infrastructure.mapper")
public class QuantApplication {
    public static void main(String[] args) {
        SpringApplication.run(QuantApplication.class, args);
    }
}

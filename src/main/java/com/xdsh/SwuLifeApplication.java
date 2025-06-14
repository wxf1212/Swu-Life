package com.xdsh;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.xdsh.mapper")
@SpringBootApplication
public class SwuLifeApplication {

    public static void main(String[] args) {
        SpringApplication.run(SwuLifeApplication.class, args);
    }

}

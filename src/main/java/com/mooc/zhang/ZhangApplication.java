package com.mooc.zhang;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.mooc.zhang.mapper")
public class ZhangApplication {

    public static void main(String[] args) {

        SpringApplication.run(ZhangApplication.class, args);

    }

}

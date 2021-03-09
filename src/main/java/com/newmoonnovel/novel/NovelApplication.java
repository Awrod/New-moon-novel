package com.newmoonnovel.novel;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@MapperScan({"com.newmoonnovel.novel.user.mapper"})
@SpringBootApplication(scanBasePackages = "com.newmoonnovel.novel")
public class NovelApplication {
    public static void main(String[] args) {
        SpringApplication.run(NovelApplication.class, args);
    }

}

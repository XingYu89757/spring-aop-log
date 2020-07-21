package com.mrx.aop;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @ClassName AopLogSpringBootApplication
 * @Description TODO
 * @Author Administrator
 * @Date 2020/7/17 16:51
 * @Version 1.0
 */
@SpringBootApplication
@MapperScan(basePackages = {"com.mrx.aop.dao"})
public class AopLogSpringBootApplication {
    public static void main(String[] args) {
        SpringApplication.run(AopLogSpringBootApplication.class,args);
    }
}

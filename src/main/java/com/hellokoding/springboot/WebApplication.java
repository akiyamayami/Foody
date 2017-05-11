package com.hellokoding.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;




@SpringBootApplication
@EnableJpaRepositories(basePackages={"com.hellokoding.dao"})
@ComponentScan(basePackages={"com.hellokoding.service","com.hellokoding.springboot"})
@EntityScan(basePackages={"com.hellokoding.model"})
public class WebApplication {
    public static void main(String[] args) throws Exception {
        SpringApplication.run(WebApplication.class, args);
    }
}


package com.logan.demo.springbootdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * @author changzheng
 */
@SpringBootApplication // same as @Configuration @EnableAutoConfiguration @ComponentScan
public class SpringbootDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootDemoApplication.class, args);
    }

}

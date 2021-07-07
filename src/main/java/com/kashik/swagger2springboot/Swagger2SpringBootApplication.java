package com.kashik.swagger2springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
@ComponentScan(basePackages = { "org.openapitools.api", "com.**" })
public class Swagger2SpringBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(Swagger2SpringBootApplication.class, args);
    }

}

package com.klu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class CruddemoApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(CruddemoApplication.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(CruddemoApplication.class, args);
        System.out.println("Crud-backend started...");
    }
}

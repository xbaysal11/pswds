package com.baisalbek.pswds;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class PswdsApplication extends SpringBootServletInitializer {

    public static void main(String[] args) throws Throwable {
        SpringApplication.run(PswdsApplication.class, args);
    }

}

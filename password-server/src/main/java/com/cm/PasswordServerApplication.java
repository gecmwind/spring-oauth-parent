package com.cm;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableAuthorizationServer
@EnableResourceServer
@RestController
public class PasswordServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(PasswordServerApplication.class, args);
    }
    @RequestMapping(value = "/products")
    public String getProductName() {
        return "Honey";
    }
}

package com.cm;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class OauthClientApplication {
    public static void main(String[] args) {
        SpringApplication.run(OauthClientApplication.class, args);
    }
}

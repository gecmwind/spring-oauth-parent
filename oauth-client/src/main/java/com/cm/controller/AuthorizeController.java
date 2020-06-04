package com.cm.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author cm.ge.
 */
@RestController
public class AuthorizeController {
    public String oua(@RequestParam("code") String code){
        System.out.println(code);
        return "";
    }
}

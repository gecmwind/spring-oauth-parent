package com.cm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CodeRedirectController {
    @RequestMapping("/code")
    public String code(@RequestParam("code") String code, @RequestParam("state") String state) throws Exception {
        System.out.println(code+","+state);

        return "sparklr";
    }
}

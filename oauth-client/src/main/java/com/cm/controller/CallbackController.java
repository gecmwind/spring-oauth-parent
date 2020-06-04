package com.cm.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author cm.ge.
 */
@RestController
@RequestMapping("/callback")
public class CallbackController {
    @RequestMapping("/code")
    public String callback(@RequestParam("code") String code){
        System.out.println(code);
        return "";
    }
}

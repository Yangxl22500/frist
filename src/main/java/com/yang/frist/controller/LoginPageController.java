package com.yang.frist.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/sys")
public class LoginPageController {

    @RequestMapping("/login")
    public String login(){

        return "login";
    }

    @RequestMapping("/frist")
    public String frist(){

        return "page/index";
    }

    @RequestMapping(value = "/table", produces="application/json; charset=utf-8")
    public String table(){

        return "page/table";
    }
}

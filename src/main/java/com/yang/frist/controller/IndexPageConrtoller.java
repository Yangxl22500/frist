package com.yang.frist.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexPageConrtoller {

    @RequestMapping("/")
    public String index(){

        return "index";
    }
}

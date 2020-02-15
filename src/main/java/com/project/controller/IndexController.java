package com.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/")
public class IndexController {


    @RequestMapping("/hello")
    @ResponseBody
    public String index() {
        return "hello";
    }
}

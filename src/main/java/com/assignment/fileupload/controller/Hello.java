package com.assignment.fileupload.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Hello {
    @ResponseBody
    @RequestMapping("/hello")
    public String hello(){
        return "Hello";
    }
}

package com.heiko.controller;

import com.heiko.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DemoController {
    @Autowired
    private DemoService demoService;

    @RequestMapping("/test")
    public String show() {
        System.out.println("show running...");
        demoService.show1();
        return "index";
    }
}

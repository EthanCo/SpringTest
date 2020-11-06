package com.heiko;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DemoController {
    @RequestMapping("test")
    public String show() {
        return "index";
    }
}

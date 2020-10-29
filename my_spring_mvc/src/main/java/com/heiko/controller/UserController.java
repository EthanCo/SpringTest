package com.heiko.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.heiko.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
public class UserController {

    @RequestMapping("/quick")
    public String save() {
        System.out.println("Controller save....");
        return "success";
    }

    @RequestMapping("/quick2")
    public ModelAndView save2() {
        /**
         * Model:模型 用作封装数据
         * View: 视图 用作展示数据
         */
        ModelAndView modelAndView = new ModelAndView();
        //设置模型数据 (会放到request域当中)
        modelAndView.addObject("username", "heiko");
        //设置视图名称
        modelAndView.setViewName("success");
        return modelAndView;
    }

    @RequestMapping("/quick3")
    public ModelAndView save3(ModelAndView modelAndView /*Spring可以自动注入ModelAndView*/) {
        modelAndView.addObject("username", "zhangsan");
        modelAndView.setViewName("success");
        return modelAndView;
    }

    @RequestMapping("/quick4")
    public String save4(Model model) {
        model.addAttribute("username", "lisi");
        return "success";
    }

    @RequestMapping("/quick5")
    public String save5(HttpServletRequest request) {
        request.setAttribute("username", "wangwu");
        return "success";
    }

    @RequestMapping("/quick6")
    public void save6(HttpServletResponse response) throws IOException {
        response.getWriter().print("hello heiko!");
    }

    @RequestMapping("/quick7")
    @ResponseBody //告诉SpringMVC框架，不进行视图跳转，直接进行数据响应
    public String save7() throws IOException {
        return "hello zhangsan";
    }

    @RequestMapping("/quick8")
    @ResponseBody
    public String save8() throws IOException {
        return "{\"username\":\"lisi\",\"age\":18}";
    }

    @RequestMapping("/quick9")
    @ResponseBody
    public String save9() throws IOException {
        User user = new User();
        user.setUsername("wangwu");
        user.setAge(20);
        //使用json转换工具
        ObjectMapper objectMapper = new ObjectMapper();
        String json = objectMapper.writeValueAsString(user);
        return json;
    }

    @RequestMapping("/quick10")
    @ResponseBody
    public User save10() throws IOException {
        User user = new User();
        user.setUsername("liuliu");
        user.setAge(23);
        return user;
    }
}

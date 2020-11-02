package com.heiko.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.heiko.domain.User;
import com.heiko.domain.VO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

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

    @RequestMapping("/quick11")
    @ResponseBody
    public void save11(String username, int age) throws IOException {
        System.out.println("username:" + username);
        System.out.println("age:" + age);
    }

    @RequestMapping("/quick12")
    @ResponseBody
    public void save12(User user) throws IOException {
        System.out.println(user);
    }

    @RequestMapping("/quick13")
    @ResponseBody
    public void save13(String[] strs) throws IOException {
        System.out.println(Arrays.asList(strs));
    }

    @RequestMapping("/quick14")
    @ResponseBody
    public void save14(VO vo) throws IOException {
        System.out.println(vo.toString());
    }

    @RequestMapping("/quick15")
    @ResponseBody
    public void save15(@RequestBody List<User> userList) throws IOException {
        System.out.println("userList:" + userList);
    }

    @RequestMapping("/quick16")
    @ResponseBody
    public void save16(@RequestParam("name") String username) throws IOException {
        System.out.println("name:" + username);
    }

    @RequestMapping("/quick17/{name}")
    @ResponseBody
    public void save17(@PathVariable(value = "name", required = true) String name) throws IOException {
        System.out.println("name:" + name);
    }

    @RequestMapping("/quick18")
    @ResponseBody
    public void save18(Date date) throws IOException {
        System.out.println("date:" + date);
    }

    @RequestMapping(value = "quick19")
    @ResponseBody
    public void save19(HttpServletRequest request, HttpServletResponse response, HttpSession session) throws IOException {
        System.out.println(request);
        System.out.println(response);
        System.out.println(session);
    }

    @RequestMapping("/quick20")
    @ResponseBody
    public void save20(@RequestHeader(value = "user-agent") String userAgent) throws IOException {
        System.out.println("userAgent:" + userAgent);
    }

    @RequestMapping("/quick21")
    @ResponseBody
    public void save21(@CookieValue(value = "JSESSIONID") String jsessionId) throws IOException {
        System.out.println("cookie:" + jsessionId);
    }
}

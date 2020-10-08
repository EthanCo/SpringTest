package com.heiko.web;

import com.heiko.uservice.impl.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserController {
    public static void main(String[] args){
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserServiceImpl userService = app.getBean(UserServiceImpl.class);
        userService.save();
    }
}

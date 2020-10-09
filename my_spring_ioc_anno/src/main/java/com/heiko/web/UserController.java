package com.heiko.web;

import com.heiko.config.SpringConfiguration;
import com.heiko.uservice.impl.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserController {
    //通过XML
    /*public static void main(String[] args){
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserServiceImpl userService = app.getBean(UserServiceImpl.class);
        userService.save();
    }*/

    //通过@Configuration注解，此时与applicationContext.xml无关
    public static void main(String[] args){
        ApplicationContext app = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        UserServiceImpl userService = app.getBean(UserServiceImpl.class);
        userService.save();
    }
}

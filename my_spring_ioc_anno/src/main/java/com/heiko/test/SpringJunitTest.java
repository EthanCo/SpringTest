package com.heiko.test;

import com.heiko.config.SpringConfiguration;
import com.heiko.uservice.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
//配置文件的方式 @ContextConfiguration(value="classpath:applicationContext.xml")
//全注解的方式
@ContextConfiguration(classes = {SpringConfiguration.class})
public class SpringJunitTest {
    @Autowired
    private UserService userService;

    @Test
    public void test1() {
        userService.save();
    }
}
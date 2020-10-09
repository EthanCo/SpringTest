package com.heiko.uservice.impl;

import com.heiko.dao.UserDao;
import com.heiko.uservice.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

//<bean id="userService" class="com.heiko.uservice.impl.UserServiceImpl">
//@Component("userService")
@Service("userService")
public class UserServiceImpl implements UserService {
    //<property name="userDao" ref="userDao"></property>
    @Autowired //按照数据类型 从Spring容器中进行匹配
    //@Qualifier("userDao") 是按照id值从容器中进行匹配的，但是此处要结合@Autowired一起用
    @Resource(name = "userDao") //相当于@Qualifier+@Autowired
    private UserDao userDao;

    /*
    使用注解 可注释掉
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }*/

    public void save() {
        userDao.save();
    }
}

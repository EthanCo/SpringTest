package com.heiko.service.impl;

import com.heiko.dao.UserDao;
import com.heiko.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserServiceImpl implements UserService {
    private UserDao userDao;

    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    /*public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }*/

    public void save() {
        userDao.save();
    }
}

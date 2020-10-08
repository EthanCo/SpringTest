package com.heiko.uservice.impl;

import com.heiko.dao.UserDao;
import com.heiko.uservice.UserService;

public class UserServiceImpl implements UserService {
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void save() {
        userDao.save();
    }
}

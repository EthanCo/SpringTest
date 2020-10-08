package com.heiko.dao.impl;

import com.heiko.dao.UserDao;
import org.springframework.stereotype.Component;

////<bean id="userDao" class="com.heiko.dao.impl.UserDaoImpl"></bean>
@Component("userDao")
public class UserDaoImpl implements UserDao {
    public void save() {
        System.out.println("save running...");
    }
}

package com.heiko.dao.impl;

import com.heiko.dao.UserDao;
import org.springframework.stereotype.Repository;

////<bean id="userDao" class="com.heiko.dao.impl.UserDaoImpl"></bean>
//@Component("userDao")
@Repository("userDao")
public class UserDaoImpl implements UserDao {
    public void save() {
        System.out.println("save running...");
    }
}

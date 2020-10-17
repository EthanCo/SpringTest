package com.heiko.dao.impl;

import com.heiko.dao.UserDao;

import java.util.List;
import java.util.Properties;

public class UserDaoImpl implements UserDao {
    private String username;
    private int age;
    private List<String> strList;
    private Properties properties;

    public void setUsername(String username) {
        this.username = username;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setStrList(List<String> strList) {
        this.strList = strList;
    }


    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    public void save() {
        System.out.println(username + " " + age);
        System.out.println(strList);
        System.out.println(properties);
        System.out.println("save running...");
    }
}

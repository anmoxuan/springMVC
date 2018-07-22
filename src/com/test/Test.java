package com.test;

import com.mapper.UserMapper;
import com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static  void main(String agrs[]){
        ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService= ac.getBean(UserService.class);
    }
}

package com.atguigu.spring5.testdemo;

import com.atguigu.spring5.User;
import com.atguigu.spring5.service.UserService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBean {

    @Test
    public void testAdd() {
        // 1 加载spring配置文件
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("bean2.xml");

        // 2 获取配置创建的对象
        UserService userService = context.getBean("userService", UserService.class);
        //System.out.println(userService);
        userService.add();
    }
}




















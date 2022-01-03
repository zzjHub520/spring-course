package com.atguigu.spring5.service;

import com.atguigu.spring5.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

//在注解里面value属性值可以省略不写
//默认值是类名称，首字母小写
//UserService  -- userService
@Service
public class UserService {
    //定义dao类型属性
    //不需要添加set方法
    //添加注入属性注解
    @Autowired
    @Qualifier("userDaoImpl1")
    private UserDao userDao; //根据类型进行注入
    public void add(){
        System.out.println("service add ............");
        userDao.add();
    }
}

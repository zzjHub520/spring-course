package com.atguigu.spring5.testdemo;

import com.atguigu.spring5.Book;
import com.atguigu.spring5.Orders;
import com.atguigu.spring5.User;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring5 {
    @Test
    public void testAdd() {
        // 1 加载spring配置文件
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("bean1.xml");

        // 2 获取配置创建的对象
        User user = context.getBean("user", User.class);
        System.out.println(user);
        user.add();
    }

    @Test
    public void testBook1() {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("bean1.xml");

        Book book = context.getBean("book", Book.class);
        System.out.println(book);
        book.testDemo();
    }

    @Test
    public void testOrders() {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("bean1.xml");

        Orders orders = context.getBean("orders", Orders.class);
        System.out.println(orders);
        orders.ordersTest();
    }
}

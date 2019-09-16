package com.biao.test.Service;

import com.biao.test.Beans.Hello;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 1. 控制反转.
 */
public class TestHello {
    @Autowired
    Hello hello;

    public void print() {
        hello.getMessage();
    }


    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("Beans.xml");

        TestHello testHello = new TestHello();
        testHello.print();
    }
}

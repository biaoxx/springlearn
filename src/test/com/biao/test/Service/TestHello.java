package com.biao.test.Service;

import com.biao.test.Beans.Hello;
import com.biao.test.Beans.Hello2;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.annotation.SystemProfileValueSource;


/**
 * 1. 控制反转.
 *
 */


public class TestHello {

    private ApplicationContext context;
    @Before
    public void init(){
        context = new ClassPathXmlApplicationContext("Beans.xml");
    }

    @Test
    public void testOne(){
        Hello2 hello =(Hello2)context.getBean("hello2");
        hello.getMessage();
    }

   @Test
   public void TestJunit(){
       System.out.println("XXXYYY....");
   }

}

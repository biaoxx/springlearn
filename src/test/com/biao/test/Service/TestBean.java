package com.biao.test.Service;

import com.biao.test.Beans.adsbean.AbstractBase;
import com.biao.test.Beans.adsbean.Dog;
import com.biao.test.Beans.adsbean.PeopleBase;
import com.biao.test.Beans.adsbean.SomeBodyPeople;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * 1. 控制反转.
 *
 */


public class TestBean {

    private ApplicationContext context;
    @Before
    public void init(){
        context = new ClassPathXmlApplicationContext("Beans.xml");
    }

    @Test
    public void testOne(){
     /*   Hello2 hello =(Hello2)context.getBean("hello2");
        hello.getMessage();*/
    }

   @Test
   public void TestJunit(){
       System.out.println("XXXYYY....");
   }


   @Test
    public void TestBeanAbstrace(){
        /*
         FileSystemXmlApplicationContext 该容器会在一个 web 应用程序的范围内加载在 XML 文件中已被定义的 bean。
         需要提供bean文件的完整路径
         */
       //ApplicationContext context = new FileSystemXmlApplicationContext("S:\\IdeaProjects\\springLearn\\src\\main\\resources\\Beans.xml");

       PeopleBase obj1 = (PeopleBase) context.getBean("demo2");
       //System.out.println(obj1.getMessage());
       System.out.println(obj1.getName());

   }

    /**
     * 一. 类定义
     * public class [abstract]
     * pullic enum
     * public interface
     * public @interface
     * 二.继承
     * 继承同一个接口,继承同一个父类,继承同一个抽象类
     */
    @Test
    public void testAbstract(){
        SomeBodyPeople someBodyPeople = new SomeBodyPeople();
        System.out.println(someBodyPeople.name);
        System.out.println(someBodyPeople.msg);

        AbstractBase someBodyPeople2;

        someBodyPeople2 = new SomeBodyPeople();
        System.out.println(someBodyPeople2.name);

        someBodyPeople2 = new Dog();
        System.out.println(someBodyPeople2.name);

    }

}

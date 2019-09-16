package com.biao.test.Beans;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;



public class Hello2 {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        /*
         FileSystemXmlApplicationContext 该容器会在一个 web 应用程序的范围内加载在 XML 文件中已被定义的 bean。
         需要提供bean文件的完整路径
         */
        //ApplicationContext context = new FileSystemXmlApplicationContext("S:\\IdeaProjects\\springLearn\\src\\main\\resources\\Beans.xml");
      /* Demo1 obj = (Demo1) context.getBean("demo1");

        obj.getAge();
        obj.getId();
        System.out.println( obj.getName());*/
        Demo1 obj1 = (Demo1) context.getBean("demo2");
        //System.out.println(obj1.getMessage());
        System.out.println(obj1.getName());


    }


}

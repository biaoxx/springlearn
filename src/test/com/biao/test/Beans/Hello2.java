package com.biao.test.Beans;

import org.springframework.beans.factory.annotation.Autowired;

public class Hello2 {
    @Autowired
    Hello hello;


    public void getMessage(){
        hello.getMessage();

    }

}

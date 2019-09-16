package com.biao.test.Beans;

public class Hello {

    private String message;
    private String name;
    private int id;
    private int age;

    public void getMessage() {
        System.out.println("Your Message : " + message);
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void getName() {
        System.out.println("name" + name);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void getId() {
        System.out.println("id" + id);
    }

    public void setId(int id) {
        this.id = id;
    }

    public void getAge() {
        System.out.println("age" + age);
    }

    public void setAge(int age) {
        this.age = age;
    }

}

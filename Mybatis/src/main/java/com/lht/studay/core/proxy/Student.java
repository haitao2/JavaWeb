package com.lht.studay.core.proxy;

/**
 * 被代理对象
 */
public class Student implements Person {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public void getMoney() {
        System.out.println(name+"同学上交了50班费");
    }

    public void start() {
        System.out.println(name+"同学开始准备交班费了");
    }
}

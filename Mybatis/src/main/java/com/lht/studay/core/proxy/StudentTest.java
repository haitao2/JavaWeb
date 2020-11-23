package com.lht.studay.core.proxy;

public class StudentTest {
    public static void main(String[] args) {
        // 创建一个被代理对象
        Person student = new Student("tom");
        // 创建一个代理对象，将被代理对象传入到代理对象中
        Person proxy = new ProxyStudent(student);
        // 这里调用getMoney方法没有通过被代理对象去直接调用，而是通过代理对象进行调用。并且可以对getMoney方法进行预处理。
        proxy.getMoney();
    }
}

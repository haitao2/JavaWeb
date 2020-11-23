package com.lht.studay.core.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class StudentInvocationHandlerMain {
    public static void main(String[] args) {
        // 创建被代理对象
        Person stu = new Student("张三");
        // 创建一个和代理对象相关联的invocationHandler
        InvocationHandler invocationHandler = new StudentInvocationHandler<Person>(stu);
        /// 创建一个代理对象stuProxy来代理被代理对象stu,代理对象的每个执行方法都会替换执行Invocation中的invoke方法
        Person proxyStu = (Person) Proxy.newProxyInstance(Person.class.getClassLoader(), new Class<?>[]{Person.class}, invocationHandler);
        // 代理对象执行getMoney方法。
        proxyStu.getMoney();
    }
}

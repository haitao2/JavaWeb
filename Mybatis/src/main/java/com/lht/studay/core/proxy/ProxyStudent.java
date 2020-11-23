package com.lht.studay.core.proxy;

/**
 * 代理对象，代理类中需要持有被代理对象，然后在代理类中调用被代理对象的方法。
 */
public class ProxyStudent implements Person {
    // 代理对象需要带调用被代理对象的getMoney方法
    Person stu;

    public ProxyStudent(Person stu) {
        this.stu = stu;
    }

    public void getMoney() {
        // 可以在执行被代理对象方法之前，对被代理对象进行预处理。
        System.out.println("对被代理对象调用之前进行处理");
        stu.getMoney();
        System.out.println("对被代理对象调用之后进行处理");
    }

    public void start() {

    }
}

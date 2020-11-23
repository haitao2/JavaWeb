package com.lht.studay.core.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class StudentInvocationHandler<T> implements InvocationHandler {
    // 需要持有被代理对象
    T target;

    public StudentInvocationHandler(T target) {
        this.target = target;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        // 这里可以对被调用的对象进行预处理。
        System.out.println("动态代理对象执行了invoke方法");
        // todo 注意，这里会调用被代理的对象的所有方法？
        Object result = method.invoke(target, args);
        return result;
    }
}

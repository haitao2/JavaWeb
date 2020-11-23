package com.lht.studay.core.proxy;

/**
 * 代理对象(班长)和被代理对象(学生)都需要实现该接口
 * 好处就是可以在不修改被代理对象的前提下，代理对象对被代理对象进行一些预处理和一些过滤等操作。
 */
public interface Person {
    void getMoney();
    void start();
}

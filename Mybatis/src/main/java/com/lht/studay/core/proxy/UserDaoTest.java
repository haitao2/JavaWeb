package com.lht.studay.core.proxy;

/**
 * 静态代理，可以在不修改目标方法的前提下，增强目标方法
 * 通过代理对象，调用目标方法。
 */
public class UserDaoTest {
    public static void main(String[] args) {
        IUserDao target = new UserDao();
        // 给目标对象创建动态代理对象,使用动态代理模式，给target创建动态代理对象。
        IUserDao proxy = (IUserDao) new ProxyFactory(target).getProxyInstance();
        proxy.save();
    }
}

package com.lht.studay.core.proxy;

/**
 * 目标对象
 */
public class UserDao implements IUserDao{
    public void save() {
        System.out.println("执行了目标对象的save方法");
    }
}

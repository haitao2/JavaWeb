package com.lht.studay.core.proxy;


/**
 * 静态代理对象
 * 通过调用代理对象进而调用目标对象
 */
public class ProxyUserDao implements IUserDao {
    private IUserDao target;

    public ProxyUserDao(IUserDao target) {
        this.target = target;
    }

    public void save() {
        System.out.println("开始事务");
        target.save();
        System.out.println("结束事务");
    }
}

package com.lht.studay.core.design;

public interface SqlSession {
    <T> T getMapper(Class<T> daoInterfaceClass);
}

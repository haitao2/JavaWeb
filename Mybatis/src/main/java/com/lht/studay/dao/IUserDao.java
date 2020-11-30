package com.lht.studay.dao;

import com.lht.studay.domain.User;

import java.util.List;

public interface IUserDao {
    List<User> findAll();
    List<User> findAll2();
    List<User> findAll3();
}

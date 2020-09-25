package com.lht.studay.dao;

import com.lht.studay.domain.Test;

import java.util.List;


public interface ITestDao {
    List<Test> findAll();
}

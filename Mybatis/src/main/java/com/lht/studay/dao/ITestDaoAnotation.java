package com.lht.studay.dao;

import com.lht.studay.domain.Test;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * 使用注解的方式进行配置,不需要配置ITestDaoAnotation.xml配置文件，直接在注解中进行配置sql。
 */
public interface ITestDaoAnotation {
    @Select("select * from test")
    List<Test> findAll();
}

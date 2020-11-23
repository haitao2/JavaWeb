package com.lht.studay.dao;

import com.lht.studay.domain.QueryVo;
import com.lht.studay.domain.Test;

import java.util.List;


public interface ITestDao {
    /**
     * 查询所有Test对象
     *
     * @return List<Test>
     */
//    @Select("select * from test")
    List<Test> findAll();

    /**
     * 保存Test对象
     *
     * @param user
     */

    void saveTest(Test user);

    /**
     * 按照id进行查找
     */
    Test findById(int id);

    /**
     * 动态sql之where if
     */
    List<Test> findByTest(Test user);
    /**
     * 动态sql之foreach
     */
    List<Test> findByIds(QueryVo vo);
    /**
     * 联合查询
     */
}

package com.lht.studay;

import com.lht.studay.dao.ITestDao;
import com.lht.studay.dao.ITestDaoAnotation;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;
import java.util.List;

public class Test {
    public static void main(String[] args) throws Exception {
        // 1.读取配置文件
        InputStream inputStream = Resources.getResourceAsStream("SqlMapConfig.xml");
        // 2.创建按sqlSessionFactory对象
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = builder.build(inputStream);
        // 3.使用工厂生成sqlSession对象
        SqlSession session = factory.openSession();
        // 4.使用sqlSession创建Dao接口的代理对象
        ITestDaoAnotation testDao = session.getMapper(ITestDaoAnotation.class);
        // 5.使用代理对象执行方法
        List<com.lht.studay.domain.Test> testDaoList = testDao.findAll();
        for (com.lht.studay.domain.Test test : testDaoList) {
            System.out.println(test);
        }
        // 6.释放资源。
        session.close();
        inputStream.close();

    }
}

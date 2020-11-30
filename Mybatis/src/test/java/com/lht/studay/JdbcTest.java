package com.lht.studay;

import com.lht.studay.dao.ITestDao;
import com.lht.studay.dao.IUserDao;
import com.lht.studay.domain.QueryVo;
import com.lht.studay.domain.Test;
import com.lht.studay.domain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class JdbcTest {
    /*    public static void main(String[] args) throws Exception {
            // 1.读取配置文件
            InputStream inputStream = Resources.getResourceAsStream("SqlMapConfig.xml");
            // 2.创建按sqlSessionFactory对象
            SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
            SqlSessionFactory factory = builder.build(inputStream);
            // 3.使用工厂生成sqlSession对象
            SqlSession session = factory.openSession();
            // 4.使用sqlSession创建Dao接口的代理对象
            ITestDao testDao = session.getMapper(ITestDao.class);
            // 5.使用代理对象执行方法
            List<com.lht.studay.domain.Test> testDaoList = testDao.findAll();
            for (com.lht.studay.domain.Test test : testDaoList) {
                System.out.println(test);
            }
            // 6.释放资源。
            session.close();
            inputStream.close();
        }*/
    private InputStream inputStream;
    private SqlSessionFactory factory;
    private SqlSession session;
    private ITestDao iTestDao;
    private IUserDao iUserDao;

    @Before
    public void init() throws Exception {
        inputStream = Resources.getResourceAsStream("SqlMapConfig.xml");
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        factory = builder.build(inputStream);
        //openSession(true)为自动提交，不需要进行session.commit();
        session = factory.openSession(true);
        //session = factory.openSession();
        //iTestDao = session.getMapper(ITestDao.class);
        iUserDao=session.getMapper(IUserDao.class);
    }

    @After
    public void destroy() throws Exception {
        //提交事务
        session.commit();
        session.close();
        inputStream.close();
    }

    @org.junit.Test
    public void testInsert() {
        Test user = new Test();
        user.setId(12211);
        user.setAge(12);
        user.setScore3(12);
        user.setScore5(12);
        iTestDao.saveTest(user);
    }

    @org.junit.Test
    public void testSelectById() {
        System.out.println(iTestDao.findById(12211).getScore3());
    }

    @org.junit.Test
    public void testFindByUser() {
        Test test = new Test();
        test.setAge(123);
        for (Test test1 : iTestDao.findByTest(test)) {
            System.out.println(test1.getId());
            System.out.println(test1.getScore3());
        }
    }

    @org.junit.Test
    public void testFindByIds() {
        QueryVo vo = new QueryVo();
        List<Integer> ids = new ArrayList<Integer>();
        ids.add(1);
        ids.add(2);
        ids.add(3);
        ids.add(4);
        ids.add(5);
        vo.setIds(ids);
        for (Test test1 : iTestDao.findByIds(vo)) {
            System.out.println(test1.getId());
        }
    }

    /**
     * 一对一(多对一)
     */
    @org.junit.Test
    public void testFindAll(){
        iUserDao.findAll();
        for (User user:iUserDao.findAll()){
            //System.out.println(user.getTest().getAge());
            //System.out.println(user.getName());
        }
    }

    /**
     * 一对多
     */
    @org.junit.Test
    public void testFindAll2(){
        for (User user:iUserDao.findAll2()){
            System.out.println(user.getName());
        }
    }

    /**
     * 一对一懒加载
     */
    @org.junit.Test
    public void testFindAll3(){
        for (User user:iUserDao.findAll3()){
            System.out.println(user.getUId()
            );
            //System.out.println(user.getList().get(0).getId());
        }
    }
}

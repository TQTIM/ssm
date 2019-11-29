package com.tq.test;

import com.tq.dao.AccountDao;
import com.tq.domain.Account;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.InputStream;
import java.util.List;


public class TestMybatis {
    /**
     * 测试查询所有
     * @throws Exception
     */
    @Test
    public void run1() throws Exception {
        //加载mybatis配置文件
        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
        //创建工厂对象
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
        //创建sqlsession对象
        SqlSession sqlSession = factory.openSession();
        //获取代理对象
        AccountDao dao = sqlSession.getMapper(AccountDao.class);
        //查询所有数据
        List<Account> accounts = dao.findAll();
        for (Account account :
                accounts) {
            System.out.println(account);
        }
//        关闭资源
        sqlSession.close();
        in.close();

    }

    /**
     * 测试增加操作
     * @throws Exception
     */
    @Test
    public void run2() throws Exception {
        //加载mybatis配置文件
        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
        //创建工厂对象
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
        //创建sqlsession对象
        SqlSession sqlSession = factory.openSession();
        //获取代理对象
        AccountDao dao = sqlSession.getMapper(AccountDao.class);
        Account account = new Account();
        account.setName("熊大");
        account.setMoney(1300d);
        //增加操作
        dao.saveAccount(account);
        //除查询，记得提交事务
        sqlSession.commit();
//        关闭资源
        sqlSession.close();
        in.close();

    }

}

package com.tq.dao;

import com.tq.domain.Account;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository //类交给spring管，整合mybatis，注入到service
public interface AccountDao {
    /*//查询所有账户
    public List<Account> findAll();
    //保存账户信息
    public void saveAccount();*/

    //查询所有账户--用到mybatis注解方式
    @Select("select * from account")
    public List<Account> findAll();
    //保存账户信息
    @Insert("insert into account (name,money) values(#{name},#{money})")
    public void saveAccount(Account account);
}

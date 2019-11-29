package com.tq.service.Impl;

import com.tq.dao.AccountDao;
import com.tq.domain.Account;
import com.tq.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("accountService")
public class AccountServiceImpl implements AccountService {

    @Autowired//注入对象
    private AccountDao accountDao;

    @Override
    public List<Account> findAll() {
        System.out.println("业务层，查询所有账户..");
        return accountDao.findAll();
    }

    @Override
    public void saveAccount(Account account) {
        System.out.println("业务层，保存账户信息..");
        accountDao.saveAccount(account);
    }
}

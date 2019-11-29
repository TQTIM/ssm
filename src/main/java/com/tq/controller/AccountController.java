package com.tq.controller;

import com.tq.domain.Account;
import com.tq.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * web层 账户控制器
 */
@Controller
@RequestMapping("/account")
public class AccountController {

    @Autowired //注入对象
    private AccountService accountService;

    /**
     * 查询
     * @param model
     * @return
     */
    @RequestMapping("/findAll")
    public String findAll(Model model) {
        System.out.println("表现层，查询所有账户信息");
//        调用AccountServiceImpl的方法
        List<Account> accounts = accountService.findAll();
        model.addAttribute("accounts",accounts);//用model接收数据，传给list.jsp页面
        return "list";
    }
    /**
     * 保存
     * @return
     */
    @RequestMapping("/save")
    public void save(Account account, HttpServletRequest request, HttpServletResponse response) throws IOException {
        accountService.saveAccount(account);
        response.sendRedirect(request.getContextPath()+"/account/findAll");//重定向到findAll方法
        return;
    }

}

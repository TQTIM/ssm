package com.tq.test;

import com.tq.service.AccountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    @Test
    public void run1() {
        //加载配置文件
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        //获取对象
        AccountService as= (AccountService) context.getBean("accountService");
        as.findAll();
    }


}

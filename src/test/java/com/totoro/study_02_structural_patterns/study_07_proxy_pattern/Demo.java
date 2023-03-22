package com.totoro.study_02_structural_patterns.study_07_proxy_pattern;

import com.totoro.proxy.UserDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextLoader;
import org.springframework.web.context.support.WebApplicationContextUtils;

/**
 * @author:totoro
 * @createDate:2023/3/22
 * @description:
 */
public class Demo {

    public static void main(String[] args) {

        BeanFactory beanFactory = new ClassPathXmlApplicationContext("spring-config.xml");

        UserDao userDao = beanFactory.getBean("userDao", UserDao.class);
        String s = userDao.queryUserInfo("10000");
        System.out.println(s);

    }



}

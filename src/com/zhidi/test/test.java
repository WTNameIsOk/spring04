package com.zhidi.test;

import com.zhidi.entity.Emp;
import com.zhidi.service.EmpService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Administrator on 2017/7/14.
 */
public class test {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        EmpService bean = context.getBean(EmpService.class);
        Emp emp = bean.get(7370);
        System.out.println(emp.getEname());
    }
}

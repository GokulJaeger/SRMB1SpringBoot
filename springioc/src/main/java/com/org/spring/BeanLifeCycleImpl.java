package com.org.spring;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleImpl {
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
  
        BeanLifeCycle obj = (BeanLifeCycle) context.getBean("msg");
        obj.getMessage();
        context.registerShutdownHook();
     }
}

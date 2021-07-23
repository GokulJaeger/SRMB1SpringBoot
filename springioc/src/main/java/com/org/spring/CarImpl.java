package com.org.spring;

import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CarImpl {
    public static void main(String[] args) {
        
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");

        //Spring IOC
        Car ca = (Car) context.getBean("c1");

        System.out.println("=====Init=====\n" + ca);
         
        System.out.println("=====Features=====\n" + ca.getCarStutus().getCstats().toString());
        
        //Spring Dependency Injection
        System.out.println("=====Delivery Status=====\n" + ca.getCarStutus().getCstatus());
        // Car cb = (Car) context.getBean("car");

        // System.out.println("=====Init=====\n" + cb);
        // Car cc = (Car) context.getBean("car");

        // System.out.println("=====Init=====\n" + cc);
    }
}

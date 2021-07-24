package com.org.spring;

import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CarImpl {
    public static void main(String[] args) {
        
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");

        //Spring IOC
        Car ca = (Car) context.getBean("c1");
        System.out.println("========================================================================================\n");

        System.out.println("=====Init=====\n" + ca);
         
        System.out.println("=====(Collections)Features:=====\n" + ca.getCarStutus().getCstats().toString());
        
        //Spring Dependency Injection
        System.out.println("=====Delivery Status=====\n" + ca.getCarStutus().getCstatus());
        // Car cb = (Car) context.getBean("car");

        // System.out.println("=====Init=====\n" + cb);
        // Car cc = (Car) context.getBean("car");

        // System.out.println("=====Init=====\n" + cc);
        
        System.out.println("========================================================================================\n");
        
        System.out.println("Prototype\n");
        Employee empA = (Employee)context.getBean("empl");
    	empA.setFname("Employee Gokul");
    	System.out.println("Message : " + empA.getFname());
    	
    	//retrieve it again
    	Employee empB = (Employee)context.getBean("empl");
    	System.out.println("Message : " + empB.getFname());
    	
    	System.out.println("========================================================================================\n");
    	System.out.println("SingleTon\n");
    	Student stA = (Student)context.getBean("stud");
    	stA.setSname("Student Gokul");
    	System.out.println("Message : " + stA.getSname());
    	
    	//retrieve it again
    	Student stB = (Student)context.getBean("stud");
    	System.out.println("Message : " + stB.getSname());
    }
}

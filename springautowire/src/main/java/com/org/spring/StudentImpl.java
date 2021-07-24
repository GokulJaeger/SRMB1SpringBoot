//package com.org.spring;
//
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;
//
//public class StudentImpl {
//
//	public static void main(String[] args) {
//		ApplicationContext context = 
//		    	 new ClassPathXmlApplicationContext("bean.xml");
//
//		    	Student stA = (Student)context.getBean("stud");
//		    	stA.setSname("Student Gokul");
//		    	System.out.println("Message : " + stA.getSname());
//		    	
//		    	//retrieve it again
//		    	Student stB = (Student)context.getBean("stud");
//		    	System.out.println("Message : " + stB.getSname());
//
//	}
//
//}

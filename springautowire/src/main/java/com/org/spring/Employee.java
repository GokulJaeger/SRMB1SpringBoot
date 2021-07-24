package com.org.spring;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope("prototype")
public class Employee {
	String fname;
	public Employee(String mam) {
		System.out.println("Constructor...." + mam);
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}

	
}

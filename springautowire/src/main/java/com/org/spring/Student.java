package com.org.spring;

public class Student {
	String sname;
	public Student(String nan) {
		System.out.println("Constructor...." + nan);
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}
    
    
}

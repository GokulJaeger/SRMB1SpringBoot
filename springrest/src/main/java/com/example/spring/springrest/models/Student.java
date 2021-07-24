package com.example.spring.springrest.models;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Student {
    private int sid;

    private String sname;
    
    private String city;

    @JsonFormat(pattern="yyyy-mm-dd")
    private Date dob;

    public int getSid() {
        return sid;
    }
    public void setSid(int sid) {
        this.sid = sid;
    }
    public String getSname() {
        return sname;
    }
    public void setSname(String sname) {
        this.sname = sname;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public Date getDob() {
        return dob;
    }
    public void setDob(Date dob) {
        this.dob = dob;
    }
    

}

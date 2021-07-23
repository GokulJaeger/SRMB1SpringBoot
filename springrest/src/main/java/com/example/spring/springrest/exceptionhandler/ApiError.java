package com.example.spring.springrest.exceptionhandler;

import java.util.Date;

public class ApiError {
    private String msg;
    private String id;
    private String errorcode;
    private String category;
    private Date dt;
    public String getMsg() {
        return msg;
    }
    public void setMsg(String msg) {
        this.msg = msg;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getErrorcode() {
        return errorcode;
    }
    public void setErrorcode(String errorcode) {
        this.errorcode = errorcode;
    }
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    public Date getDt() {
        return dt;
    }
    public void setDt(Date dt) {
        this.dt = dt;
    }
    
    
}

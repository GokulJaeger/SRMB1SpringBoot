package com.org.spring;

public class Car {
    private int cid;
    private String cname;
    private String cmodel;
    private String cprice;
    
    private CarDelivery carStutus;

    

	public CarDelivery getCarStutus() {
		return carStutus;
	}

	public void setCarStutus(CarDelivery carStutus) {
		this.carStutus = carStutus;
	}

	public Car( String owner) {
        System.out.println("=====Car Constructor Called....." + owner);
    }

    public int getCid() {
        return cid;
    }
    public void setCid(int cid) {
        this.cid = cid;
    }
    public String getCname() {
        return cname;
    }
    public void setCname(String cname) {
        this.cname = cname;
    }
    public String getCmodel() {
        return cmodel;
    }
    public void setCmodel(String cmodel) {
        this.cmodel = cmodel;
    }
    public String getCprice() {
        return cprice;
    }
    public void setCprice(String cprice) {
        this.cprice = cprice;
    }

    @Override
    public String toString() {
        return "Car [cid=" + cid + ", cmodel=" + cmodel + ", cname=" + cname + ", cprice=" + cprice + "]";
    }

    
}

package com.org.spring;

import java.util.List;

public class CarDelivery {
    private String cstatus;
    
    //Spring Collections
    private List cstats;

    public CarDelivery(String deliv) {
        System.out.println("=====Car Delivery Status......." + deliv);
    }

	public String getCstatus() {
		return cstatus;
	}

	public void setCstatus(String cstatus) {
		this.cstatus = cstatus;
	}

	public List getCstats() {
		return cstats;
	}

	public void setCstats(List cstats) {
		this.cstats = cstats;
	}
    
    
     
}

package com.springcore.lifecycle;

import org.springframework.beans.factory.InitializingBean;
public class Pepsi implements InitializingBean{
    private double price;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Pepsi(double price) {
        this.price = price;
    }

    public Pepsi() {
    }

    @Override
    public String toString() {
        return "Pepsi [price=" + this.price + "]";
    }

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("hello i am taking pepsi");
	}

}


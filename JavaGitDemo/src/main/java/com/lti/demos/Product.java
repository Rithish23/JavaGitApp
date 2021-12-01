package com.lti.demos;

public class Product {
    int id;
    String prdName;
	public Product(int id, String prdName) {
		super();
		this.id = id;
		this.prdName = prdName;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", prdName=" + prdName + "]";
	}
    
}

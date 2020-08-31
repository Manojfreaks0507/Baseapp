package com.product.crudapp.model;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Product {
    @org.springframework.data.annotation.Id
    @Id
	private  double id;
	private String name;
	private double phone;
	private String desc;
	private String med;
	
	
	
	
	
	public Product() {
	}
	
	public Product(double id, String name, String desc, double phone, String med) {
		super();
		this.id = id;
		this.name = name;
		this.phone= phone;
		this.desc = desc;
		this.med = med;
	}
	
	

	public double getId() {
		return id;
	}
	public void setId(double id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public double getPhone() {
		return phone;
	}

	public void setPhone(double phone) {
		this.phone = phone;
	}

	public String getMed() {
		return med;
	}

	public void setMed(String med) {
		this.med = med;
	}
	
	
}

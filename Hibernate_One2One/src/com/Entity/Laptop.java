package com.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Laptop {
	
	@Id
	private int lid;
	private String Brand;
	public int getLid() {
		return lid;
	}
	public void setLid(int lid) {
		this.lid = lid;
	}
	public String getBrand() {
		return Brand;
	}
	public void setBrand(String brand) {
		Brand = brand;
	}
	@Override
	public String toString() {
		return "Laptop [lid=" + lid + ", Brand=" + Brand + "]";
	}
	public Laptop(int lid, String brand) {
		super();
		this.lid = lid;
		Brand = brand;
	}
	public Laptop() {
//		super();
		// TODO Auto-generated constructor stub
	}
	
	

}

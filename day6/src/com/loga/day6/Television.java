package com.loga.day6;

import java.util.ArrayList;
import java.util.Objects;

public class Television {
	
	private String company;
	@Override
	public boolean equals(Object obj) {
		if(this==obj)
			return true;
		if(obj==null)
			return false;
		if(this.getClass()!=obj.getClass())
			return false;
		
		Television c2=(Television)obj;
		return this.company==c2.company && this.type == c2.type && this.price == c2.price;
	}
	@Override
	public int hashCode() {
		return Objects.hash(company,type,price);
	}

	private String type;
	private String threeD;
	
	@Override
	public String toString() {
		return "Television [company=" + company + ", type=" + type + ", threeD=" + threeD + ", price=" + price + "]";
	}

	private String price;
	
	public String getCompany() {
		return company;
	}

	public String getType() {
		return type;
	}

	public String getThreeD() {
		return threeD;
	}

	public String getPrice() {
		return price;
	}

	
	public Television(String company, String type, String threeD, String price) {
		super();
		this.company = company;
		this.type = type;
		this.threeD = threeD;
		this.price = price;
	}

	public static void printAll(ArrayList<Television> televisioncollection) {
		// TODO Auto-generated method stub
		
	}
	
	

}

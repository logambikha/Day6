package com.loga.day6;

import java.util.ArrayList;
import java.util.Objects;

public class CellPhone {
	
	@Override
	public String toString() {
		return "CellPhone [company=" + company + ", model=" + model + ", description=" + description
				+ ", operatingSystem=" + operatingSystem + ", price=" + price + "]";
	}

	
	private String company;
	private String model;
	private String description;
	private String operatingSystem;
	private String price;
	
	public String getCompany() {
		return company;
	}

	public String getModel() {
		return model;
	}

	public String getDescription() {
		return description;
	}

	public String getOperatingSystem() {
		return operatingSystem;
	}

	public String getPrice() {
		return price;
	}

	@Override
	public boolean equals(Object obj) {
		if(this==obj)
			return true;
		if(obj==null)
			return false;
		if(this.getClass()!=obj.getClass())
			return false;
		
		CellPhone c2=(CellPhone)obj;
		return this.company==c2.company && this.model == c2.model && this.operatingSystem == c2.operatingSystem;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(company,model,operatingSystem);
	}


	
	public CellPhone(String company, String model, String description, String operatingSystem, String price) {
		super();
		this.company = company;
		this.model = model;
		this.description = description;
		this.operatingSystem = operatingSystem;
		this.price = price;
	}

	public static void printAll(ArrayList<CellPhone> cellPhonecollection) {
		// TODO Auto-generated method stub
		
	}

}

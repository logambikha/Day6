package com.loga.day6;

import java.util.ArrayList;
import java.util.Objects;

public class Laptop {
	
	@Override
	public String toString() {
		return "Laptop [company=" + company + ", model=" + model + ", operatimgSystem=" + operatimgSystem
				+ ", processor=" + processor + "]";
	}


	private String company;
	private String model;
	private String operatimgSystem;
	private String processor;
	
	
	
	@Override
	public boolean equals(Object obj) {
		if(this==obj)
			return true;
		if(obj==null)
			return false;
		if(this.getClass()!=obj.getClass())
			return false;
		
		Laptop c2=(Laptop)obj;
		return this.company==c2.company && this.model == c2.model;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(company,model);
	}



	
	public String getCompany() {
		return company;
	}


	public String getModel() {
		return model;
	}


	public String getOperatimgSystem() {
		return operatimgSystem;
	}


	public String getProcessor() {
		return processor;
	}


	
	
	public Laptop(String company, String model, String operatimgSystem, String processor) {
		super();
		this.company = company;
		this.model = model;
		this.operatimgSystem = operatimgSystem;
		this.processor = processor;
	}


	public static void printAll(ArrayList<Laptop> laptopcollection) {
		// TODO Auto-generated method stub
		
	}

}

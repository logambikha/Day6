package com.loga.day6;

import java.util.ArrayList;
import java.util.Objects;

public class Car implements Comparable<Car> {
	
	private String make;
	private String model;
	private int year;
	
	@Override
	public boolean equals(Object obj) {
		if(this==obj)
			return true;
		if(obj==null)
			return false;
		if(this.getClass()!=obj.getClass())
			return false;
		
		Car c2=(Car)obj;
		return this.make==c2.make && this.model == c2.model;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(make,model);
	}


	@Override
	public String toString() {
		return "Car [make=" + make + ", model=" + model + ", year=" + year + ", price=" + price + "]";
	}


	private int price;
	
	public String getMake() {
		return make;
	}


	public String getModel() {
		return model;
	}


	public int getYear() {
		return year;
	}


	public int getPrice() {
		return price;
	}


	
	
	public Car(String make, String model,int year, int price) {
		super();
		this.make = make;
		this.model = model;
		this.year = year;
		this.price = price;
	}


	public static void printAll(ArrayList<Car> carcollection) {
		// TODO Auto-generated method stub
	}
	@Override
	public int compareTo(Car o) {
	return this.make.compareTo(o.make);
	
}

	

	
	}


		
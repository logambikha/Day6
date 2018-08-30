package com.loga.day6;

import java.util.Objects;

public class Camera {
	private String model;
	private double price;
	private String brand;
	public Camera() {
		super();
	}
	public Camera(String model, double price, String brand) {
		super();
		this.model = model;
		this.price = price;
		this.brand = brand;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModel() {
		return model;
	}
	public double getPrice() {
		return price;
	}
	public String getBrand() {
		return brand;
	}
	@Override
	public String toString() {
		return "Camera [model=" + model + ", price=" + price + ", brand=" + brand + "]";
	}
	@Override
	public boolean equals(Object obj) {
		if(this==obj)
			return true;
		if(obj==null)
			return false;
		if(this.getClass()!=obj.getClass())
			return false;
		Camera c2=(Camera)obj;
		return this.brand==c2.brand && this.model == c2.model && this.price == c2.price;
	}
	@Override
	public int hashCode() {
		return Objects.hash(brand,price,model);
	}
}

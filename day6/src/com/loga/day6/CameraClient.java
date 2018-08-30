package com.loga.day6;

import java.util.HashSet;

public class CameraClient {
	public static void main(String [] args) {
		HashSet<Camera>products=new HashSet<>();
		
		products.add(new Camera("NK2334",5000,"NIKON"));
		products.add(new Camera("CN2334",8000,"CANON"));
		
		for(Camera c : products) {
			System.out.println(c.toString());
		}
	}

}

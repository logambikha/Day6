package com.loga.day6.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import com.loga.day6.Car;
import com.loga.day6.CellPhone;
import com.loga.day6.Laptop;
import com.loga.day6.School;
import com.loga.day6.Television;

class CollectionTest {
	
	@Test
	void testLaptop() {
		ArrayList<Laptop> laptops = new ArrayList<>();
		
		assertEquals(true, laptops.add(new Laptop("Dell", "Inspiron5558", "Windows 8", "i5")));
		laptops.add(new Laptop("HP", "HP234", "Windows 10", "i3"));
		laptops.add(new Laptop("HP", "HP677", "Windows 10", "i7"));
		
		assertEquals(3, laptops.size());
		System.out.println(laptops);
	}
	
	@Test
	void testCar() {
		ArrayList<Car> Cars = new ArrayList<>();
		
		assertEquals(true, Cars.add(new Car("BMW","A1",2016,100000)));
		Cars.add(new Car("AUDI", "A", 2011, 450000));
		Cars.add(new Car("HONDA", "B", 2010, 740000));
		
		assertEquals(3, Cars.size());
		System.out.println(Cars);
	}
	

	@Test
	void testTelevision() {
		ArrayList<Television> Televisions = new ArrayList<>();
		
		assertEquals(true, Televisions.add(new Television("SONY","LCD","2012","30000")));
		Televisions.add(new Television("LG", "LED", "2011", "450000"));
		Televisions.add(new Television("SAMSUNG", "PLASMA", "2010", "740000"));
		
		assertEquals(3, Televisions.size());
		System.out.println(Televisions);
	}
	
	@Test
	void testCellPhone() {
		ArrayList<CellPhone> CellPhones = new ArrayList<>();
		
		assertEquals(true, CellPhones.add(new CellPhone("Sony","Z7645","SmartPhone","Android 6.0","17000")));
		CellPhones.add(new CellPhone("NOKIA","C202","SmartPhone","LINUX","15000"));
		CellPhones.add(new CellPhone("LAVA","LV08","SmartPhone","WINDOWS","21000"));
		
		assertEquals(3, CellPhones.size());
		System.out.println(CellPhones.toString());
	}
	
	@Test
	void testSchool() {
		ArrayList<School> Schools = new ArrayList<>();
		
		assertEquals(true, Schools.add(new School("ABC","Salem","Salem","2")));
		Schools.add(new School("AHGF","Chennai","Chennai","4"));
		Schools.add(new School("LKUJU","Erode","Erode","3"));
		
		assertEquals(3, Schools.size());
		System.out.println(Schools);
	}
	


	
	
	
	
	

}

package com.loga.day6.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashSet;

import org.junit.jupiter.api.Test;

import com.loga.day6.Car;
import com.loga.day6.CellPhone;
import com.loga.day6.Laptop;
import com.loga.day6.School;
import com.loga.day6.Television;

class CollectTest {

	@Test
	void testLaptop() {
		HashSet<Laptop> laptops = new HashSet<>();
		
		assertEquals(true, laptops.add(new Laptop("Dell", "Inspiron5558", "Windows 8", "i5")));
		laptops.add(new Laptop("HP", "HP677", "Windows 10", "i7"));
		laptops.add(new Laptop("HP", "HP677", "Windows 10", "i7"));
		
		assertEquals(2, laptops.size());
		System.out.println(laptops);
	}
	
	
	@Test
	void testCar() {
		HashSet<Car> Cars = new HashSet<>();
		
		assertEquals(true, Cars.add(new Car("AUDI", "A", 2011, 450000)));
		Cars.add(new Car("AUDI", "A", 2011, 450000));
		Cars.add(new Car("HONDA", "B", 2010, 740000));
		
		assertEquals(2, Cars.size());
		System.out.println(Cars);
	}
	
	
	@Test
	void testTelevision() {
		HashSet<Television> Televisions = new HashSet<>();
		
		assertEquals(true, Televisions.add(new Television("LG", "LED", "2011", "450000")));
		Televisions.add(new Television("LG", "LED", "2011", "450000"));
		Televisions.add(new Television("SAMSUNG", "PLASMA", "2010", "740000"));
		
		assertEquals(2, Televisions.size());
		System.out.println(Televisions);
	}
	
	@Test
	void testCellPhone() {
		HashSet<CellPhone> CellPhones = new HashSet<>();
		
		assertEquals(true, CellPhones.add(new CellPhone("Sony","Z7645","SmartPhone","Android 6.0","17000")));
		CellPhones.add(new CellPhone("NOKIA","C202","SmartPhone","LINUX","15000"));
		CellPhones.add(new CellPhone("LAVA","LV08","SmartPhone","WINDOWS","21000"));
		CellPhones.add(new CellPhone("LAVA","LV08","SmartPhone","WINDOWS","21000"));
		
		assertEquals(3, CellPhones.size());
		System.out.println(CellPhones.toString());
	}
	
	@Test
	void testSchool() {
		HashSet<School> Schools = new HashSet<>();
		
		assertEquals(true, Schools.add(new School("ABC","Salem","Salem","2")));
		Schools.add(new School("AHGF","Chennai","Chennai","4"));
		Schools.add(new School("LKUJU","Erode","Erode","3"));
		Schools.add(new School("AHGF","Chennai","Chennai","4"));
		assertEquals(3, Schools.size());
		System.out.println(Schools);
	}
	

}

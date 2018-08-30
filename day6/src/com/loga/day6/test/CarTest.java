package com.loga.day6.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.TreeSet;

import org.junit.jupiter.api.Test;

import com.loga.day6.Car;


class CarTest {

	@Test
	void testCar() {
		TreeSet<Car> car = new TreeSet<>();
		assertEquals(true, car.add(new Car("BMW","A1",2016,100000)));
		assertEquals(true, car.add(new Car("AUDI", "A", 2011, 450000)));
		assertEquals(true, car.add(new Car("HONDA", "B", 2010, 740000)));
		
		
		
		for(Car a: car)
			System.out.println(a);
	}
	}



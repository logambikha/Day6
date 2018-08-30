package com.loga.day6.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import com.loga.day6.Student;

class StudentTest {

	@Test
	void testStudent() {
		Student student1=new Student("Abi");
		Student student2=new Student("Ram");
		Student student3=new Student("Raj");
		ArrayList<Student> student = new ArrayList<>();
		student.add(student1);
		student.add(student2);
		student.add(student3);
		
		assertEquals(student1, student.get(0));
		assertEquals(student2, student.get(1));
		assertEquals(student3, student.get(2));
		
		for(Student a:student)
			System.out.println(a);
	}
	}



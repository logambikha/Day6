package com.loga.day6.test;

import java.util.TreeSet;

import org.junit.jupiter.api.Test;

import com.loga.day6.Student;

class StudentTest1 {

	@Test
	void testStudent() {
		Student student1=new Student("Abi");
		Student student2=new Student("Ram");
		Student student3=new Student("Raj");
		
		TreeSet<Student> student = new TreeSet<>();
		
		student.add(student1);
		student.add(student2);
		student.add(student3);
		
		for(Student a:student)
			System.out.println(a);
	}

}

package com.loga.day6;

import java.util.ArrayList;
import java.util.Objects;

public class School {
	@Override
	public String toString() {
		return "School [name=" + name + ", city=" + city + ", schoolDistrict=" + schoolDistrict
				+ ", greatSchoolRanking=" + greatSchoolRanking + "]";
	}

	private String name;
	private String city;
	private String schoolDistrict;
	private String greatSchoolRanking;

	public String getName() {
		return name;
	}

	public String getCity() {
		return city;
	}

	@Override
	public boolean equals(Object obj) {
		if(this==obj)
			return true;
		if(obj==null)
			return false;
		if(this.getClass()!=obj.getClass())
			return false;
		
		School c2=(School)obj;
		return this.name==c2.name && this.city == c2.city && this.schoolDistrict==c2.schoolDistrict;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name,city,schoolDistrict);
	}



	public String getSchoolDistrict() {
		return schoolDistrict;
	}

	public String getGreatSchoolRanking() {
		return greatSchoolRanking;
	}

	public School(String name, String city, String schoolDistrict, String greatSchoolRanking) {
		super();
		this.name = name;
		this.city = city;
		this.schoolDistrict = schoolDistrict;
		this.greatSchoolRanking = greatSchoolRanking;
	}

	public static void printAll(ArrayList<School> schoolcollection) {
		// TODO Auto-generated method stub
		
	}
}

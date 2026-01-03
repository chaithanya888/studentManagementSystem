package com.college.model;

public class Person {
	private String name;
	private int age;
	private long contactNumber;
	
	
	public Person(String name,int age,long contactNumber) {
		this.name=name;
		this.age=age;
		this.contactNumber=contactNumber;
	}
	

	public String getName() {
		return name;
	}
	public void setName( String name) {
		this.name=name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age=age;
	}
	public long getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(long contactNumber) {
		this.contactNumber=contactNumber;
	}
}

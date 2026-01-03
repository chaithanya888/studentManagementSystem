package com.college.model;

public class Student extends Person{

	private int studentId;
	private String department;
	private String coursename;
	
	public Student(String name,int age,long contactNumber,int studentId, String department,String coursename) {
		super(name,age,contactNumber);
		this.studentId=studentId;
		this.department=department;
		this.coursename=coursename;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getCoursename() {
		return coursename;
	}

	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}

	
	public void studentDetails() {
		System.out.println("Student: "+studentId); 
		System.out.println("Department: "+department); 
	    System.out.println("CourseName:"+coursename);	
	    
	}
}

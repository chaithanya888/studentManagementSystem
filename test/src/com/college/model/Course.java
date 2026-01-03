package com.college.model;

public class Course {

	private int courseCode;
	private String courseTitle;
	private double courseFee;
	
	
	public Course(int courseCode,String courseTitle,double courseFee) {
		this.courseCode=courseCode;
		this.courseTitle=courseTitle;
		this.courseFee=courseFee;
	}


	public int getCourseCode() {
		return courseCode;
	}


	public void setCourseCode(int courseCode) {
		this.courseCode = courseCode;
	}


	public String getCourseTitle() {
		return courseTitle;
	}


	public void setCourseTitel(String courseTitel) {
		this.courseTitle = courseTitel;
	}


	public double getCourseFee() {
		return courseFee;
	}


	public void setCourseFee(double courseFee) {
		this.courseFee = courseFee;
	}
	
}

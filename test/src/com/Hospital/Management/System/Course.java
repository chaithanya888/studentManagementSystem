package com.Hospital.Management.System;

public class Course {
private String courseName;
private int marks[]=new int[4];
public Course(String courseName, int[] marks) {
	super();
	this.courseName = courseName;
	this.marks = marks;
}
public String getCourseName() {
	return courseName;
}
public void setCourseName(String courseName) {
	this.courseName = courseName;
}
public int[] getMarks() {
	return marks;
}
public void setMarks(int[] marks) {
	this.marks = marks;
}

public int marksAverage() {
	int total=0;
	int count=0;
	for(int mark: marks) {
		total+=mark;
		count++;
	}
	return total/count;
}


}
